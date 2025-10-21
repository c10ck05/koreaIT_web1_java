package _11_Scope;

public class Scope1 {
    public static void main(String[] args) {
        // 스코프: 변수의 생존 범위
        // 마치 사람이 살 수 있는 지역과 같아서
        // 그 지역을 벗어나면 더 이상 존재하지 않는다

        // 선언된 중괄호 안쪽으로는 생존가능하다.
        int m = 10;
        System.out.println(m);
    }
}
