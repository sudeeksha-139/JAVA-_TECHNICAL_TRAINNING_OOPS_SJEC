import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + "  Age: " + age);
    }
}

class Student extends Person {
    int usn;
    int marks;

    Student(String name, int age, int usn, int marks) {
        super(name, age);
        this.usn = usn;
        this.marks = marks;
    }

    public void display() {
        super.display();
        System.out.println("USN: " + usn + "  Marks: " + marks);
    }
}
class Teacher extends Person {
    int id;
    double salary;

    Teacher(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("ID: " + id + "  Salary: " + salary);
    }
}
 public class PersonStudent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Person name and age:");
        String personName = sc.nextLine();
        int personAge = sc.nextInt();
        sc.nextLine();

        Person p = new Person(personName, personAge);

        System.out.println("Enter Student name, age, USN, and marks:");
        String studentName = sc.nextLine();
        int studentAge = sc.nextInt();
        int usn = sc.nextInt();
        int marks = sc.nextInt();
        sc.nextLine();

        Student s = new Student(studentName, studentAge, usn, marks);
        
        System.out.println("Enter Teacher name, age, ID, and salary:");
        String teacherName = sc.nextLine();
        int teacherAge = sc.nextInt();
        int id = sc.nextInt();
        double salary = sc.nextDouble();
        sc.nextLine();

        Teacher t = new Teacher(teacherName, teacherAge, id, salary);

        System.out.println("------Person details-----");
        p.display();

        System.out.println("------Student details-----");
        s.display();


        System.out.println("------Teacher details-----");
        s.display();

        sc.close();
    }
}
