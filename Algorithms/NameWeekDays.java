//import java.util.Scanner; 


    //Name of the Days
    System.out.println("__________");
    System.out.println("Week Days");
    
    Scanner W_days = new Scanner(System.in);
    System.out.println("Number: ");
     String nay = W_days.nextLine();
    int num_day = Integer.parseInt(nay);
   
    if (num_day == 1) {
      System.out.println("Monday");
    }
    else if (num_day == 2) {
      System.out.println("Tuesday");
    }
     else if (num_day == 3) {
         System.out.println("Wednesday");
       }
    else if (num_day == 4) {
       System.out.println("Thursday");
     }
    else if (num_day == 5) {
       System.out.println("Friday");
     }
    else {
       System.out.println("Not a Week Day!");
    }
    
