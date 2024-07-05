public enum TipoAutomovil {
    
    SEDAN("Sedan", "Auto mediano", 4),
    HATCHBACK("Hatchback", "Auto Compacto", 4),
    VAN("VAN", "Transporta 6, 8 o mas personas o cosas", 5),
    MINIVAN("Minivan", "Transporta personas o cosas", 3),
    COUPE("Coupe", "Auto pequeño", 2),
    CAMIONETA("Camioneta", "Familiar", 4),
    SUV("SUV","Todo terreno deportivo", 5);
    
    private final String nombre;
    private final String descripcion;
    private final int cantidadPuertas;


    TipoAutomovil(String nombre, String descripcion, int cantidadPuertas){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }


}
