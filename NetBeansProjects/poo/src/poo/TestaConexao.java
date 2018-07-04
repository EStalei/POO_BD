package poo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author eike
 */
public class TestaConexao {
public static void main(String args[]){
    ConectaBanco.getConexao();
    try{
        Connection con = ConectaBanco.getConexao();
        PreparedStatement pstmt;
        pstmt = con.prepareStatement("INSET DNTO pessoafisica (nome)" + "VALUES(?);");
        pstmt.setString(1,"ZÉ");
        pstmt.executeUpdate();
    }catch (Exception ex){
        
    }
}
}
