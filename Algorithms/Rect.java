// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
  
 //Defining Objects

  //Rectangle 1
    Rectangle newRect1 = new Rectangle ();
        newRect1.height = 10;
        newRect1.width = 8;
        newRect1.length = 13;
        newRect1.area = (newRect1.height * newRect1.width) ;
        
  //Rectangle 2
    Rectangle newRect2 = new Rectangle ();
        newRect2.height = 12;
        newRect2.width = 13;
        newRect2.length = 15;
        newRect2.area = (newRect2.height * newRect2.width) ;
       
  //Rectangle 3
    Rectangle newRect3 = new Rectangle ();
        newRect3.height = 5;
        newRect3.width = 4;
        newRect3.length = 13;
        newRect3.area = (newRect3.height * newRect3.width);
        
    //Rectangle 4
    Rectangle newRect4 = new Rectangle ();
        newRect4.height = 9;
        newRect4.width = 20;
        newRect4.length = 15;
        newRect4.area = (newRect4.height * newRect4.width);
    
    //Rectangle 5
    Rectangle newRect5= new Rectangle ();
        newRect5.height = 11;
        newRect5.width = 12.3;
        newRect5.length = 14.2;
        newRect5.area = (newRect5.height * newRect5.width);
        
        processRectangle (newRect1);
        processRectangle (newRect2);
        processRectangle (newRect3);
        processRectangle (newRect4);
        processRectangle (newRect5);
    }
    
    //Method
    static void processRectangle (Rectangle rect) {
        System.out.println("Area: " + rect.area);
    }


}
class Rectangle {
    double height;
    double width;
    double length;
    double area;
}

