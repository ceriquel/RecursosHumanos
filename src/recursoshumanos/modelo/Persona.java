/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos.modelo;

import java.util.Date;




/**
 *
 * @author Cèsar
 */
public class Persona {
    
    private int codigo;
    private String rut;
    private String nombre;
    private String fechaIngreso;
    private String direccion;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(int codigo, String rut, String nombre, String fechaIngreso, String direccion, String fechaNacimiento) {
        this.codigo = codigo;
        this.rut = rut;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
