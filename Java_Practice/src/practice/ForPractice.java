package practice;

public class ForPractice {
    public static void main(String[] args) {
        double pi = 0;
        double j = 0;
        for (int i = 1; i <= 1000; i++) {
            j = 4.0*(1 / (2.0*i - 1) * (Math.pow(-1, i+1)));
            pi += j;
        }
        System.out.println(pi);
    }
}
