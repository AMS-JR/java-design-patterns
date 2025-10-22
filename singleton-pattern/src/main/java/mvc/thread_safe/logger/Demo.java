package mvc.thread_safe.logger;

public class Demo {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused!" + "\n" +
                "If you see different values, then 2 singletons were created!" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();

    }

    private static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            ApplicationLogger applicationLogger = ApplicationLogger.getLogger("FOO");
            System.out.println(applicationLogger.value);
        }
    }

    private static class ThreadBar implements Runnable {
        @Override
        public void run() {
            ApplicationLogger applicationLogger = ApplicationLogger.getLogger("BAR");
            System.out.println(applicationLogger.value);
        }
    }
}
