import java.util.Scanner;

class EmployeeOperator {

    private int numberOfEmployees;
    private Employee[] employees = new Employee[2];

    public EmployeeOperator() {
        employees[0] = new Employee();
        employees[1] = new Employee();
    }

    void AddEmployee(int employeeNo){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię pracownika: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wynagrodzenie pracownika (PLN): ");
        int salary = scanner.nextInt();

        setEmployee(employeeNo,firstName,lastName,salary);
    }

    void showCompanyCost(){
        System.out.println("Firma ma kosztów stałych (w postaci pensji pracowników): " + sumOfSalaries());
    }

    private int sumOfSalaries(){
        int sum = 0;
        for(Employee emp: employees){
            sum += emp.getSalary();
        }
        return sum;
    }

    private void setEmployee(int employeeNo, String firstName, String lastName, int salary){
        employees[employeeNo].setFirstName(firstName);
        employees[employeeNo].setLastName(lastName);
        employees[employeeNo].setSalary(salary);
    }
}
