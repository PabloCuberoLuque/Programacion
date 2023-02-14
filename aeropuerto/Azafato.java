package aeropuerto;

public class Azafato extends Persona{
    private double sueldo;
    private Idiomas idiomas;

   
    public Azafato(String nombre, String apellidos, String dni, String mail, double sueldo, Idiomas idiomas){
        super(nombre, apellidos, dni, mail);
        this.sueldo=sueldo;
        this.idiomas=idiomas;   
    }
     
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }
    
}
