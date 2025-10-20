package _06_If;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // bmi 계산
        int weight = 70;
        double height = 174 / 100.0;
        double bmi = weight / (height * height);

        if (bmi >= 30){
            System.out.println("비만");
        } else if (bmi >= 25) {
            System.out.println("과체중");
        } else if (bmi >= 18.5) {
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >> ");
        int score = scanner.nextInt();
        scanner.nextLine();
        String rating;
        boolean isAward = false;
        if (score >= 90) {
            rating = "A";
            isAward = true;
        } else if (score >= 80) {
            rating = "B";
            isAward = true;
        } else if (score >= 70) {
            rating = "C";
        } else if (score >= 60) {
            rating = "D";
        } else {
            rating = "F";
        }
        System.out.println("점수: "+ score + "점");
        System.out.println("등급: " + rating);
        System.out.println(isAward ? "장학생 대상입니다.": "장학생 대상이 아닙니다.");
    }
}
