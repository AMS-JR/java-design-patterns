package mvc.lazy_initialization.database;

public class DatabaseConnection {
    private static DatabaseConnection INSTANCE;
    public String value;

    private DatabaseConnection(String value){
        this.value = value;
        System.out.println("DB Connection created!");
    }

    public static DatabaseConnection getConnection(String value){
        if(INSTANCE == null){
            INSTANCE = new DatabaseConnection(value);
        }
        return INSTANCE;
    }
}
