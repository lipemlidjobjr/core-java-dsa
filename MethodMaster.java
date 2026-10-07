public class MethodMaster {

    static int addNumbers(int a, int b) {
        return a+b;
    }

    static void printGoal(String goal) {
        System.out.println("My goal is: " + goal);
    }

    public static void main(String[] args) {
        int sum = addNumbers(15, 25);
        System.out.println("The sum is: " + sum);

        printGoal("Work in China");
    }
}