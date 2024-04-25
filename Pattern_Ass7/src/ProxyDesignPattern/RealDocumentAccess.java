package ProxyDesignPattern;

public class RealDocumentAccess implements DocumentAccess {
    public void uploadDocument(String document, String user) {
        System.out.println(user + " uploaded document: " + document);
    }

    public String downloadDocument(String document, String user) {
        System.out.println(user + " downloaded document: " + document);
        return "Document content";
    }

    public void editDocument(String document, String user) {
        System.out.println(user + " edited document: " + document);
    }

    public String searchDocument(String query, String user) {
        System.out.println(user + " searched for: " + query);
        return "Search results";
    }
}
