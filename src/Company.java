class Company {
    public static void main(String[] args) {
        EmployeeOperator operator = new EmployeeOperator(2);
        //Dodaj dwóch pracowników
        operator.AddEmployee();
        operator.AddEmployee();
        operator.AddEmployee();
        //Policz wypłaty
        operator.showCompanyCost();
        //Wyswietl dane pracownika
        System.out.println(operator.getEmployee(1).toString());
        //wyświetli błąd - przekroczenie rozmiaru tablicy
        System.out.println(operator.getEmployee(2).toString());
    }
}
