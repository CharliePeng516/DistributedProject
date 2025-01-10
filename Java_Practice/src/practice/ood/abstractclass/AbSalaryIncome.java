package practice.ood.abstractclass;

public class AbSalaryIncome extends AbIncome{

    public AbSalaryIncome(int income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        System.out.println("Salary income tax is: "+ (income - 5000) * 0.2);
        return (income - 5000) * 0.2;
    }

}
