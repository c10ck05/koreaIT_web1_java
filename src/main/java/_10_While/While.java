package _10_While;

import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        while (boolean 자료형) {
            반복될 코드
        }

        for문 - 횟수가 명확할 때
        while문 - 횟수가 불명확할 때, 조건 중심
         */
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = true;

        while (isLogin) {
            System.out.println("로그인 상태입니다.");
            System.out.print("로그아웃 하시겠습니까?(y/n) >> ");

            String command = scanner.nextLine().toLowerCase();
            isLogin = !"y".equals(command);
        }
        System.out.println("로그아웃 성공");
    }
}
