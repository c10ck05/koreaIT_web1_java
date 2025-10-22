package _13_Array;

public class Practice {
    public static void main(String[] args) {
        int[] scores = {80, 90, 75, 100, 65};
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        System.out.println("평균: " + (sum / scores.length));

        String[] foods = {"김치", "두부(상함)", "우유", "달걀(상함)", "사과"};
        for(String food : foods) {
            if (!food.contains("(상함)")) {
                System.out.println(food);
            }
        }

        String test = "손흥민";
        System.out.println(test.startsWith("손"));
        System.out.println(test.endsWith("민"));
    }
}
