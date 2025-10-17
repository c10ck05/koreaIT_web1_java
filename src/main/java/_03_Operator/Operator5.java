package _03_Operator;

public class Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        int x = 5;
        int y = 3;
        // boolean 데이터 ? true 일때 대입될 값: false일 때 대입될 값
        int max = x > y ? x : y;
        boolean isSame = x == y ? true : false;
        // 조건문과 다른점: 결과가 값이다.
        String samestr = x==y ? "같음": "다름";

        // 중첩도 가능
        int age = 27;
        String ticketName = age >= 19 ? "성인요금"
                : age >= 14 ? "청소년요금"
                : "어린이 요금";

        // 실습1) 키가 120 이상인 경우 탑승 가능하도록 하는 삼항연산자
        // 탑승 가능한 경우 "탑승가능" 불가능 하면 "탑승 불가능" 출력
        int height = 110;
        String canRide = height >= 120 ? "탑승 가능": "탑승 불가능";
        System.out.println(canRide);
        // 실습 2) 페이지네이션
        // 게시글이 162개 있고, 한페이지에 20개씩 화면에 보인다면
        // 총 페이지의 갯수를 삼항 연산자로 구하시오.
        int postCount = 162;
        int pageCount = postCount % 20 == 0 ? postCount / 20
                : postCount / 20 + 1;
        System.out.println(pageCount);
    }
}
