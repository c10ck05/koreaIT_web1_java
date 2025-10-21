package _09_For;

public class For {
    public static void main(String[] args) {
        /*
        반복문 - for
        for(변수 선언; 조건식; 증감식) {
            반복 될 코드
        }
        초기식 -> (조건식 -> 코드실행 -> 증감식) * n -> 조건식 결과가 false면 for문 탈출
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            System.out.println(i);
        }

        int a = 0;
        for(; a < 5; a++) {
            System.out.println(a);
        }
        System.out.println(a); // a == 5
        System.out.println("-----------");
        // 짝수만 출력
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i);
        }

        int sum = 0; // 누적합
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int evenSum = 0;
        int oddSum = 0;

        int count3 = 0;
        int count7 = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }

            if (i % 3 == 0) {
                count3 += 1;
            }
            if (i % 7 == 0) {
                count7 += 1;
            }
        }
        System.out.println("짝수 합: " + evenSum);
        System.out.println("홀수 합: " + oddSum);
        System.out.println("3의 배수: " + count3);
        System.out.println("7의 배수: " + count7);
    } // main
}
