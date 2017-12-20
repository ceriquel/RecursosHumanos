/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import recursoshumanos.conexion.Conexion;

/**
 *
 * @author Cèsar
 */
public class ModeloCrud {
    
     public void modificar(int codigo, String rut, String nombre, String fechaIngreso, String direccion, String fechaNacimiento) throws SQLException{
        System.out.println("Modificar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="UPDATE PERSONAL SET RUT='"+rut+"', NOMBRE='"+nombre+"', FECHA_INGRESO='"+fechaIngreso+"', DIRECCION='"+direccion+"', FECHA_NACIMIENTO='"+fechaNacimiento+"' WHERE ID_PERSONAL="+codigo;
        dec.executeUpdate(query1);
    }
     
    public Persona buscarPersona(int codigo) throws SQLException{
        System.out.println("Buscar registro...");
        String sql="SELECT RUT, NOMBRE, FECHA_INGRESO, DIRECCION, FECHA_NACIMIENTO FROM PERSONAL WHERE ID_PERSONAL="+codigo;
        PreparedStatement preparedStatement;
        Persona persona=null;
        try {
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            persona = new Persona();
            persona.setRut(resultSet.getString("RUT"));
            persona.setNombre(resultSet.getString("NOMBRE"));
            persona.setFechaIngreso(resultSet.getString("FECHA_INGRESO"));
            persona.setDireccion(resultSet.getString("DIRECCION"));
            persona.setFechaNacimiento(resultSet.getString("FECHA_NACIMIENTO"));
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persona;
    }

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
