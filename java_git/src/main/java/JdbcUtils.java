import java.sql.*;

public class JdbcUtils {
    private static String url = "jdbc:mysql://localhost:3306/database";
    private static String user = "root";
    private static String password = "";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void free(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
        rs.close();
        ps.close();
        conn.close();
    }
}
