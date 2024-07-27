
//Find the Factors of an Integer
    System.out.print("Enter a number: ");
    Scanner product = new Scanner(System.in);
    int p = product.nextInt();
    System.out.println("The factors of " + p + " are : " );
    
    for (int k = 1; k <= p ; k++) {
        if (p % k == 0 ) {
        System.out.println(k + " ");
        }
