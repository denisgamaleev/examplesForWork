public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            company.hire(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager());
        }
        for (int i = 0; i < 15; i++) {
            company.getTopSalaryStaff(i);
        }
        for (int i = 0; i < 30; i++) {
            company.getLowestSalaryStaff(i);
        }
        for (int i = 0; i < company.employeesSize()/2; i++) {
            int index = (int) (Math.random() * company.employeesSize());
            Employee loser = company.getEmployees().get(index);
            company.fire(company);
        }
        System.out.println("Зарплаты по возрастанию");
        for (Employee employee : company.getLowestSalaryStaff(10)) {
            System.out.println(employee.getMonthSalary());
        }
        System.out.println("Зарплаты по убыванию");
        for (Employee employee : company.getTopSalaryStaff(15)) {
            System.out.println(employee.getMonthSalary());
        }

    }
}
