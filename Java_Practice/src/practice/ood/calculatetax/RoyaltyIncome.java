package practice.ood.calculatetax;

/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income{

    public RoyaltyIncome(double income) {
        super(income);
    }
    public double getTax() {
        System.out.println("Royalty income tax is " + income*0.2);
        return income * 0.2;
    }
}
