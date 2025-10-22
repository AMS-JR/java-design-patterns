package mvc.inner_static_class;

public class DatabaseConnection {

    private DatabaseConnection(){
        System.out.println("DB connection created!");
    }

    private static class Foo{
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getConnection(){
        return Foo.INSTANCE;
    }
}
