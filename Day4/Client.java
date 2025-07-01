import java.io.*;
import java.net.*;

class ServerReader extends Thread {
    Socket clientSocket;

    // Corrected constructor name and parameter spelling
    public ServerReader(Socket clientSocket) {
        this.clientSocket = clientSocket;
        this.start();
    }

    public void run() {
        try {
            // Fixed: getInputStream used properly
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            while (true) {
                String message = input.readLine();

                // Exit if client disconnects or message is null
                if (message == null || message.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("Message from client: " + message);
            }

            input.close();
            clientSocket.close();  // close the connection
        } catch (Exception e) {
            System.out.println("Error in ServerReader: " + e.getMessage());
        }
    }
}
