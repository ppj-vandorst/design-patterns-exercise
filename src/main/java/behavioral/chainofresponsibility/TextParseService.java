package behavioral.chainofresponsibility;

public class TextParseService {

    public boolean handle(String identifier) {
        System.out.println("Trying to identify the user locally");
        return false;
    }
}
