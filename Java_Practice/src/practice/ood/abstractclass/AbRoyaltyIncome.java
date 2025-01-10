package practice.ood.abstractclass;

import practice.ood.calculatetax.Income;

/**
 * 稿费收入税率是20%
 */
public class AbRoyaltyIncome extends AbIncome{
    public AbRoyaltyIncome(int income) {
        super(income);
    }

    @Override
    public double getTax() {
        System.out.println("Royalty income tax is " + income*0.2);
        return income * 0.2;
    }
}
