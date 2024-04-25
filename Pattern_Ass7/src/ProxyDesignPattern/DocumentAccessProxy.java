package ProxyDesignPattern;

public class DocumentAccessProxy implements DocumentAccess {
    private RealDocumentAccess realAccess;

    public DocumentAccessProxy() {
        this.realAccess = new RealDocumentAccess();
    }

    public void uploadDocument(String document, String user) {
        System.out.println("User authentication and permission check for upload by " + user);
        realAccess.uploadDocument(document, user);
    }

    public String downloadDocument(String document, String user) {
        System.out.println("User authentication and permission check for download by " + user);
        return realAccess.downloadDocument(document, user);
    }

    public void editDocument(String document, String user) {
        System.out.println("User authentication and permission check for edit by " + user);
        realAccess.editDocument(document, user);
    }

    public String searchDocument(String query, String user) {
        System.out.println("User authentication and permission check for search by " + user);
        return realAccess.searchDocument(query, user);
    }
}
