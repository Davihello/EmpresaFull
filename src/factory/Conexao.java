
package factory;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
     public Connection getConnection(){
        
        try{
         
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bdjrr?useTimezone=true&serverTimezone=UTC","root","12345");

}
        catch(SQLException excecao){
                    throw new RuntimeException(excecao);
        }
     }
}