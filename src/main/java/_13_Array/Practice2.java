package _13_Array;

public class Practice2 {
    public static void main(String[] args) {
        int[] scores = {80, 90, 75, 100, 65, 80, 91, 70};
        double sum = 0.0;
        int count = 0;
        int max = 0;

        for(int score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;
        System.out.println("평균: " + avg);

        for(int score: scores) {
            if (score >= avg) {
                count++;
            }
            if (score > max) {
                max = score;
            }
        }
        System.out.println("평균 이상 학생 수: " + count);
        System.out.println("최고점: " + max);
    }
}
