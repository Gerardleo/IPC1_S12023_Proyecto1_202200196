/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Gerardo
 */
public class Kioskos {
    private int codKiosko;
    private String nombreKiosco;
    private String codRegion;

    public Kioskos() {
        codKiosko =0;
        nombreKiosco = "";
        codRegion="";
        
    }

    public Kioskos(int codKiosko, String nombreKiosco, String codRegion) {
        this.codKiosko = codKiosko;
        this.nombreKiosco = nombreKiosco;
        this.codRegion = codRegion;
    }

    public int getCodKiosko() {
        return codKiosko;
    }

    public void setCodKiosko(int codKiosko) {
        this.codKiosko = codKiosko;
    }

    public String getNombreKiosco() {
        return nombreKiosco;
    }

    public void setNombreKiosco(String nombreKiosco) {
        this.nombreKiosco = nombreKiosco;
    }

    public String getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(String codRegion) {
        this.codRegion = codRegion;
    }
    
    
    
}
