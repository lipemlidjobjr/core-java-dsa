public class NationalDayArray {
    public static void main(String[] args) {
            int[] fireworks = {85, 92, 78, 99, 88};

            int maxScore = fireworks[0];

            for (int i = 1; i < fireworks.length; i++) {
                if (fireworks[i] > maxScore) {
                    maxScore = fireworks[i];
                }
            }

            System.out.println("The brightest firework score is: " + maxScore);

            System.out.println("All firework scores:");
            for (int score : fireworks) {
                System.out.println(score);
            }
    }
}