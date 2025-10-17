package _05_String;

public class Escape {
    public static void main(String[] args) {
        /*
        이스케이프 문자
        문자열 안에 이스케이프 문자를 사용할 수 있다
        \n : 줄바꿈
        \t : 탭
        \' : '
        \" : "
        \\ : \
         */
        System.out.println("집에\n가고\n싶죠");
        System.out.println("이름:\t" + "손흥민");
        // 파일경로
        System.out.println("C:\\Program Files\\Java");
    }
}
