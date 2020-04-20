import java.util.Scanner;

class EmployeeOperator {

    private int numberOfEmployees;
    private Employee[] employees;

    public EmployeeOperator(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
        employees = new Employee[numberOfEmployees];
    }

    void AddEmployee(){
        boolean vacancy = false;
        for (int i=0; i<employees.length; i++) {
            if (employees[i] == null) {
                System.out.println("Nowy pracownik ID:\t" + i);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj imię pracownika: ");
                String firstName = scanner.nextLine();
                System.out.println("Podaj nazwisko pracownika: ");
                String lastName = scanner.nextLine();
                System.out.println("Podaj wynagrodzenie pracownika (PLN): ");
                int salary = scanner.nextInt();
                employees[i] = new Employee();
                setEmployee(i,firstName,lastName,salary);
                vacancy = true;
                break;
            }
        }
        if(!vacancy) System.out.println("Brak wakatów");
    }

    public Employee getEmployee(int employeeId) {
        if(employeeId > 0 && employeeId < numberOfEmployees)
            return employees[employeeId];
        else{
            System.err.println("Błędne ID pracownika:\t" + employeeId);
            return null;
        }
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
