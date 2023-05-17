package test;

import java.sql.*;

public class TestMysql {
    
    public static void main(String[] args) {
        // var url = "jdbc:mysql//localhost:3306/persona?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");//Linea requerida para aplicaciones web
            conn = DriverManager.getConnection("jdbc:mysql://localhost/persona?" + "user=root&password=562ghj8op25w");
            stmt = conn.createStatement();//Sirve para modificar
            var sql = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Id_Persona = " + rs.getInt(1));
                System.out.println("nombre= " + rs.getString(2));
                
            }
        } catch (SQLException ex) {
            // ex.printStackTrace(System.out);
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
}
