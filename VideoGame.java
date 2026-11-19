/**
 * Displays the Video Game Score 
 * 
 * @author lipemlidjobjr
 * @date 2026-11-19
 */
public class VideoGame {
    public static void main(String[] args) {
        int score = 7;
        int levels = 2;

        System.out.println(score / levels);
        System.out.println(score / (double) levels);
        System.out.println(score % levels);
        score += 10 * 2;
        System.out.println(score++);
        System.out.println(++score);
        System.out.println("Score: " + 5 + 5);
        System.out.println(5 + 5 + " pts");
    }
}