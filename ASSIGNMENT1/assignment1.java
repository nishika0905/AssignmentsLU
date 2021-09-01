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