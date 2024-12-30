package practice;

import java.util.Scanner;

public class BooleanPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check whether you are primary school student: ");
        int age = sc.nextInt();
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age <= 12 & age >= 6;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
