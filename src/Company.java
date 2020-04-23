class Company {
    public static void main(String[] args) {
        EmployeeOperator operator = new EmployeeOperator(2);
        //Stworz 3 pracowników
        Employee employee1 = operator.createEmployee();
        Employee employee2 = operator.createEmployee();
        Employee employee3 = operator.createEmployee();
        //Spróbuj dodać ich do firmy
        operator.addEmployee(employee1);
        operator.addEmployee(employee2);
        operator.addEmployee(employee3);
        //Policz wypłaty
        operator.showCompanyCost();
        //Wyswietl dane pracownika
        System.out.println(operator.getEmployee(1).toString());
        //wyświetli błąd - przekroczenie rozmiaru tablicy
        System.out.println(operator.getEmployee(2).toString());
    }
}
