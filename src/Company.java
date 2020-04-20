class Company {
    public static void main(String[] args) {
        EmployeeOperator operator = new EmployeeOperator();
        //Dodaj dwóch pracowników
        operator.AddEmployee(0);
        operator.AddEmployee(1);
        //Policz wypłaty
        operator.showCompanyCost();
    }
}
