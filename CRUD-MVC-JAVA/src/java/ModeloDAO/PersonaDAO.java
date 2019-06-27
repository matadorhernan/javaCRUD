
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p=new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql="SELECT * FROM public.\"Users\"";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("id"));
                per.setUsername(rs.getString("Username"));
                per.setPassword(rs.getString("Password"));
                per.setnombre(rs.getString("nombre"));
                per.setApeido(rs.getString("Apeido"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql="SELECT * FROM public.\"Users\" WHERE id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt("id"));
                p.setUsername(rs.getString("Username"));
                p.setPassword(rs.getString("Password"));
                p.setnombre(rs.getString("nombre"));
                p.setApeido(rs.getString("Apeido"));
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
        System.out.println("Insert function");
       String sql ="INSERT INTO public.\"Users\"(id,\"Username\",\"Password\",\"nombre\",\"Apeido\")VALUES(default,'"+per.getUsername()+"','"+per.getPassword()+"','"+per.getnombre()+"','"+per.getApeido()+"')";
        System.out.println(sql);
       try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql="update into users set Username='"+per.getUsername()+"', Password='"+per.getPassword()+"',nombre='"+per.getnombre()+"',Apeido='"+per.getApeido()+"'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="DELETE FROM public.\"Users\" WHERE id="+id+"";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
