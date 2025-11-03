import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static final int PORT = 5555;
    public static final int THREADS = 64;

    public static void main(String[] args) throws IOException {
        Server server = new Server(THREADS);
        server.start(PORT);
    }
}
