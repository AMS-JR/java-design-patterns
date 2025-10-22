package mvc.eager_initialization.logger;

public class ApplicationLogger {
    private static ApplicationLogger INSTANCE = new ApplicationLogger();

    private ApplicationLogger(){
        System.out.println("Logger Instance Created!");
    }

    public static ApplicationLogger getLogger(){
        return INSTANCE;
    }
}
