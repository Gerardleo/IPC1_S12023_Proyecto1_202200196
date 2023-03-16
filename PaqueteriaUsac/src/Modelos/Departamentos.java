/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Gerardo
 */
public class Departamentos {
       private String codigoReg;
       private String region;
       private int codigoDep;
       private String nombre;

    public Departamentos() {
        codigoReg = "";
        region = "";
        codigoDep = 0;
        nombre = "";
    }

    public Departamentos(String codigoReg, String region, int codigoDep ,String nombre) {
        this.codigoReg = codigoReg;
        this.region = region;
        this.nombre = nombre;
        this.codigoDep = codigoDep;
    }

    

    public String getCodigoReg() {
        return codigoReg;
    }

    public String getRegion() {
        return region;
    }

    public int getCodigoDep() {
        return codigoDep;
    }

    public String getNombre() {
        return nombre;
    }
    public void setCodigoReg(String codigoReg) {
        this.codigoReg = codigoReg;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCodigoDep(int codigoDep) {
        this.codigoDep = codigoDep;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
