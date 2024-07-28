// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
   
    System.out.println("Student Name: Bob Jones");

   
    Student newGrd1 = new Student ();
        newGrd1.subject = "Science";
        newGrd1.number = 90;
        
    Student newGrd2 = new Student ();
        newGrd2.subject = "Math";
        newGrd2.number = 91;
        
    Student newGrd3 = new Student ();
        newGrd3.subject = "ILA";
        newGrd3.number = 87;
    
    Student newGrd4 = new Student ();
        newGrd4.subject = "History";
        newGrd4.number = 95;
    
    Student newGrd5= new Student ();
        newGrd5.subject = "Art";
        newGrd5.number = 93.7;
        
        processStudent(newGrd1);
        processStudent(newGrd2);
        processStudent(newGrd3);
        processStudent(newGrd4);
        processStudent(newGrd5);
    }
    
    static void processStudent (Student grd) {
        System.out.println(grd.subject + " Grade: " + grd.number);
    }
}
class Student {
    String subject;
    double number;
}

