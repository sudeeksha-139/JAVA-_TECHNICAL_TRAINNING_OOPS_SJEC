import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]){
        try{
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server Started..........");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client is connected");
        PrintWriter output = new  PrintWriter(clientSocket.getOutputStream(),true);
        output.println("hello world ");

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String message1 = input.readLine();
        System.out.println("message from client: "+ message1);
        serverSocket.close();
        }
        catch (Exception e){

         
        }
    }
    
}
