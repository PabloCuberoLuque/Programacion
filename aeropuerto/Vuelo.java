package aeropuerto;

public class Vuelo{
    private String ciudadOrigen;
    private String ciudadDestino;
    private Piloto piloto;
    private Pasajero[] pasajeros;
    private int duracion;
    
    public Vuelo(String ciudadOrigen, String ciudadDestino, Piloto piloto, Pasajero[] pasajero,int duracion){
        this.ciudadOrigen=ciudadOrigen;
        this.ciudadDestino=ciudadDestino;
        this.piloto=piloto;
        this.pasajeros=pasajero;
        this.duracion=duracion;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
    
    
    
    
    
}
