/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author burgo
 */
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
