package structural.decorator;

public class UnderscoreFormatter extends DecoratedFormatter {

    public UnderscoreFormatter(Formatter decoratedFormatter) {
        super(decoratedFormatter);
    }

    @Override
    public String formatString(String message) {
        var newMessage = message.replaceAll(" ", "_");
        return decoratedFormatter.formatString(newMessage);
    }
}
