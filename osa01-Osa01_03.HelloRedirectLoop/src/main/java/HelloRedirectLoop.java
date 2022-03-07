
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HelloRedirectLoop {

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        
        int requestsCount = 0;
        
        while (true) {
            // waiting for request
            Socket socket = server.accept();
            
            requestsCount++;
            System.out.println("requests count: " + requestsCount);
            
            // read request
            Scanner scanner = new Scanner(socket.getInputStream());
            String firstRow = scanner.nextLine();
            if (firstRow.contains("/quit ")) {
                System.out.println("Quitting server...");
                break;
            }
            
            // write response
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("HTTP/1.1 302 Found");
            printWriter.println("Location: http://localhost:8080/");
            printWriter.println();
            printWriter.flush();
            
            // close resources
            scanner.close();
            printWriter.close();
            socket.close();
        }
                
        server.close();

    }
}
