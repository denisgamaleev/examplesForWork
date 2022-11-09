import java.util.*;

public class Company implements Employee{
    public int earnedMoney = (int) (Math.random() * (140_000 - 115_000) + 115_000);
    private List<Employee> employees = new ArrayList<>();

    public int employeesSize(){
        return employees.size();
    }
    public void  hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employes) {
        employees.addAll(employes);
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void fire(Employee employee) {

        employees.remove(employee);
    }

    public int getIncome() {
        int companyMoney;
        companyMoney = (int) (earnedMoney - (earnedMoney * 0.05));
        return employees.size() * companyMoney;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o2.getMonthSalary(),o1.getMonthSalary());
            }
        });
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {

                return Integer.compare(o1.getMonthSalary(),o2.getMonthSalary());
            }
        });
    }
    public ArrayList<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        ArrayList<Employee> copyList = new ArrayList<Employee>(employees);
        Collections.sort(copyList, comparator);
        ArrayList<Employee> result = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(earnedMoney);

    }

    @Override
    public int getMonthSalary() {
        return getIncome();
    }
}
