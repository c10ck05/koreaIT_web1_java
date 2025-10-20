package _06_If;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
//        System.out.print("가격을 입력하세요. >> ");
//        int price = scanner.nextInt();
//        scanner.nextLine(); // 엔터 처리용 코드
//
//        if (price >= 100000) {
//            double discountPrice = price * 0.9;
//            System.out.println("최종 가격: " + discountPrice);
//        } else {
//            System.out.println("최종 가격: " + price);
//        }

        // 로그인
        String readId = "java";
        String readPw = "1234";

        // 사용자 입력
        System.out.println("아이디 입력: ");
        String inputId = scanner.nextLine();

        System.out.println("패스워드 입력: ");
        String inputPw = scanner.nextLine();

        // 입력값과 실제값 비교 ->
        // 아이디 패스워드가 일치할 경우에 "로그인 성공" 출력
        // 일치하지 않을 경우 "로그인 실패"
        boolean isLogin = false;
        if (inputId.equals(readId) && inputPw.equals(readPw)) { // Id 확인
            isLogin = true;
        }
        System.out.println(isLogin ? "로그인 성공": "로그인 실패");
        scanner.close();
    } // 메인
} // 클래스
