//import java.util.Scanner;

//Temperature Converter
    System.out.println("______________________");
    System.out.println("Temperature Converter");

    Scanner t = new Scanner(System.in);
    System.out.println("Is it Farenheit(1) or Celsisus(2)? : ");
    String temp_type = t.nextLine();
    int temp = Integer.parseInt(temp_type);
    
    if (temp == 1) {
      Scanner fatem = new Scanner(System.in);
      System.out.println("Temperature in Farenheit: ");
      String tem = fatem.nextLine();
      int t1 =  Integer.parseInt(tem);
        float f = t1;
      float c = (f-32) * 5/9;
      System.out.println("Temperature in Celsius: " + c);
    }
      
    else if (temp == 2) {
      Scanner ctemp = new Scanner(System.in);
      System.out.println("Temperature in Celsius: ");
      String temp2 = ctemp.nextLine();
      int t2 =  Integer.parseInt(temp2);
        float a = t2;

      float b = (a * 9/5) + 32;
      System.out.println("Temperature in Farenheit: " + b);
    }
    else {
      System.out.println("Invalid input");
    }
