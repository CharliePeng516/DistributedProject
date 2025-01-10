package practice.ood.calculatetax;

public class SalaryIncome extends Income {

	public SalaryIncome(double income) {
		super(income);
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
