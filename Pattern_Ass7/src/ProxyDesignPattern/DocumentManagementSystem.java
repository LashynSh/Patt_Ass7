package ProxyDesignPattern;

public class DocumentManagementSystem {
    public static void main(String[] args) {
        DocumentAccess access = new DocumentAccessProxy();

        access.uploadDocument("New document", "user1");
        access.downloadDocument("Document1", "user2");
        access.editDocument("Document1", "user1");
        access.searchDocument("important", "user2");
    }
}

