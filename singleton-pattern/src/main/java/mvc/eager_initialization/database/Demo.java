package mvc.eager_initialization.database;

public class Demo {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getConnection();
    }
}
