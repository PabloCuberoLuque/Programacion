package ikea;

public class Mueble extends ProductoHogar{
    private String tipoMueble;
    
    public Mueble(String nombre, String descripcion, double precio, String tipoMaterial,String tipoMueble) {
        super(nombre, descripcion, precio, tipoMaterial);
        this.tipoMueble=tipoMueble;
    }

    public String getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }
    
    
    
    
    
}
