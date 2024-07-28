// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;  

class HelloWorld {
    public static void main(String[] args) {

System.out.println("Rectangle Area Calculator");

    Scanner len = new Scanner(System.in);
    System.out.println("Enter the length: ");
    double l = len.nextDouble();
    
    Scanner wid = new Scanner(System.in);
    System.out.println("Enter the width: ");
    double w = wid.nextDouble();
    


    Rectangle newRect1 = new Rectangle (l,w);
    System.out.println("Area: " + newRect1.getArea());
    }

static class Rectangle {
    double length;
    double width;
    double area;
    
     public Rectangle (double length , double width ) {
        this.length = length;
        this.width = width;
    }
    
     public double getArea () {
        return (width * length) ;
    }
    
}
}
