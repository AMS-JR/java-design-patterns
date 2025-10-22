package mvc.inner_static_class;

public class Demo {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getConnection();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getConnection();
    }
}
