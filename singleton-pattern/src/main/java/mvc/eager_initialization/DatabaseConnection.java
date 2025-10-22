package mvc.eager_initialization;

public class DatabaseConnection {
    private static DatabaseConnection INSTANCE = new DatabaseConnection();

    private DatabaseConnection(){
        System.out.println("DB Connection created!");
    }

    public static DatabaseConnection getConnection(){
        return INSTANCE;
    }
}
