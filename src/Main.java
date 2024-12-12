/**
 * Головний клас для тестування реалізації обробки HTTP-запитів.
 */
public class Main {
    public static void main(String[] args) {
        RequestProcessor processor = new RequestProcessor();

        processor.setHandler(new GetRequestHandler());
        processor.processRequest("GET /index.html");

        processor.setHandler(new PostRequestHandler());
        processor.processRequest("POST /submit-form");
    }
}