// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("FACTORIALS");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number (from 1 through 10): ");
         int number = scanner.nextInt();
         int total = 1;
         
         while (number<0 || number >= 11) {
         System.out.println("INVALID NUMBER! Type a number from 1 through 10 (no negatives!): ");
         number = scanner.nextInt();
         }
         
         
         for (int tru_num = 1; tru_num <= number; tru_num++) {
            total = (total * tru_num);
         }
       if (number>0) {
        System.out.println("The factorial is:" + total);

       }
    }
}
