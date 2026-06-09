package classes;

public class Main {
    public static void main(String[] args){
        // update performed
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(2, "beth", 10);
        Employee employee3 = new Employee(3, "Alex", 20);

        System.out.println("Employee  with employee Id " + employee1.getEmployeeId()  + " is  : " );
        System.out.println(employee1);

        System.out.println("Employee  with employee Id " + employee2.getEmployeeId()  + " is  : " );
        System.out.println(employee2);

        System.out.println("Employee  with employee Id " + employee3.getEmployeeId()  + " is  : " );
        System.out.println(employee3);
    }

}
