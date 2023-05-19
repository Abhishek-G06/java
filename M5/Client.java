package M5;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to the server
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server.");


            // Create input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the server
            String message = "Hello, server!";
            out.println(message);
            System.out.println("Sent message to server: " + message);

            // Receive response from the server
            String serverResponse = in.readLine();
            System.out.println("Server response: " + serverResponse);

            // Close the streams and socket
            in.close();
            out.close();
            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}