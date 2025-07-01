class A {
    public A() {
        System.out.println("Constructor of class A");
    }
}

class B {
    public B() throws Exception {
        System.out.println("Constructor of class B");
        throw new Exception("My Exception");
    }
}

class C {
    public C() {
        // Constructor for class C (empty)
    }
}

public class ExceptionDemo {
    public static void main(String args[]) {
        int x = 0, y = 10;

        try {
            System.out.println("Inside the try block");
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Inside the catch block: " + e);
        } finally {
            System.out.println("Finally block executed");
        }

        A aObj = new A();

        try {
            B bObj = new B();
        } catch (Exception e) {
            System.out.println("Exception caught while creating B object: " + e);
        }
    }
}
