
package dao;

import factory.Conexao;
import gui.MenuSecretario;
import gui.Login;
import gui.MenuAlunos;
import gui.MenuEmpresa;
import gui.MenuOrientador;

import gui.MenuPrincipal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;


public class LoginDAO {
    
    private Connection connection;
    private int id;
    public String username;
    private String senha;
    private String perfil;
    private Login gui;
    private MenuSecretario cu;
    public String nome;
    
     
     
     
     public LoginDAO(Login gui){ 
        this.connection = new Conexao().getConnection();
        this.gui = gui;
    
     }
    
     
     public void logar(){
       
         
         String username = gui.getTxtUsername().getText();
         String senha = gui.getTxtSenha().getText();
         
         try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        try (Connection conn = (Connection) 
                
                 DriverManager.getConnection("jdbc:mysql://localhost:3306/bdjrr?useTimezone=true&serverTimezone=UTC","root","12345"); 
                Statement stmt = (Statement) conn.createStatement()) {

            String query = "select * from usuarios where username = '" + username +"' and senha = '" + senha + "'";

                try (ResultSet rs = stmt.executeQuery(query)) {
                    if (rs.next()) {
                        
                       String perfil = rs.getString("perfil");
       
                        if("Orientador".equals(perfil)){
                            nome = username;
                           JOptionPane.showMessageDialog(null, "Você, " + nome + ", está conectado com êxito!");
                           MenuOrientador menu = new MenuOrientador();
                           menu.setVisible(true);
                           this.gui.dispose();
                        }
                        
                        else if("Aluno".equals(perfil)){
                            nome = username;
                           JOptionPane.showMessageDialog(null, "Você, " + nome + ", está conectado com êxito!");
                           MenuAlunos aluno = new MenuAlunos();
                           aluno.setVisible(true);
                           this.gui.dispose();
                        }
                        
                        else if("Empresa".equals(perfil)){
                            nome = username;
                           JOptionPane.showMessageDialog(null, "Você, " + nome + ", está conectado com êxito!");
                           MenuEmpresa empre = new MenuEmpresa();
                           empre.setVisible(true);
                           this.gui.dispose();
                        }
                        
                         else if("Administrador".equals(perfil)){
                           nome = username;
                           JOptionPane.showMessageDialog(null, "Você, " + nome + ", está conectado com êxito!");
                           MenuPrincipal cadas= new MenuPrincipal();
                           cadas.setVisible(true);
                           this.gui.dispose();
                        }
                        
                         else if("Secretario".equals(perfil)) {
                             nome = username;
                             JOptionPane.showMessageDialog(null, "Você, " + nome + ", está conectado com êxito!");
                             MenuSecretario cadas = new MenuSecretario();
                             cadas.setVisible(true);
                             this.gui.dispose();
                         }
                        
                    }
                    

                    else {
                        JOptionPane.showMessageDialog(null,"Usuário e/ou senha incorretos. Tente novamente.");
                        gui.getTxtUsername().setText("");
                        gui.getTxtSenha().setText("");
                        
                    }   
                }
        
                 

    
        }
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        
   }
     
     
     
     
     
    
}
