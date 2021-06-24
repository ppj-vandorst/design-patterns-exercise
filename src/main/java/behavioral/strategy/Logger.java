package behavioral.strategy;

public class Logger {
    private LoggingStrategy strategy;

    public void setStrategy(LoggingStrategy strategy) {
        this.strategy = strategy;
    }

    public void log(String message) {
        this.strategy.log(message);
    }
}
