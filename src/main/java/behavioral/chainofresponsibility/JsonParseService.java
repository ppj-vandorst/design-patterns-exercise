package behavioral.chainofresponsibility;

public class JsonParseService {

    public boolean handle(String identifier) {
        System.out.println("Parsing as JSON");
        return false;
    }
}
