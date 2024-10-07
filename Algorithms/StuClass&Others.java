import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
   /*
  // Exponents
    System.out.print("Enter a base: ");
    Scanner base = new Scanner(System.in);
    int b = base.nextInt();

    System.out.print("Enter an exponent: ");
    Scanner exp = new Scanner(System.in);
    int x = exp.nextInt();

    Math.pow(b, x);
    System.out.println(Math.pow(b, x)); */

 /* //Total Number with While Loop
    System.out.print("Enter amount of terms: ");
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int [] numbers = new int [n];
    int h = 0;
    
    while (h < n) 
      {
        System.out.print("Enter number to add: ");
          int num = kb.nextInt();
          numbers [h] = num;
          h++;
      }

    int total = 0;
    h = 0;
    while (h < n) 
      {
        total = total + numbers[h];
      h++ ;
      }
    System.out.println ("Sum = " + total); */
/*
  // Greeting
    System.out.print("Is it AM (1) or PM (2) : ");
    Scanner type = new Scanner(System.in);
    int typ = type.nextInt();
    
    System.out.print("Enter the hour: ");
    Scanner time = new Scanner(System.in);
    int t = time.nextInt();
    
    if (typ == 1) {
      if (t < 4 || t == 12) {
        System.out.println("Good Night");
      }
      else {
        System.out.println("Good Morning");
      }
    }
    
    if (typ == 2) {
      if (t < 4) {
        System.out.println("Good Afternoon");
      }
      else if (t > 4 && t < 8) {
        System.out.println("Good Evening");
      }
      else {
        System.out.println("Good Night");
      } */

// Student Class
Student stu1 = new Student();
stu1.setName("Jane");
stu1.setGrade(8);
stu1.setTeacher("Ms.Amy");
System.out.println(stu1.name + " is in " + stu1.grade + "th grade, " + "her teacher is " + stu1.teacher + ".");

Student stu2 = new Student();
  stu2.setName("John");
  stu2.setGrade(10);
  stu2.setTeacher("Ms.Tammy");
  System.out.println(stu2.name + " is in " + stu2.grade + "th grade, " + "his teacher is " + stu2.teacher + ".");
    
    }

  }

class Student {
  String name;
  int grade;
  String teacher;

  public void setName (String stuName) {
    name = stuName;
  }

  public void setGrade (int stuGrade) {
    grade = stuGrade;
  }

  public void setTeacher (String stuTeacher) {
    teacher = stuTeacher;
  }
  
}

