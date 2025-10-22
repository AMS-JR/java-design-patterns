package mvc.thread_safe;

public class DatabaseConnection {
    private static DatabaseConnection INSTANCE;
    public String value;

    private DatabaseConnection(String value){
        this.value = value;
        System.out.println("DB Connection created!");
    }

    /**
     * Double-Checked Locking
     */
    public static DatabaseConnection getConnection(String value){
        if(INSTANCE == null){
            synchronized (DatabaseConnection.class){
                if (INSTANCE == null){
                    INSTANCE = new DatabaseConnection(value);
                }
            }
        }
        return INSTANCE;
    }
}
