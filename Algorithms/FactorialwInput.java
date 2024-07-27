//Finding Factorial with For Loop
    System.out.print("Enter a number: ");
    Scanner num = new Scanner(System.in);
    float n = num.nextFloat();

    double sum = 1;

        for (int i = 1 ; i <= n; i++) {
            sum = sum * i ;
        }
         System.out.println("Factorial of " + n + " is : " + sum);
    
  }

// Finding Factorial with For While Loop

/* double sum = 1;
    int i = 1;
        while (i <= n) {
            sum = sum * i ;
            i++;
        }
         System.out.println("Factorial of " + n + " is : " + sum); */
