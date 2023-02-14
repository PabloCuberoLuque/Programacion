package aeropuerto;

public class Piloto extends Persona{
    private double salario;
    private boolean vuelosInternacionales;
    private Rango rango;
    
    public Piloto(String nombre, String apellidos, String dni, String mail,Rango rango,double salario, boolean vuelosInternacionales){
        super(nombre,apellidos,dni,mail);
        this.rango=rango;
        this.salario=salario;
        this.vuelosInternacionales=vuelosInternacionales;
        
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getVuelosInternacionales() {
        return vuelosInternacionales;
    }

    public void setVuelosInternacionales(boolean vuelosInternacionales) {
        this.vuelosInternacionales = vuelosInternacionales;
    }
    
}
