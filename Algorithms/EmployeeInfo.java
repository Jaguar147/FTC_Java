//Create new class, objects, and methods

class HelloWorld {
    public static void main(String[] args) {
   
    Employee newEmp1 = new Employee ();
        newEmp1.name = "Bob";
        newEmp1.expYears = 5;
        
    Employee newEmp2 = new Employee ();
        newEmp2.name = "Lindsay";
        newEmp2.expYears = 2;
        
    Employee newEmp3 = new Employee ();
        newEmp3.name = "Peppa";
        newEmp3.expYears = 0;
    
    Employee newEmp4 = new Employee ();
        newEmp4.name = "Steve";
        newEmp4.expYears = 1;
        
        processEmployee(newEmp1);
        processEmployee(newEmp2);
        processEmployee(newEmp3);
        processEmployee(newEmp4);
    }
    
    static void processEmployee (Employee emp) {
        System.out.println(emp.name + " " + emp.expYears);
    }
}
class Employee {
    String name;
    int expYears;
}
