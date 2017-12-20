/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos.controlador;

import java.sql.SQLException;
import java.util.Date;
import recursoshumanos.modelo.ModeloCrud;

/**
 *
 * @author Cèsar
 */
public class ControladorCrud {
    private ModeloCrud modeloCrud;
    
    public boolean agregaPersona(String rut, Date fechaIngreso, String direccion, Date fechaNacimiento, String nombre) throws SQLException{
        modeloCrud=new ModeloCrud();
        return modeloCrud.agregaPersona(rut, fechaIngreso, direccion, fechaNacimiento, nombre);
    }
    
}
