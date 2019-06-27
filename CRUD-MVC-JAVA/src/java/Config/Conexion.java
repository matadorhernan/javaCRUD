
package Config;

import java.sql.*;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/School_Info", "postgres", "Davold10");            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
