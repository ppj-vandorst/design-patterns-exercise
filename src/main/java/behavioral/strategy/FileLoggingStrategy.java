package behavioral.strategy;

import java.io.FileWriter;
import java.io.IOException;

public class FileLoggingStrategy implements LoggingStrategy {

    @Override
    public void log(String message) {
        try {
            FileWriter myWriter = new FileWriter("src/main/java/behavioral/strategy/log.txt");
            myWriter.write(message);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
