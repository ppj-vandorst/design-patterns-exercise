package structural.decorator;

public class DecoratedFormatter implements Formatter {
    protected Formatter decoratedFormatter;

    public DecoratedFormatter(Formatter decoratedFormatter) {
        this.decoratedFormatter = decoratedFormatter;
    }

    @Override
    public String formatString(String input) {
        return decoratedFormatter.formatString(input);
    }
}
