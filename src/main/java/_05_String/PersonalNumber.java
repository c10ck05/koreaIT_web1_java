package _05_String;

import java.util.Scanner;

public class PersonalNumber {
    public static void main(String[] args) {
        String pn = "991122-1234567";
        String birthDate = pn.substring(0, 6);
        int dashIndex = pn.indexOf("-");
        String genderCode = pn.substring(dashIndex + 1, dashIndex + 2);
        System.out.println("생년월일: " + birthDate);
        System.out.println("성별 코드: " + genderCode);

        System.out.print("이메일을 입력하세요 >> ");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        boolean isValidEmail = email.contains("@") && email.contains(".");
        int atIndex = email.indexOf("@");
        String username = email.substring(0, atIndex);
        String domainName = email.substring(atIndex + 1, email.indexOf("."));
        System.out.println(isValidEmail);
        System.out.println("아이디: " + username);
        System.out.println("도메인: " + domainName);

        sc.close();
    }
}
