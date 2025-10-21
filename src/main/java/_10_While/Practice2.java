package _10_While;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(1, 101);
        int input = 0;
        while (num != input) {
            System.out.print("숫자입력 >> ");
            input = scanner.nextInt(); scanner.nextLine();
            if (num > input) {
                System.out.println("UP");
            } else if (num < input) {
                System.out.println("DOWN");
            } else {
                System.out.println("정답입니다.");
            }
        }
    } // main
}
