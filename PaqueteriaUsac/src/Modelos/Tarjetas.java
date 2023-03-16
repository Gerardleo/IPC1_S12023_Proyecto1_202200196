/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Gerardo
 */
public class Tarjetas {
    private String correo;
    private String nombreTarjeta;
    private String numeroTarjeta;
    private String fechaVencimiento;

    
    public Tarjetas(){
     correo = "";
     nombreTarjeta = "";
     numeroTarjeta ="";
     fechaVencimiento = ""; 
    }

    public Tarjetas(String correo, String nombreTarjeta, String numeroTarjeta, String fechaVencimiento) {
        this.correo = correo;
        this.nombreTarjeta = nombreTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
