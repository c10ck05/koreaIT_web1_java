package _12_BreakContinue;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String pw = "1234";
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int chance = 0;
        while (!pw.equals(input)) {
            if (chance >= 5) {
                System.out.println("계정이 잠겼습니다.");
                break;
            }

            System.out.print("비밀번호 입력 >> ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("다시 입력하세요.");
                continue;
            } else if (input.equals(pw)) {
                System.out.println("로그인 성공!");
                break;
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
                chance++;
            }
        }
    } // main
}
