//import java.util.Scanner; 

//Grade determiner
    System.out.println("___________________");
    System.out.println("Age to School Level");

    Scanner grade = new Scanner(System.in);
          System.out.println("Enter your age: ");
        String tru_age = grade.nextLine();
        System.out.println("Your age is " + tru_age);

      int numage = Integer.parseInt(tru_age);

      if (numage  < 5) {
         System.out.println("You are in preschool.");
      }
    else if (numage >= 5 && numage < 12) {
         System.out.println("You are in elementary school.");
      }
        else if (numage >= 11 && numage < 15)
          {System.out.println("You are in middle school.");
            }
        else if (numage >= 15 && numage < 19)
     {System.out.println("You are in high school.");
        }
        else if (numage >= 19)
          {System.out.println("You are probably in college!");
  } 
