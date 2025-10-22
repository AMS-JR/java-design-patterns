package mvc.thread_safe.logger;

public class ApplicationLogger {
    private static ApplicationLogger INSTANCE;
    public String value;

    private ApplicationLogger(String value){
        System.out.println("Logger Instance Created!");
        this.value = value;
    }
    /**
     * Double-Checked Locking
     */
    public static ApplicationLogger getLogger(String value){
        if(INSTANCE == null){
            synchronized (ApplicationLogger.class){
                if(INSTANCE == null)
                    INSTANCE = new ApplicationLogger(value);
            }
        }
        return INSTANCE;
    }
}
