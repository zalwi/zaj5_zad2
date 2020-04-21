class Company {
    public static void main(String[] args) {
        EmployeeOperator operator = new EmployeeOperator(2);
        //Stworz 3 pracowników
        Employee employee1 = operator.GetEmployeeInfo();
        Employee employee2 = operator.GetEmployeeInfo();
        Employee employee3 = operator.GetEmployeeInfo();
        //Spróbuj dodać ich do firmy
        operator.AddEmployee(employee1);
        operator.AddEmployee(employee2);
        operator.AddEmployee(employee3);
        //Policz wypłaty
        operator.showCompanyCost();
        //Wyswietl dane pracownika
        System.out.println(operator.getEmployee(1).toString());
        //wyświetli błąd - przekroczenie rozmiaru tablicy
        System.out.println(operator.getEmployee(2).toString());
    }
}
