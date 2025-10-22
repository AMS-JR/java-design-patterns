package mvc.eager_initialization.logger;

public class Demo {
    public static void main(String[] args) {
        ApplicationLogger applicationLogger = ApplicationLogger.getLogger();
        ApplicationLogger applicationLogger2 = ApplicationLogger.getLogger();
    }
}
