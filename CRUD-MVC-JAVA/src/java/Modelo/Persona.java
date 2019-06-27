package Modelo;

public class Persona {

    int id;
    String Username;
    String Password;
    String nombre;
    String Apeido;

    public Persona() {
    }

    public Persona(String Username, String Password, String nombre, String Apeido) {
        this.Username = Username;
        this.Password = Password;
        this.nombre = nombre;
        this.Apeido = Apeido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeido() {
        return Apeido;
    }

    public void setApeido(String Apeido) {
        this.Apeido = Apeido;
    }
    
}
