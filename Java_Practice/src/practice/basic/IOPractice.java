package practice.basic;

import java.util.Scanner;

public class IOPractice {
    public static void main(String[] args) {
//        CheckYourNameAndAge();

//          请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。\
        Scanner sc = new Scanner(System.in);
        double test1;
        double test2;

        try {
            System.out.println("Enter the first test grade: ");
            test1 = sc.nextInt();
            System.out.println("Enter the second test grade: ");
            test2 = sc.nextInt();
            double res = (test2 - test1) / test2 * 100;
            System.out.printf("Your grade has increased res=%.2f%%.", res);
        }catch (Exception e) {
            System.out.println("Invalid input");
        }



    }


    public static void CheckYourNameAndAge() {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age;
        try{
            age = Integer.parseInt(scanner.nextLine());
            System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
        }catch (NumberFormatException exception){
            System.out.println("You entered an invalid number.");
        }
    }
}
