package mvc.inner_static_class.logger;

public class ApplicationLogger {
    private ApplicationLogger(){
        System.out.println("Logger Instance created!");
    }

    private static class Foo{
        private static ApplicationLogger INSTANCE = new ApplicationLogger();
    }

    public static ApplicationLogger getLogger(){
        return Foo.INSTANCE;
    }
}
