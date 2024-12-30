package practice;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class FlowSwitchPractice {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) (Math.random() * 3);
		System.out.println(random + " " + choice);
		switch (choice) {
			case 1 -> {
				switch (random) {
					case 1 -> System.out.println("Rock = Rock, you got a draw.");
					case 2 -> System.out.println("Rock > Scissors, you win");
					case 3 -> System.out.println("Rock < Paper, you lose");
				}
			}
			case 2 -> {
				switch (random) {
					case 2 -> System.out.println("Scissors = Scissors, you got a draw.");
					case 1 -> System.out.println("Rock > Scissors, you lose");
					case 3 -> System.out.println("Paper < Scissors, you win");
				}
			}
			case 3 -> {
				switch (random) {
					case 3 -> System.out.println("Paper = Paper, you got a draw.");
					case 1 -> System.out.println("Paper > Rock, you win");
					case 2 -> System.out.println("Paper < Scissors, you lose");
				}
			}
			default -> {
				System.out.println("Invalid choice");
			}
		}
	}

}
