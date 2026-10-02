// In C++ you did: class CameroonianDev { ... };
// In Java, it's exactly the same, but usually public.
public class CameroonianDev {
    
    // 1. Attributes (Variables)
    // In C++ you might have used 'string name;' 
    String name;
    int age;
    String targetCountry;

    // 2. Constructor (Used to create the object)
    // In C++, this looks like: CameroonianDev(string n, int a, string c) { name = n; ... }
    // In Java, we use the 'this' keyword to be specific.
    public CameroonianDev(String name, int age, String targetCountry) {
        this.name = name;
        this.age = age;
        this.targetCountry = targetCountry;
    }

    // 3. Method (Behavior)
    // In C++ you did: void printGoal() { cout << ... }
    public void printGoal() {
        System.out.println("My name is " + this.name + ", I am " + this.age + ", and I will be a SWE in " + this.targetCountry + ".");
    }

    // 4. The Main Method (Where the program starts)
    public static void main(String[] args) {
        // In C++ you did: CameroonianDev dev1("Lipemlidjob", 18, "China");
        // In Java, we MUST use the 'new' keyword to instantiate an object.
        CameroonianDev me = new CameroonianDev("Lipemlidjob", 18, "China");
        
        // Call the method
        me.printGoal();
    }
}