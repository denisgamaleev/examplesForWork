public class Manager extends Company implements  Employee{
    private int managerSalary = 50000;
    public int earnedMoney = (int) (Math.random() * (140_000 - 115_000) + 115_000);
    @Override
    public int getMonthSalary() {
        return (int)(managerSalary + (earnedMoney * 0.05));
    }
}
