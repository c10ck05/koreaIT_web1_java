package _07_TypeCasting;

public class Overflow {
    public static void main(String[] args) {
        long maxIntValue = 2_147_483_647L;
        long overIntValue = 2_147_487_647L;

        int intValue1 = (int) maxIntValue;
    }
}
