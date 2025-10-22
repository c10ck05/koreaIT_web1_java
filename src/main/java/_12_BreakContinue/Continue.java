package _12_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // 반복문 내에서 코드 진행을 멈추고, 다음 반복으로 넘어감
        // 사실상 스킵
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
        }

        int waiting = 50;
        int stock = 10;
        int noShowIndex = 6;
        int sold = 0;

        for (int i = 1; i <= waiting; i++) {
            if (noShowIndex == i) {
                continue;
            }
            System.out.println(i + "번 손님 안녕하세요");
            sold += 1;
            if (stock == sold) {
                System.out.println("재료 소진");
                break;
            }
        }
    }
}
