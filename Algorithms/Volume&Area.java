// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;  

public class HelloWorld {
    public static void main(String[] args) {

    System.out.println("Area & Volume Calculator");

   Scanner voa = new Scanner(System.in);
    System.out.println("Do you want area(1) or volume (2) : ");
    int t = voa.nextInt();
    
    
    if (t == 1) {
    Scanner len = new Scanner(System.in);
    System.out.println("Enter the length: ");
    double l = len.nextDouble();
    
    Scanner wid = new Scanner(System.in);
    System.out.println("Enter the width: ");
    double w = wid.nextDouble();
  
    Rectangle newRect1 = new Rectangle ();
    newRect1.setLength(l);
    newRect1.setWidth(w);

    System.out.println("Area: " + newRect1.getArea());
    } 
    
    else if (t==2) { 
        
    Scanner len = new Scanner(System.in);
    System.out.println("Enter the length: ");
    double l = len.nextDouble();
    
    Scanner wid = new Scanner(System.in);
    System.out.println("Enter the width: ");
    double w = wid.nextDouble();
    
    Scanner hei = new Scanner(System.in);
    System.out.println("Enter the height: ");
    double h = hei.nextDouble();
  
    Rectangle newRect1 = new Rectangle ();
    newRect1.setLength(l);
    newRect1.setHeight(h);
    newRect1.setWidth(w);

    System.out.println("Volume: " + newRect1.getVolume());
    }
    
}
}

 class Rectangle {
    double length;
    double width;
    double area;
    double height;
    double volume;

    public void setLength (double length) {
        this.length = length ;
    }
    
    public void setWidth (double width) {
        this.width = width ;
    }
    
    public void setHeight (double height) {
        this.height = height;
    }
    
    public double getArea () {
        return (width * length) ;
    }
    
    public double getVolume () {
        return (width * length * height) ;
    }
}
