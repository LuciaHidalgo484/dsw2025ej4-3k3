package domain;

public class PaisOficial {
    
    private final String nombre;
    private final String codigoISO;

    public PaisOficial(String nombre, String codigoISO) {
        this.nombre = nombre;
        this.codigoISO = codigoISO;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoISO() {
        return codigoISO;
    }
    
    
    
    
    
}
