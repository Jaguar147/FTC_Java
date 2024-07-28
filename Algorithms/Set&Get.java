// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
  
    Rectangle newRect1 = new Rectangle ();
        newRect1.setWidth(8);
        newRect1.setLength(10);
        newRect1.getArea();    
        System.out.println(newRect1.getArea());
    }



static class Rectangle {
    double length;
    double width;
    double area;
    
    public void setLength (double length) {
        this.length = length ;
    }
    
    public void setWidth (double width) {
        this.width = width ;
    }
    
    public double getArea () {
        return (width * length) ;
    }
}
}
