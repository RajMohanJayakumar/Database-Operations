package sqlattach;
import java.sql.*;
class jdbcconnection{
    public void dbquery(String query,int a) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/record", "root", "root");
//here sonoo is database name, root is username and password
            if(a==1){
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
                System.out.println(rs.getString(2) + "  " + rs.getString(3));
            con.close();}
            else {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}