package DAO;

import DTO.UserDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    
    Connection con;

    public ResultSet userAuth(UserDTO objUserDTO) throws SQLException {
        con = new ConexionDAO().connectDB();

        try {
            String sql = "select * from usuarios where usuario = ? AND contraseña = ? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, objUserDTO.getUserDB());
            statement.setString(2, objUserDTO.getPassDB());
            

            ResultSet result = statement.executeQuery();
            return result;
        } catch (SQLException msg) {
            JOptionPane.showMessageDialog(null, "UserDAO: " + msg);
            return null;
        }

    }

}
