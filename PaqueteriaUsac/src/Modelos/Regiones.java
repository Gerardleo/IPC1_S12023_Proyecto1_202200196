package Modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gerardo
 */
public class Regiones {
        private String codigo;
        private String nombre;
        private Double precioEsp;
        private Double precioEst;

    public Regiones() {
        codigo = "";
        nombre = "";
        precioEsp = 0.0;
        precioEst = 0.0;
    }

    public Regiones(String codigo, String nombre, Double precioEsp, Double precioEst) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioEsp = precioEsp;
        this.precioEst = precioEst;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecioEsp() {
        return precioEsp;
    }

    public Double getPrecioEst() {
        return precioEst;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioEsp(Double precioEsp) {
        this.precioEsp = precioEsp;
    }

    public void setPrecioEst(Double precioEst) {
        this.precioEst = precioEst;
    }
        
        
}
