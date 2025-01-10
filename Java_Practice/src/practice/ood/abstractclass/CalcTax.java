package practice.ood.abstractclass;

public class CalcTax {

	public static void main(String[] args) {
		// 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
		AbIncome[] incomes = new AbIncome[] { new AbSalaryIncome(7500), new AbRoyaltyIncome(12000) };
		double total = 0;
		for (AbIncome income : incomes) {
			total += income.getTax();
		}
		System.out.println(total);
	}

}
