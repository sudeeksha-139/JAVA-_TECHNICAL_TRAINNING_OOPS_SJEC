import java.io.*;
public class Test{
    public static void main(String args[]) throws IOException{
        PrintWriter output = new PrintWriter(System.out,true);
        output.println("enter your message: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String message = input.readLine();
        output.println("you typed: "+message);

    }
}

