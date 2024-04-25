package ChainOfResponsibility;


public class SupportSystemTest {
    public static void main(String[] args) {
        SupportHandler hardwareHandler = new HardwareHandler();
        SupportHandler softwareHandler = new SoftwareHandler();
        SupportHandler networkHandler = new NetworkHandler();

        hardwareHandler.setNextHandler(softwareHandler);
        softwareHandler.setNextHandler(networkHandler);

        SupportRequest hardwareRequest = new SupportRequest(SupportRequest.Type.HARDWARE, "Проблемы с компьютером");
        SupportRequest softwareRequest = new SupportRequest(SupportRequest.Type.SOFTWARE, "Проблемы с программным обеспечением");
        SupportRequest networkRequest = new SupportRequest(SupportRequest.Type.NETWORK, "Проблемы с сетью");

        hardwareHandler.handleRequest(hardwareRequest);
        hardwareHandler.handleRequest(softwareRequest);
        hardwareHandler.handleRequest(networkRequest);
    }
}
