class A {
    public A() {
        System.out.println("constructor A is executed");
    }
}

class B extends A {
    public B() {
        System.out.println("constructor B is executed");
    }
}

class C extends B {
    public C() {
        System.out.println("constructor C is executed");
    }
}

public class ConstructorDemo {
    public static void main(String args[]) {
        C c = new C();
        int x = 10;
        int y = 0;
        try {
            int z = x / y;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
