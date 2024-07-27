/*
IF WANT NO INPUT
int sum = 1;
        
        for (int i = 1 ; i <= 10; i++) {
            sum = sum * i ;
        System.out.println(sum);
        } */

// WITH THE INPUT
 System.out.print("Enter a number: ");
    Scanner num = new Scanner(System.in);
    int n = num.nextInt();

    int sum = 1;
        
        for (int i = 1 ; i <= n; i++) {
            sum = sum * i ;
        }
         System.out.println("Factorial of " + n + " is : " + sum);
