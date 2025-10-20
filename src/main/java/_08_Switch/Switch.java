package _08_Switch;

public class Switch {
    public static void main(String[] args) {
        int ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액장학금");
                break;
            case 2:
                System.out.println("반액장학금");
                break;
            case 3:
                System.out.println("상품권");
                break;
            default:
                System.out.println("기본");
        }

        int month = 10;

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄 입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름 입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을 입니다."); break;
        }
    }
}
