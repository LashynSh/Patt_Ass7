package ChainOfResponsibility;

public class SupportRequest {
    public enum Type {HARDWARE, SOFTWARE, NETWORK}

    private Type type;
    private String description;

    public SupportRequest(Type type, String description) {
        this.type = type;
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
