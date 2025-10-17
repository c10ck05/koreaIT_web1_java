package _03_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 단항 연산자
        int a = 1;
        a++; // a의 값을 1 증가 시켜라
        int b = a++; // 후위증가: 사용(대입)후에 증가시켜라
        System.out.println(b);
        a = 1;
        // 전위증가: 사용(대입)전에 증가시켜라
        b = ++a;
        System.out.println(b);
        a = 1;
        // 후위감소: 먼저 사용하고, 감소
        b = a--;
        // 전위감소: 감소 되고 사용
        a = 1;
        b = --a;

        // 단독 사용시 동일
        a++; // ++a;
        
    }
}
