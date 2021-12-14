package generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String nameTeam;
    private List<T> participants = new ArrayList<>();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
    }
    public  void addNewParticipants(T participant){
        participants.add(participant);
        System.out.println("V komandu " + nameTeam + " bil dobavlen noviy " +
                "uchastnik po imeni " + participant.getName());
    }
    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i==0){
            winnerName =this.nameTeam;
        }
        else { winnerName =team.nameTeam;}
        System.out.println("Viygrala komanda " + winnerName);
    }
}
