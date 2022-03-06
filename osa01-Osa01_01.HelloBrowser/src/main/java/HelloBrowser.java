
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HelloBrowser {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Syötä sivun osoite:");
        String uri = input.nextLine();
        // use default port
        int port = 80;  
        Socket socket;
        try {
            // establish a connection
            socket = new Socket(uri, port);
        } catch (IOException e) {
            throw new IOException("Resource not found");
        }

        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("GET / HTTP/1.1");
        writer.println("Host: " + uri);
        writer.println();
        writer.flush();

        // read response from server
        Scanner reader = new Scanner(socket.getInputStream());
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
    }
}
