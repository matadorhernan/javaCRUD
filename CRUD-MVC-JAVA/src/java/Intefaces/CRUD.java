
package Intefaces;

import Modelo.Persona;
import java.util.List;


public interface CRUD {
    public List listar();
    public Persona list(int id);
    public boolean add(Persona per);
    public boolean edit(Persona per);
    public boolean eliminar(int id);
}
/*
<%
String Username = (String) session.getAttribute("Username");%>
<%
if (session.getAttribute("Username")!= null)
&& !session.getAttribute("Username").equals("") {
} else {
response.sendRedirect("/bcu_validacion/index.jsp")
}
%>

Servlet 

@WebServlet ("/LogOut2")
public class LogOut2 extends HttpServlet {

@Override
protected void doGet 
throws

HtttpSession session = req.getSession();
session.invalidate();
resp.sendRedirect("jdbc:postgresql://localhost:5433/School_Info", "postgres", "Davold10");
}
*/