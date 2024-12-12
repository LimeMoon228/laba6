/**
 * Клас контексту, який використовує стратегії для обробки HTTP-запитів.
 */
public class RequestProcessor {
    /** Поточний обробник, що відповідає за обробку запиту. */
    private RequestHandler currentHandler;

    /**
     * Змінює стратегію обробки запитів.
     *
     * @param handler новий обробник запитів
     */
    public void setHandler(RequestHandler handler) {
        this.currentHandler = handler;
    }

    /**
     * Обробляє HTTP-запит, використовуючи встановлену стратегію.
     *
     * @param request текст запиту, який потрібно обробити
     */
    public void processRequest(String request) {
        if (currentHandler != null) {
            currentHandler.handleRequest(request);
        } else {
            System.out.println("No handler set for this request.");
        }
    }
}