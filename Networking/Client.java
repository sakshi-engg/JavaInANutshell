package Networking;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {
        // Get the address of the server
        InetAddress serverAddress = InetAddress.getByName("localhost");

        // Create a socket to connect to the server
        Socket socket = new Socket(serverAddress, 9000);

        // Get the input and output streams for the socket
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        // Send a message to the server
        out.write("Hello, world!".getBytes());

        // Read the response from the server
        byte[] buffer = new byte[1024];
        int bytesRead = in.read(buffer);

        // Print the response from the server
        System.out.println(new String(buffer, 0, bytesRead));

        // Close the socket
        socket.close();
    }
}