import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Kilometer & Miles Converter");

    Scanner Distance = new Scanner(System.in);
    System.out.println("Enter how much distance: ");
    String d = Distance.nextLine();
    int y = Integer.parseInt(d);

    Scanner Type = new Scanner(System.in);
    System.out.println("Is this Km(1) or Miles(2) : ");
    String t = Type.nextLine();
    int x = Integer.parseInt(t);
    boolean inValid = true;

    while (inValid) {
      if (x == 1) {
        double mi = (y * 0.621371);
        System.out.println(d + " kilometers is equal to " + mi + " miles");
        inValid = false;
      } else if (x == 2) {
        double km = (y * 1.60934);
        System.out.println(d + " miles is equal to " + km + " kilometers");
        inValid = false;
      } else {
        inValid = true;
      }
      if(inValid) {
      Type = new Scanner(System.in);
      System.out.println("Enter a valid value, Km(1) or Miles(2) : ");
      t = Type.nextLine();
      x = Integer.parseInt(t);
      }
    }
  }
}
