package practice.ood.interfaceCalc;

public class SalaryIncome implements InterfaceIncome{
    private double income;
    public SalaryIncome(double income) {
        this.income = income;
    }

    @Override
    public double getIncome() {
        return income;
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        System.out.println((income - 5000) * 0.2);
        return (income - 5000) * 0.2;
    }
}
