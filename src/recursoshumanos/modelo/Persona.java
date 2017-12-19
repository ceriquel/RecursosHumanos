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
    private int rut;
    private String dv;
    private String nombre;
    private Date fechaIngreso;
    private String direccion;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(int codigo, int rut, String dv, String nombre, Date fechaIngreso, String direccion, Date fechaNacimiento) {
        this.codigo = codigo;
        this.rut = rut;
        this.dv = dv;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
