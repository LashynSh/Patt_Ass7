package ChainOfResponsibility;

public class SoftwareHandler implements SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {

    }

    @Override
    public void setNextHandler(SupportHandler softwareHandler) {

    }
}
