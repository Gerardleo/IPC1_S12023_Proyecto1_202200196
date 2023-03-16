/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Gerardo
 */
public class Municipios {
    private int codDep;
    private String nombreDep;
    private int codMuni;
    private String nombre;

    public Municipios() {
        codDep = 0;
        nombreDep = "";
        codMuni = 0;
        nombre = "";
    }

    public Municipios(int codDep,String nombreDep,int codMuni,String nombre) {
        this.codDep = codDep;
        this.nombre = nombre;
        this.codMuni = codMuni;
        this.nombreDep = nombreDep;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public int getCodMuni() {
        return codMuni;
    }

    public void setCodMuni(int codMuni) {
        this.codMuni = codMuni;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public int getCodDep() {
        return codDep;
    }

    public void setCodDep(int codDep) {
        this.codDep = codDep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    
}
