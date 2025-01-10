package practice.ood.interfaceCalc;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class interfaceCalcTax {

	public static void main(String[] args) {
		// TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
		InterfaceIncome[] incomes = new InterfaceIncome[] { new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		for (InterfaceIncome income : incomes) {
			total += income.getTax();
		}
		System.out.println(total);
	}

}
