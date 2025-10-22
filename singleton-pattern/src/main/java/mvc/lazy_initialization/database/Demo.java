package mvc.lazy_initialization.database;

import javax.xml.crypto.Data;

public class Demo {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getConnection("DB");
        System.out.println(databaseConnection.value);
        DatabaseConnection databaseConnection1 = DatabaseConnection.getConnection("DB2");
        System.out.println(databaseConnection1.value);
    }
}
