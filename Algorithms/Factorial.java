//Finding Factorial
    System.out.print("Enter a number: ");
    Scanner num = new Scanner(System.in);
    float n = num.nextFloat();

    double sum = 1;

        for (int i = 1 ; i <= n; i++) {
            sum = sum * i ;
        }
         System.out.println("Factorial of " + n + " is : " + sum);
    
  }
