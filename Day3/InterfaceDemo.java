abstract class Calc{
    abstract public double add(double op1, double op2);
    abstract public double subs(double op1, double op2);
    abstract public double mul(double op1, double op2);
    abstract public double div(double op1, double op2);
}
class MyCalc extends Calc{
    public double add(double op1,double op2){
        return op1+op2;
    }
     public double subs(double op1,double op2){
        return op1-op2;
    }
     public double mul(double op1,double op2){
        return op1*op2;
    }
     public double div(double op1,double op2){
        return op1/op2;
    }
}

public class InterfaceDemo {
    public static void main(String args[]){
         MyCalc m = new MyCalc();
         System.out.println(m.add(10,20));
    }
}
