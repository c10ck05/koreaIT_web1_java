package _07_TypeCasting;

public class NumberToString {
    public static void main(String[] args) {
        // 숫자 -> 문자열
        int num1 = 10;
        double num2 = 100.1;

        // 방법 1: 문자열 + 숫자 -> 문자열
        String strNum1 = "" + num1;
        String strNum2 = "" + num2;

        // 방법 2: 객체 메서드 사용
        String strNum3 = Integer.toString(num1);
        String strNum4 = Double.toString(num2);
    }
}
