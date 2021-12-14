package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendAction = new ArrayList<>();
        friendAction.add(Action.NOJNICI);
        friendAction.add(Action.BUMAGA);
        friendAction.add(Action.NOJNICI);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Oleg", friendAction, exchanger);
        new BestFriend("Petr", friend2Action, exchanger);






    }
}
enum Action{
    KAMEN, NOJNICI, BUMAGA;
}
class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Action myAction, Action friendsAction){
        if ((myAction == Action.KAMEN && friendsAction == Action.NOJNICI) ||
                (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA) ||
                (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)){
            System.out.println(name + " with " + myAction.name() + " WINS!!!");
            System.out.println(friendsAction.name() + " LOST...");
        }
    }
    public void run(){
        Action replay;
        for (Action action:myActions){
            try {
                replay = exchanger.exchange(action);
                whoWins(action, replay);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}