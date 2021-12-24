package regex;

public class PrintfExample {
    static void employeeInfo(Employee employee){
        System.out.printf("%03d \t %-6s \t __%-6s \t %,.1f \n", employee.id, employee.name, employee.surname, employee.salary*(1 + employee.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Oleg", "Akulov", 789548, 0.223);
        Employee emp2 = new Employee(23, "Petr", "Ivanov", 65657, 0.1258);
        Employee emp3 = new Employee(123, "Luba", "Voromsb", 323525, 0.2636);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String newString = String.format("%03d \t NEW!!! %-6s \t %-6s \t %,.1f \n", 55, "Mikhail", "Sidorov", 559548*(1+ 0.223));
        System.out.println(newString);






    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonus;
    }


}
