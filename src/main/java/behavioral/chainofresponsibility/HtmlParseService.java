package behavioral.chainofresponsibility;

public class HtmlParseService {

    public boolean handle(String identifier) {
        System.out.println("Trying to identify the user using commercial service");
        return false;
    }
}
