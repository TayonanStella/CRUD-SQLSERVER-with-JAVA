
package QUERY;
import VIEW.MenuView;
import DAO.ConexionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Cancelados {

    Connection con = new ConexionDAO().connectDB();
   
    String sql = new MenuView().cancelados();
    
    
     public ResultSet res(){   
        ResultSet result = null; 
        try {
            
            PreparedStatement st = con.prepareStatement("select * from facturas");
            ResultSet rs = st.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            int numColumns = metaData.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

            con.close();
        } catch (SQLException ex) {
            System.err.println("Erro ao executar a consulta: " + ex.getMessage());
        }
        return result;
    }
}

