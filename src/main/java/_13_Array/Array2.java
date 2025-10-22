package _13_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 참조자료형 특징 - "."으로 참조할 수 있다
        // Array 또한 참조 자료형
        int[] original = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(original));
        int[] copy1 = original;
        int[] copy2 = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copy1));

        original[0] = 999;
        System.out.println(Arrays.toString(original));

        // 앝은 복사: 같은 메모리 주소를 저장하고 있기 때문에 같다.
        System.out.println(Arrays.toString(copy1));

        // 깊은 복사: heap에 새로운 메모리 할당해서 실제 값을 복사
        System.out.println(Arrays.toString(copy2));
    }
}
