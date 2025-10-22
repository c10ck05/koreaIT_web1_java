package _12_BreakContinue;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        // 반복문 - Break, continue
        // break를 만나면, 반복문을 한번 탈출
        for (int i = 0; i <= 10; i++) {
            System.out.println("현재 번호: " + i);
            if (i == 3) {
                break; // for문의 중괄호를 탈출
            }
        }
        int waiting = 50;
        int stock = 10;
        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번째 손님 입장");
            if (i == stock) {
                System.out.println("재고 소진");
                System.out.println("영업 종료");
                break; // 반복문 탈출
            }
        }

        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("비밀번호: ");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("로그인 성공");
                break;
            }
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 200) {
                System.out.println(i);
                System.out.println(sum);
                break;
            }
        }
    }
}
