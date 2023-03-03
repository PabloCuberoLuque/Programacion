package ikea;

public class Electrodomestico extends ProductoHogar{
    private EficienciaEnergetica eficiencia;

    public Electrodomestico( String nombre, String descripcion, double precio, String tipoMaterial,EficienciaEnergetica eficiencia) {
        super(nombre, descripcion, precio, tipoMaterial);
        this.eficiencia = eficiencia;
    }

    public EficienciaEnergetica getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(EficienciaEnergetica eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    
    
}
