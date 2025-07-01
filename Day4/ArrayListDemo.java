import java.util.ArrayList;

class Student {
    private int usn;
    private String name;
    float marks;

    public Student(int usn, String name, float marks) {
        this.usn = usn;
        this.name = name;
        this.marks = marks;
    }

    public int getUsn() {
        return usn;
    }

    public void Display() {
        System.out.println(usn + " " + name + " " + marks);
    }
}

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101, "Sudeeksha", 99.9f));
        al.add(new Student(102, "Ravi", 88.5f));
        al.add(new Student(103, "Meena", 76.0f));

        System.out.println("Length: " + al.size());

        Student temp = null;

        for (Student s : al) {
            if (s.getUsn() == 103) {
                temp = s;
                break;
            }
        }

        al.remove(temp);

        for (Student s : al) {
            s.Display();
        }
    }
}
