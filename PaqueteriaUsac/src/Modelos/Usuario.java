/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;


/**
 *
 * @author Gerardo
 */
public class Usuario {
    private String correo;
    private String nombre;
    private String apellido;
    private String contrasena;
    private String dpi;
    private String fechaNacimiento;
    private String genero;
    private String nacionalidad;
    private String sobreNombre;
    private String telefono;
    private String rol;
    

    public Usuario(){
    correo = "";
    nombre = "";
    apellido = "";
    contrasena = "";
    dpi = "";
    fechaNacimiento = "";
    genero = "";
    nacionalidad = "";
    sobreNombre= "";
    telefono = "";
    rol = "";
           
    }  

    public Usuario( String correo,String nombre,String apellido,String contrasena,String dpi,String fechaNacimiento, 
            String genero, String nacionalidad, String sobreNombre,String telefono,String rol ){
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.dpi = dpi;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.sobreNombre = sobreNombre;
        this.telefono = telefono;
        this.rol = rol;
    } 
    public String getNombre(){
        return nombre;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    public String getdpi(){
        return dpi;
    }
    
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
      public String getGenero(){
        return genero;
        
    }  public String getNacionalidad(){
        return nacionalidad;
    }
        
     public String getSobreNombre(){
        return sobreNombre;
    }
      
      public String getTelefono(){
        return telefono;
    }
    
    public void setCorreo(String correo){
         this.correo = correo;
    }
     public void setNombre(String nombre){
         this.nombre = nombre;
    }

    public void setApellido(String apellido){
         this.apellido = apellido;
    }
    
    public void setContrasena(String contrasena){
         this.contrasena= contrasena;
    }
    public void setdpi(String dpi){
         this.dpi = dpi;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public void setFechaNacimiento(String fechaNacimiento){
         this.fechaNacimiento = fechaNacimiento;
    }
      public void setGenero(String genero){
         this.genero = genero;
        
    }  public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
        
     public void setSobreNombre(String sobreNombre){
         this.sobreNombre = sobreNombre;
    }
      public void setTelefono(String telefono){
        this.telefono = telefono;
    }
       
}
