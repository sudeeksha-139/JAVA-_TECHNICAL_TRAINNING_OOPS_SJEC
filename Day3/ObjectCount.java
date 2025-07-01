public class ObjectCount {
    static int count;

    public ObjectCount() {
        count++;
    }

    public void display() {
        System.out.println("Object number: " + count);
    }

    public static void main(String[] args) {
        ObjectCount obj;

        for (int i = 1; i <= 5; i++) {
            obj = new ObjectCount();
            obj.display();
        }

        System.out.println("Total number of objects created: " + count);
    }
}
