import java.util.ArrayList;

public class EasyArrayList {
    public static void main(String[] args) {
        ArrayList<String> goals = new ArrayList<String>();

        goals.add("Learn Java");
        goals.add("Pass HSK 1");
        goals.add("Work in China");

        System.out.println("Number of goals: " + goals.size());

        String firstGoal = goals.get(0);
        System.out.println("My first goal is to " + firstGoal);

        System.out.println("My goals are: " + goals);
    }
}