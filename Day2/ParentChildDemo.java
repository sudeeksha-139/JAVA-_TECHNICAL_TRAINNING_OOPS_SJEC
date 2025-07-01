class Parent {
    int x = 10;

    public void display() {
        System.out.println("x = " + x);
    }
}

class Child extends Parent {
    int y = 20;
    int x = 30;

    public void display() {
        super.display();
        System.out.println("x = " + super.x + " y = " + y);
    }
}

public class ParentChildDemo {
    public static void main(String args[]) {
        Parent p = new Parent();
        p.display();
        p = new Child();
        p.display();
        Child c = new Child();
        c.x = 20;
        c.display();
    }
}
