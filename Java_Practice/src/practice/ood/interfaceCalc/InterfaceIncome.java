package practice.ood.interfaceCalc;

/**
 * 定义接口Income
 */
public interface InterfaceIncome {
    double getIncome();
    default double getTax(){
        return getIncome() * 0.1;
    }

}
