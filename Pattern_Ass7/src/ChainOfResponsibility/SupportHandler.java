package ChainOfResponsibility;

public interface SupportHandler {
    void handleRequest(SupportRequest request);

    void setNextHandler(SupportHandler softwareHandler);
}
