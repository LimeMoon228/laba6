/**
 * Інтерфейс для стратегії обробки HTTP-запитів.
 */
public interface RequestHandler {
    /**
     * Метод для обробки HTTP-запиту.
     *
     * @param request текст запиту, який потрібно обробити
     */
    void handleRequest(String request);
}