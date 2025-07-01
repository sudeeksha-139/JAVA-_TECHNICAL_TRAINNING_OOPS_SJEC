public class Main {
    public static void main(String[] args) {
        Display display = new Display();

        System.out.println("Using for loop:");
        display.UsingFor();

        System.out.println("\nUsing while loop:");
        display.UsingWhile();
    }
}

class Display {
    public void UsingFor() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void UsingWhile() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
