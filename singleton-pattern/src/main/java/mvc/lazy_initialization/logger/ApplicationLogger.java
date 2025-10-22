package mvc.lazy_initialization.logger;

public class ApplicationLogger {
    private static ApplicationLogger INSTANCE;
    public String value;

    private ApplicationLogger(String value){
        System.out.println("Logger Instance Created!");
        this.value = value;
    }

    public static ApplicationLogger getLogger(String value){
        if(INSTANCE == null){
            INSTANCE = new ApplicationLogger(value);
        }
        return INSTANCE;
    }

}
