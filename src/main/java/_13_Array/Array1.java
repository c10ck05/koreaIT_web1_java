package _13_Array;

public class Array1 {
    public static void main(String[] args) {
        // Array (배열): 같은 자료형의 많은 데이터를 한번에 관리하는 저장 공간
        // 연속된 공간(메모리)에 위치하기 때문에 탐색시 유리(빠르다)

//        int score1 = 90;
//        int score2 = 80;
//        int score3 = 60;
//        int score4 = 40;
//        int score5 = 100;

        int[] scores = new int[5]; // int 자료 5개 들어갈 배열 생성
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 60;
        scores[3] = 40;
        scores[4] = 100;

        // 간단하게 배열생성/ 초기화
        int[] scores2 = new int[]{90, 80, 60, 40, 100};
        int[] scores3 = {90, 80, 60, 40, 100}; // 가장 많이 사용

        // 길이(공간 갯수) 배열명.length
        System.out.println(scores3.length);

        // 자료형[] 배열이름 = {초기화 할 데이터들};

        // 배열 순회 - loop(for문과 자주 쓴다)
        String[] names = {"일길동", "이길동", "삼길동", "사길동", "오길동"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 향상된 for문 - 항상 배열의 길이만큼 순회
        // for(하나씩 꺼낸 데이터를 담은 변수: 배열 리스트)
        for(String name : names) {
            System.out.println(name);
        }


    }
}
