package Networking;

import java.io.*;
import java.net.*;
public class Server {

    public static void main(String[] args) throws Exception {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(9000);

        // Wait for a client to connect
        Socket socket = serverSocket.accept();

        // Get the input and output streams for the socket
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        // Read the message from the client
        byte[] buffer = new byte[1024];
        int bytesRead = in.read(buffer);

        // Print the message from the client
        System.out.println(new String(buffer, 0, bytesRead));

        // Send a response to the client
        out.write("Hello, client!".getBytes());

        // Close the socket
        socket.close();
    }
}