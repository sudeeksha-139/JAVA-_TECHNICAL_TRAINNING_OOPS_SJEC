class point{
     public int x;
     public int y;
     public void setX(int i){
        x=i;
     }
     public int getX(){
        return x;
     }
    }
public class PointDemo {
    public static void main(String args[]){
        point p = new point();
        p.x=10;
        p.y=20;
        System.out.println("("+p.x+" ,"+p.y+")");
    }
}
