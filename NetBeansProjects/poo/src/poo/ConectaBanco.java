package poo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eike
 */
public class ConectaBanco {
    
    private static Connection conexao;
    private static String url;
    private static String usuario = "root";
    private static String senha = "123456";
    private static String banco = "poo";

    public static Connection getConexao() {
        try{
        if(conexao == null){
            setUrl("jdbc:mysql://127.0.0.1:3306/"+getBanco()+"?useSSL=true");
            Class.forName("com.mysql.jdbc.Driver");
            conexao=DriverManager.getConnection(getUrl(),getUsuario(),getSenha());
        }
        
        }catch(ClassNotFoundException cnfex){
            System.out.println("ERRO0116: Driver não carregado");
            System.exit(0);
        }catch(SQLException sqlex){
            sqlex.printStackTrace();
            System.exit(0);
        }
        return conexao;
    }

    public static void setConexao(Connection conexao) {
        ConectaBanco.conexao = conexao;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ConectaBanco.url = url;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        ConectaBanco.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ConectaBanco.senha = senha;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        ConectaBanco.banco = banco;
    }
    
}
