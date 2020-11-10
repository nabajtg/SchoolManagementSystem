package Login;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
        public static Connection getConnection(){
        Connection  con = null;
    
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/studentdata", "root", "");
            
            
            }
            catch (SQLException ex) {
                Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return con;
        }  
       
}
