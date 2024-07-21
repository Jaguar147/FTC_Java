// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the GradeWhiz! Calculate your average instantly.");
        //Prompt for user to enter their grades for three subjects
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for three subjects (out of 100): ");
        float grade1 = scanner.nextFloat();
        float grade2 = scanner.nextFloat();
        float grade3 = scanner.nextFloat();
        float average = ((grade1 + grade2 + grade3)/3);
        System.out.println("Average: " + average);
        
        if (average>=95) {
            System.out.println("Grade A+");
            System.out.println("PASS! Great job!");
        }
       else if (average>=90) {
            System.out.println("Grade A");
            System.out.println("Pass");

        }
        else if (average>= 80) {
            System.out.println("Grade B");
            System.out.println("Pass");

        }
        else if (average>= 70) {
            System.out.println("Grade C");
            System.out.println("Pass");

        }
        else if (average>= 60) {
            System.out.println("Grade D");
            System.out.println("Fail");

        }
        else if (average<60) {
            System.out.println("Grade F");
            System.out.println("FAIL! Repeat grade.");

        }

    }
}
