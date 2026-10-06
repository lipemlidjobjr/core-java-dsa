public class MethodMaster {

    // In C++ you did: int addNumbers(int a, int b) { return a + b; }
    // In Java, we just add the 'static' keyword so we can call it directly from main.
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // A method that doesn't return anything uses 'void'
    static void printGoal(String goal) {
        System.out.println("My goal is: " + goal);
    }

    public static void main(String[] args) {
        // 1. Call the addNumbers method and save the result
        int sum = addNumbers(15, 25);
        System.out.println("The sum is: " + sum);

        // 2. Call the printGoal method
        printGoal("Work in China");
    }
}