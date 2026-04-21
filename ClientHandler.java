import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String clientName;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Enter your name:");
            clientName = in.readLine();

            ChatServer.broadcast(clientName + " has joined the chat.", this);
            System.out.println(clientName + " connected.");

            String message;
            while ((message = in.readLine()) != null) {
                String fullMessage = clientName + ": " + message;
                System.out.println(fullMessage);
                ChatServer.broadcast(fullMessage, this);
            }

        } catch (IOException e) {
            System.out.println(clientName + " disconnected.");
        } finally {
            closeConnection();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    private void closeConnection() {
        try {
            ChatServer.removeClient(this);
            if (clientName != null) {
                ChatServer.broadcast(clientName + " has left the chat.", this);
            }
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}