public class DatabaseConnection {

    private static DatabaseConnection connectionInstance;

    private DatabaseConnection() {
        System.out.println("Database connection is created");
    }

    public static DatabaseConnection getInstance() {
        if (connectionInstance == null) {
            connectionInstance = new DatabaseConnection();
        }
        return connectionInstance;
    }
}
