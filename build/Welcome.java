import java.util.Scanner;
import com.daniel.moune.java.tutorial14.Student;

public class Welcome {
    public static void main(String[] args) {
        Student new_student = new Student();    // creates a new object that represent the student
        Scanner sc = new Student(System.in);
        
        System.out.println("Hello, new student! Enter your name: ");
        new_student.name = sc.nextLine();
        
        System.out.println("Enter your matricule: ");
        new_student.matricule = sc.nextInt();

        System.out.println("Enter your phone number: ");
        new_student.phoneNumber = sc.nextInt();
        
        System.out.println("Welcome, " + new_student.name);
        System.out.println("Your matricule is " + new_student.matricule);
        System.out.println("Your phone number is " + new_student.phoneNumber);
    }
}