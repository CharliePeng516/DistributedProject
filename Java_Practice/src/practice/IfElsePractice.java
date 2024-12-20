package practice;

import java.util.Scanner;

public class IfElsePractice {
//    请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。
//
//    BMI = 体重(kg) / 身高(m)的平方
//    BMI结果：
//
//    过轻：低于18.5
//    正常：18.5 ~ 25
//    过重：25 ~ 28
//    肥胖：28 ~ 32
//    非常肥胖：高于32
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Weight: ");
            double weight = sc.nextDouble();
            System.out.println("Enter the Height(cm): ");
            double height = sc.nextDouble() * 0.01;
            double BMI = weight / (height * height);
            if (BMI < 18.5) {
                System.out.println("You are Underweight");
            }else if (BMI < 25) {
                System.out.println("You are Normal");
            } else if (BMI < 28) {
                System.out.println("You are Overweight");
            } else if (BMI < 32) {
                System.out.println("You are Obese");
            } else {
                System.out.println("You are very Obese");
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid input");
        }


    }
}
