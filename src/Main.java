import java.util.Map;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(Main.class.getName());
        Map<String, String> envVariables = System.getenv();
        for (Map.Entry<String, String> entry : envVariables.entrySet()) {
            String variableName = entry.getKey();
            String variableValue = entry.getValue();
            logger.info(variableName + "=" + variableValue);
        }
    }
}
