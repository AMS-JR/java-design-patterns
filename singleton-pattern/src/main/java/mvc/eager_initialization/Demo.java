package mvc.eager_initialization;

public class Demo {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getConnection();
    }
}
