public class TopManager extends Company implements Employee{
    private int topManagerSalary=(int) (Math.random() * (140_000 - 115_000) + 115_000);
    public int getMonthSalary() {
        if (getIncome() > 10_000_000) {
            return (int)(topManagerSalary + (topManagerSalary * 1.5));
        }
        return topManagerSalary;
    }
}
