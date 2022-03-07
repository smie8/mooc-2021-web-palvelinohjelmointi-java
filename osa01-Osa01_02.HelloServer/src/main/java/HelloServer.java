

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HelloServer {

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        
        while (true) {
            // waiting for request
            Socket socket = server.accept();
            
            // read request
            Scanner scanner = new Scanner(socket.getInputStream());
            String  firstRow = scanner.nextLine();
            if (firstRow.contains("/quit ")) {
                System.out.println("Quitting server...");
                break;
            }
                        
            // write response
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Location: http://localhost:8080/");
            printWriter.println();
            
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("index.html"))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    printWriter.println(line);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            printWriter.flush();

            // close resources
            scanner.close();
            printWriter.close();
            socket.close();
        }
        
        server.close();
    }
}
