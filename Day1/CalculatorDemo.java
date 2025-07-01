class Calculator{
    static int add(int i,int j){
        return i+j;
    }
    static float add(float i,float j){
        return i+j;
    }
    static int add(int i,int j,int z){
        return i+j+z;
    }
}
public class CalculatorDemo {
    public static void main(String args[]){
        System.out.println("add two integers"+Calculator.add(10,20));
        System.out.println("add two float"+Calculator.add(10.5f,20.5f));
        System.out.println("add two integers"+Calculator.add(10,20,30));
    }
    
}
