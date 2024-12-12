/**
 * Реалізація обробника для GET-запитів.
 */
public class GetRequestHandler implements RequestHandler {
    /**
     * Обробляє GET-запит.
     *
     * @param request текст GET-запиту
     */
    @Override
    public void handleRequest(String request) {
        System.out.println("Handling GET request: " + request);
    }
}