/**
 * Реалізація обробника для POST-запитів.
 */
public class PostRequestHandler implements RequestHandler {
    /**
     * Обробляє POST-запит.
     *
     * @param request текст POST-запиту
     */
    @Override
    public void handleRequest(String request) {
        System.out.println("Handling POST request: " + request);
    }
}
