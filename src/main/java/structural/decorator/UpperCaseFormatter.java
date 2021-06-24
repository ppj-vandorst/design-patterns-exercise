package structural.decorator;

public class UpperCaseFormatter extends DecoratedFormatter {
    public UpperCaseFormatter(Formatter decoratedFormatter) {
        super(decoratedFormatter);
    }

    @Override
    public String formatString(String message) {
        var newMessage = message.toUpperCase();
        return decoratedFormatter.formatString(newMessage);
    }
}
