
package DAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class PortDao {
    String portcon;
    public String portcon(){
        Path location = Paths.get("c:\\port.txt");

        try {
            byte[] text = Files.readAllBytes(location);
            String read = new String(text);
            portcon = read;
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
        return portcon;
    }
}
