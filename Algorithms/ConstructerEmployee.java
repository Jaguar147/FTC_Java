// Constructer & Function

class HelloWorld {
    public static void main(String[] args) {
        Employee emp1 = new Employee ("John", 20);
            process (emp1);
        
        Employee emp2 = new Employee ("Ally", 30);
            process (emp2);
            
        Employee emp3 = new Employee ("Bob", 25);
            process (emp3);
            }
            
    static void process(Employee emp) {
        System.out.println(emp.name + " " + emp.age);
    }
}

    class Employee {
        String name;
        int age;
        
        public Employee (String n, int a) {
            name = n;
            age = a;
        
    }
}
