package aeropuerto;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String mail;

    public Persona(String nombre, String apellidos, String dni, String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
}
