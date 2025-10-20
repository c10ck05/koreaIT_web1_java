package _08_Switch;

import java.util.Scanner;

public class WeekDiscount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("요일을 입력하세요 >> ");
        String dayOfTheWeek = scanner.nextLine();

        int basePrice = 10000;
        double discountPrice;

        switch (dayOfTheWeek.charAt(0)) { // 월이라 적었든 월요일이라 적었든 똑같이 하기 위해서
            case '월':
                discountPrice = basePrice * 0.1;
                break;
            case '화': case '수': case '목':
                discountPrice = basePrice * 0.05;
                break;
            case '금':
                discountPrice = basePrice * 0.15;
                break;
            case '토': case '일':
                discountPrice = basePrice * 0.2;
                break;
            default:
                discountPrice = 0.0;
                System.out.println("올바른 요일을 입력하세요.");
        }
        System.out.println("요일: " + dayOfTheWeek.charAt(0) + "요일");
        System.out.println("정가: 10000원");
        System.out.println("할인 금액: " + discountPrice + "원");
        System.out.println("최종가격: " + (basePrice - discountPrice) + "원");
    }
}
