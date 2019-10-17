import java.sql.*;

public class test {
    public static void main(String[] args) {
        template();
    }

    static void template() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            ps = conn.prepareStatement("select * from user;");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getObject("id") + "\t" + rs.getObject("name") + "\t" +
                        rs.getObject("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
