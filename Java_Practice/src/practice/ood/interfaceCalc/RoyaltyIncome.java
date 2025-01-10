package practice.ood.interfaceCalc;

/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements InterfaceIncome{
    private Double income;
    public RoyaltyIncome(double income){
        this.income = income;
    }
	public double getIncome(){
        return income;
    }

    public double getTax(){
        System.out.println("Royalty income tax is " + income*0.2);
        return income * 0.2;
    }

}
