package practice;

public class WhilePractice {
    public static void main(String[] args) {
        WhileP();
        DoWhilePractice();

    }
    public static void WhileP() {
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用while计算M+...+N:
        while (m <= n) {
            sum += m;
            m ++;
        }
        System.out.println(sum);
    }



    public static void DoWhilePractice() {
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用do while计算M+...+N:
        do {
            sum += m;
            m ++;
        } while (m<=n);
        System.out.println(sum);
    }
}
