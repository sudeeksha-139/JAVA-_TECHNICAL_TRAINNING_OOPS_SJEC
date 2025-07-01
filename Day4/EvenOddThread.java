class oddNumber extends Thread {
    int n;
    public oddNumber(int n) {
        this.n = n;
        this.start();
    }

    public void run() {
        System.out.println("Odd Number: " + n);
    }
}

class evenNumber extends Thread {
    int n;
    public evenNumber(int n) {
        this.n = n;
        this.start();
    }

    public void run() {
        System.out.println("Even Number: " + n);
    }
}

public class EvenOddThread {
    public static void main(String args[]) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                new evenNumber(i);
            } else {
                new oddNumber(i);
            }
        }
    }
}
