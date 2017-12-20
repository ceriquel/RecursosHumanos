/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos.modelo;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import recursoshumanos.conexion.Conexion;

/**
 *
 * @author Cèsar
 */
public class ModeloCrud {

    public boolean agregaPersona(String rut, Date fechaIngreso, String direccion, Date fechaNacimiento, String nombre) throws SQLException {
        boolean flag = false;
        System.out.println("Insertar registro...");
        Statement dec;
        dec = Conexion.conexion.createStatement();
        String query1 = "insert into PERSONAL (RUT, FECHA_INGRESO, DIRECCION, FECHA_NACIMIENTO, NOMBRE) VALUES ('" + rut + "','" + fechaIngreso + "', '" + direccion + "', '" + fechaNacimiento + "','" + nombre + "')";
        dec.executeUpdate(query1);
        return flag = true;

    }

}
