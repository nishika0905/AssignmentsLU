
/*
COMPILER: A compiler is a computer program 
that takes up code written in a programming 
language and compiles it in object code form 
and then prints the required output.
INTERPRETER: An interpreter job is also to compile 
the program and produce a required output, but 
interpreter is fast in its job as it does not need
 to change the high level language into low level 
 language because it already has precompiled sources
  and scripts. 
*/
import java.util.Scanner;

class Student {
    int roll;
    String name;
    float marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number:");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the marks:");
        marks = sc.nextFloat();

    }

    void display() {
        System.out.println("Roll Number: " + roll + " Name: " + name + " Marks: " + marks);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}