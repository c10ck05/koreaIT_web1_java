package _03_Operator;

public class Operator3 {
    public static void main(String[] args) {
        // 논리 연산자 - boolean 자료끼리 연산
        // 결과 타입: boolean 타입
        boolean hasLicense = true;
        int age = 25;
        // and 연산자(&&) : 둘 다 참일 때만 참
        boolean canDrive = (age >= 20) && (hasLicense);

        // or 연산자(||) : 둘 중 하나라도 참이면 참
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRestDay = isWeekend || isHoliday;

        // not 연산자(!): 참을 거짓, 거짓을 참
        boolean isOnline = true;
        boolean isOffline = !isOnline;
    }
}
