package ProxyDesignPattern;

public interface DocumentAccess {
    void uploadDocument(String document, String user);

    String downloadDocument(String document, String user);

    void editDocument(String document, String user);

    String searchDocument(String query, String user);
}
