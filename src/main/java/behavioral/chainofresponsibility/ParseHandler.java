package behavioral.chainofresponsibility;

public interface ParseHandler {
    void setNext(ParseHandler handler);

    boolean handle(String identifier);
}
