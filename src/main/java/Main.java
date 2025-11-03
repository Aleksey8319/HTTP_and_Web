public class Main {
    public static final int PORT = 5555;
    public static final int THREADS = 64;

    public static void main(String[] args) {
        Server server = new Server(THREADS);
        server.start(PORT);
    }
}
