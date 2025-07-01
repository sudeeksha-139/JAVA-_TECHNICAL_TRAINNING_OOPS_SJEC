class Point {
    int x, y;

    public Point() {
        this.x = 1;
        this.y = 1;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public void move(int dx,int dy){
        this.x=this.x + dx;
        this.y=this.y + dy;
    }
    public Point add(Point p)
    {
        Point point=new Point();
        point.x=this.x+p.x;
        point.y = this.y+p.y;
        return point;
    }
    void display(){
        System.out.println("("+x+" ,"+y+")");
    }

} 

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2= new Point(15,10);
        p1.move(5,5);
        p1.display();
        p2.display();
        Point p3  = p1.add(p2);
        p3.display();
        System.out.println(p1);
        
        String name = "sudeeksha";
        System.out.println("name: " + name);
    }
}
