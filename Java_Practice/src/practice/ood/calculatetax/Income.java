package practice.ood.calculatetax;

public class Income {

	protected double income;

	public Income(double income) {
		this.income = income;
	}

	public double getTax() {

		System.out.println(income*0.1);

		return income * 0.1;
	}

}
