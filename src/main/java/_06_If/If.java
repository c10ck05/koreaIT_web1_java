package _06_If;

public class If {
    public static void main(String[] args) {
        /*
        if (boolean 데이터 - 비교, 논리연산식) {
            true일때 실행되는 코드
        } else {
            false일때 실행되는 코드
        }
         */

        int height = 130;
        int age = 23;
        if (height >= 120) {
            System.out.println("탑승 가능!");
        }

        if (height >= 120 && age < 14) {
            System.out.println("탑승 가능!");
        }

        // if ~ else if ~ else
        // 하나의 조건문이 만족되면, 나머지는 검사를 하지 않는다.
        // 단 하나의 블록만 실행

        age = 15;
        if (age <= 7) {
            System.out.println("미취학 아동");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        boolean isLogin = false; // 로그인 되었는가?
        boolean isBanned = true; // 가입된 계정이 밴 계정인가?

        if (!isLogin) { // 오프라인인가?
            System.out.println("로그인이 필요합니다.");
        } else if (isBanned) {
            System.out.println("정지된 계정입니다.");
        }

        // 등급제
        boolean isClient = true;
        boolean isVIP = false;
        boolean isGold = true;
        boolean isSilver = false;

//        if (isClient) {
//
//        } else if (isVIP) {
//
//        } else if (isGold) {
//
//        } else if (isSilver) {
//
//        } else {
//            System.out.println("니 뭐냐?");
//        }

    }
}
