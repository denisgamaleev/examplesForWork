public class Operator implements Employee{
    private  int operatorSalary= (int) (Math.random() * (40_000 - 50_000) + 50_000);

    @Override
    public int getMonthSalary() {
        return operatorSalary;
    }
}
