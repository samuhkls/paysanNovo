package model;

import java.sql.DriverManager; // Driver para abrir Conexão
import java.sql.SQLException; // Tratamento de Erros SQL
import java.sql.Connection; // Armazena a Conexão Aberta
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ConectarDao {
public  Connection con = null;
    public String       sql = null;

    public ConectarDao () {
        String strcon = "jdbc:mysql://localhost:3306/ProjCad";//cria a string de conexão ao servidor xaamp 
        try {

            con = DriverManager.getConnection(strcon, "root", "");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
        }
    }




   
}