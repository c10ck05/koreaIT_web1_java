package _04_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 - 외부(키보드)로 부터 데이터를 받아오는 "객체"
        // 스캐너 객체 생성(우변에 있는 new) / scanner라는 변수에 대입
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        System.out.print("문자열을 입력하세요 >>");
        String myStr = scanner.nextLine();
        System.out.println("입력한 문자열: " + myStr);

        // 정수 입력 받기
        System.out.print("숫자를 입력하세요 >>");
        int myInt = scanner.nextInt();
        System.out.println("입력한 정수: " + myInt);
    }
}
