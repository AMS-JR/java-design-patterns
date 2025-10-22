package mvc.lazy_initialization.logger;

public class Demo {
    public static void main(String[] args) {
        ApplicationLogger applicationLogger = ApplicationLogger.getLogger("FOO");
        System.out.println(applicationLogger.value);
        ApplicationLogger applicationLogger1 = ApplicationLogger.getLogger("BAR");
        System.out.println(applicationLogger1.value);
    }
}
