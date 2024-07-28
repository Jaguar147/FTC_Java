// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {

    Rectangle newRect1 = new Rectangle ();
        newRect1.setwidth(8);
        newRect1.setlength(10);
        newRect1.getArea();    
        System.out.println(newRect1.getArea());
        
    Rectangle newRect2 = new Rectangle (7.0,8.4);
    System.out.println(newRect2.getArea());
    }



static class Rectangle {
    double length;
    double width;
    double area;
    
     public Rectangle (double length , double width ) {
        this.length = length;
        this.width = width;
    }
    
        public Rectangle () {
        super () ;
    }
    
    public void setlength (double length) {
        this.length = length ;
    }
    
    public void setwidth (double width) {
        this.width = width ;
    }
    
    public double getArea () {
        return (width * length) ;
    }
}
}
