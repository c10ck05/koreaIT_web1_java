package _10_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myChoice;
        do {
            System.out.println("--메뉴 선택--");
            System.out.println("1. 주문하기");
            System.out.println("2. 취소하기");
            System.out.println("0. 종료");

            System.out.print("메뉴를 선택하세요 >> ");
            myChoice = scanner.nextInt();

            switch (myChoice) {
                case 1:
                    System.out.println("주문진행");
                    break;
                case 2:
                    System.out.println("주문 취소");
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    break;
            }
        } while (myChoice != 0);
    }
}
