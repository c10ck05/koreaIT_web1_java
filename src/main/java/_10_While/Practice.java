package _10_While;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(1, 11);
        int myInput = 0;

        while (num != myInput) {
            System.out.print("숫자 입력 >> ");
            myInput = scanner.nextInt(); scanner.nextLine();
            if (num != myInput) {
                System.out.println("틀렸습니다.");
            }
        }
        System.out.println("정답입니다. " + num);
    }
}
