
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionDAO {
   
    String portcon;
    public Connection connectDB() {
        Connection con = null;
        portcon = new PortDao().portcon();
        try {
            
            String url = "jdbc:jtds:sqlserver://localhost:"+portcon+"/test;instance=SQLEXPRESS;useLOBs=false";
            con = DriverManager.getConnection(url, "sa", "1234");
           
        } catch (SQLException msg) {
            JOptionPane.showMessageDialog(null, "Conecction SQL Server failed");
        }
        return con;

   
    }   
}
 

