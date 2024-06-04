
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
            
<<<<<<< HEAD
            String url = "jdbc:jtds:sqlserver://localhost:"+portcon+"/test;instance=SQLEXPRESS;useLOBs=false";
=======
            String url = "jdbc:jtds:sqlserver://localhost:"+portcon+"/test;instance=SQLEXPRESS";
>>>>>>> 19c630b6a2a39c2598f9144e69679081c668b6e7
            con = DriverManager.getConnection(url, "sa", "1234");
           
        } catch (SQLException msg) {
            JOptionPane.showMessageDialog(null, "Conecction SQL Server failed");
        }
        return con;

   
    }   
}
 

