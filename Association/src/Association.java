class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("VTB");
        Employee emp = new Employee("Ivanov");

        System.out.println(emp.getEmployeeName() +
                " is employee of " + bank.getBankName());
    }
}
