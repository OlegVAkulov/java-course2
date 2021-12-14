package generics.igra;

public class Test {
    public static void main(String [] args){
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Semen", 14);
        Schoolar schoolar4 = new Schoolar("Olga", 12);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Oleg", 44);
        Employee employee2 = new Employee("Mikhail", 33);

        Team<Schoolar> schoolarTeam = new Team<>("Dracony");
        schoolarTeam.addNewParticipants(schoolar1);
        schoolarTeam.addNewParticipants(schoolar2);
        //schoolarTeam.addNewParticipants(student2);

        Team <Student>studentTeam = new Team<>("Kony");
        studentTeam.addNewParticipants(student1);
        studentTeam.addNewParticipants(student2);

        Team <Employee>empTeam = new Team<>("Zavod");
        empTeam.addNewParticipants(employee1);
        empTeam.addNewParticipants(employee2);
 //       Team<String> stringTeam = new Team<>("String");
 //       stringTeam.addNewParticipants("Hello");

        Team<Schoolar> schoolarTeam2 = new Team<>("Metly");
        schoolarTeam2.addNewParticipants(schoolar3);
        schoolarTeam2.addNewParticipants(schoolar4);



        schoolarTeam.playWith(schoolarTeam2);
       // studentTeam.playWith(schoolarTeam);





    }
}
