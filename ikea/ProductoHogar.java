package ikea;

abstract class ProductoHogar extends Producto{
    private String tipoMaterial;

    public ProductoHogar(String nombre, String descripcion, double precio,String tipoMaterial){
        super(nombre, descripcion, precio);
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
}
