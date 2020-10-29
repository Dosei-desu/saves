public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline();
        Console console = new Console(airline);

        console.startConsole();
    }
}
