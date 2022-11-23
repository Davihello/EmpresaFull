
package dao;

import factory.Conexao;
import gui.MenuSecretario;
import gui.Login;
import gui.MenuAlunos;
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

public class UsuarioDAO {
    
    private Connection connection;
    private int id;
    private String username;
    private String curso;
    private String senha;
    private String perfil;
    private String email;
    private String telefone;
    private String cep;
    private String bairro;
    private String cpf;
    private String data_nascimento;
    private String unidade_federal;
    private String rg;
    private String data_inicio;
    private String data_termino;
    private String razao;
    private Login gui;
    
    
    
    public UsuarioDAO(){ 
        this.connection = new Conexao().getConnection();
        
    }
    
    
    public void inserir(Usuario usuario){
    
        String sql = "INSERT INTO usuarios(username, curso, perfil, senha, email, cep, Bairro, Unidade_federal, Pai, Mae, cpf, telefone, data_nascimento, Rg, data_inicio, data_termino, qualificacao, razao)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
       try{
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, usuario.getUsername());
           stmt.setString(2, usuario.getCurso());
           stmt.setString(3, usuario.getPerfil());
           stmt.setString(4, usuario.getSenha());
           stmt.setString(5, usuario.getEmail());
           stmt.setString(6, usuario.getCep());
           stmt.setString(7,usuario.getBairro());
           stmt.setString(8, usuario.getUnidade_Federal());
           stmt.setString(9, usuario.getPai());
           stmt.setString(10, usuario.getMae());
           stmt.setString(11, usuario.getCpf());
           stmt.setString(12, usuario.getTelefone());
           stmt.setString(13, usuario.getData_nascimento());
           stmt.setString(14, usuario.getRg());
           stmt.setString(15, usuario.getData_inicio());
           stmt.setString(16, usuario.getData_termino());
           stmt.setString(17, usuario.getQualificacao());
           stmt.setString(18, usuario.getRazao());
   
           stmt.execute();
           stmt.close();
           
           
           
       }
       catch(SQLException u){
           throw  new RuntimeException(u);
       } 
          
    }
     
    public Usuario consultar(Usuario usuario){
        
        Usuario consulta = new Usuario();
        String sql = "select * "
                + "from usuarios where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,String.valueOf(usuario.getId()));
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                consulta.setUsername(rs.getString(2));
                consulta.setCurso(rs.getString(3));
                consulta.setPerfil(rs.getString(4));
                consulta.setSenha(rs.getString(5));
                consulta.setEmail(rs.getString(6));
                consulta.setCep(rs.getString(7));
                consulta.setBairro(rs.getString(8));
                consulta.setUnidade_Federal(rs.getString(9));
                consulta.setPai(rs.getString(10));
                consulta.setMae(rs.getString(11));
                consulta.setCpf(rs.getString(12));
                consulta.setTelefone(rs.getString(13));
                consulta.setCnpj(rs.getString(14));
                consulta.setData_nascimento(rs.getString(15));
                consulta.setRg(rs.getString(16));
                consulta.setData_inicio(rs.getString(17));
                consulta.setData_termino(rs.getString(18));
                consulta.setQualificacao(rs.getString(19));
                consulta.setRazao(rs.getString(20));
                
                
                
                
                
                
                
            
            }
            else{
                consulta = null;
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return(consulta);
    }
    
    
}
