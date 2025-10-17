package _03_Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자: 계산을 수행하는 기호
        // 3 + 4 // + 가 연산자     3, 4 피연산자
        // a + b // + 가 연산자     a, b 피연산자
         */

        // 산술 연산자(사칙연산)
        int num1 = 1, num2 = 2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);

        // 나머지 연산
        System.out.println(num1 % num2);

        int even1 = 128;
        // % 2 를 했을 때 나머지가 있으면 -> 홀수
        // 있으면 짝수
        System.out.println(even1 % 2);

        // 비교 연산자
        System.out.println(num1 == num2); // 같은지 연산
        System.out.println(num1 != num2); // 다른지 연산
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        // 실습 22시에서 50시간을 더하면 몇시인지 구하시오
        int now = 22;
        int after50hour = (now + 50) % 24;
        System.out.println(after50hour);
        // 실습) 162개의 게시물이 있다
        // 게시글은 한페이지 당 20개씩 표시 된다
        // 이때 전체 페이지 갯수를 구하세요
        // x % 20 == 0 의 결과가 true -> x / 20 이 총페이지 수
        // x % 20 == 0 의 결과가 false -> x / 20 + 1 이 총 페이지 수
    }
}
