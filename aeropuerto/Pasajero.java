package aeropuerto;

public class Pasajero extends Persona{
    private int nPasaporte;
    
    public Pasajero(String nombre, String apellidos, String dni, String mail, int nPasaporte) {
        super(nombre, apellidos, dni, mail);
        this.nPasaporte=nPasaporte;
            
    }

    public int getnPasaporte() {
        return nPasaporte;
    }

    public void setnPasaporte(int nPasaporte) {
        this.nPasaporte = nPasaporte;
    }
    
    
    
}
