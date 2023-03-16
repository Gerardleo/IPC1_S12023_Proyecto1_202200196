/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import Modelos.Departamentos;
import Modelos.Municipios;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 */
public class municipios extends javax.swing.JPanel {

    /**
     * Creates new form municipios
     */
    public municipios() {
        initComponents();
        ListaDepartamentos(); 
   }

    departamentos dep = new departamentos();
    Departamentos Dep = new Departamentos();
    Municipios Mun = new Municipios();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codDep = new javax.swing.JComboBox<>();
        codigoMuni = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMuni = new javax.swing.JTextPane();
        guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelmuni = new javax.swing.JLabel();
        nombreDep = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(4, 80, 113));

        codDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codDepActionPerformed(evt);
            }
        });

        codigoMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoMuniActionPerformed(evt);
            }
        });

        txtMuni.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(txtMuni);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo de Departamento");

        jLabel2.setText("Nombre de Departamento");

        jLabel3.setText("Nombre de municipio");

        labelmuni.setText("Codigo de municipio");

        nombreDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codDep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoMuni)
                    .addComponent(nombre)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelmuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreDep, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editar)
                        .addGap(18, 18, 18)
                        .addComponent(mostrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(editar)
                            .addComponent(mostrar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(labelmuni, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        try{
            String codDepa = codDep.getSelectedItem().toString();
            String nomDepa = nombreDep.getText();
            String codMuni = codigoMuni.getText();
            String nomMuni = nombre.getText();
            

            if(!(codDepa.equals("") || nomDepa.equals("") || nomMuni.equals(""))){
                int codMuni1 = Integer.parseInt(codMuni);
                int codDepa1 = Integer.parseInt(codDepa);

                listaMunicipios.add(new Municipios(codDepa1,nomDepa ,codMuni1,nomMuni));
                JOptionPane.showConfirmDialog(this, "Municipio creado" + nomMuni , "Confirmar acción", JOptionPane.DEFAULT_OPTION);
                System.out.println(" Codigo Departamento: " + codDepa1 +" nombre Departamento: " +nomDepa+ " Codigo Municipalidad: " +codMuni1 +" Nombre municipio: "+nomMuni);
                reseteoCampos();

            }else{
                System.out.println("Ingrese todos los datos");
                JOptionPane.showConfirmDialog(this, "Ingrese los datos correspondientes" , "Confirmar acción", JOptionPane.DEFAULT_OPTION);

            }
        }catch(Exception v ){
            codigoMuni.setText("");
            codigoMuni.setText("");
            labelmuni.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
            
        try{
            String codDepa = codDep.getSelectedItem().toString();
            String nomDepa = nombreDep.getText();
            String codMuni = codigoMuni.getText();
            String nomMuni = nombre.getText();

            if(!(codDepa.equals("") || nomDepa.equals("") || nomMuni.equals(""))){
                int codDepa1 = Integer.parseInt(codDepa);
                int codMuni1 = Integer.parseInt(codMuni);

                
                int i = obtenerPosicionMuni(codMuni1);
                listaMunicipios.set(i,new Municipios(codDepa1,nomDepa ,codMuni1,nomMuni));
                JOptionPane.showConfirmDialog(this, "Municipio editado" + nomMuni , "Confirmar acción", JOptionPane.DEFAULT_OPTION);
                System.out.println(" Codigo Departamento: " + codDepa1 +" nombre Departamento: " +nomDepa+ " Codigo Municipalidad: " +codMuni1 +" Nombre municipio: "+nomMuni);
                reseteoCampos();

            }else{
                System.out.println("Ingrese todos los datos");
                JOptionPane.showConfirmDialog(this, "Ingrese los datos correspondientes" , "Confirmar acción", JOptionPane.DEFAULT_OPTION);

            }
        }catch(Exception v ){
            codigoMuni.setText("");
            labelmuni.setForeground(Color.red);
        }
   
        
    }//GEN-LAST:event_editarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
       String cadenaMuni="<html><head></head><body><table><tr><th>Codigo Depa</th><th>Nombre Depa</th><th>Codigo Muni</th><th>Nombre Muni</th></tr>";
        for(int i=0; i<listaMunicipios.size();i++){

            Mun = listaMunicipios.get(i);
            cadenaMuni = cadenaMuni+"<tr><td>"+Mun.getCodDep()+"</td><td>"+Mun.getNombreDep()+"</td>"+"<td>"+Mun.getCodMuni()+"</td>"+"<td>"+Mun.getNombre()+"</td></tr>";
        }

        cadenaMuni=cadenaMuni+"</table></body></html>";

        txtMuni.setText(cadenaMuni); 
    }//GEN-LAST:event_mostrarActionPerformed

    private void codDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codDepActionPerformed
           rellenarCampos();
    }//GEN-LAST:event_codDepActionPerformed

    private void codigoMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoMuniActionPerformed
          
    }//GEN-LAST:event_codigoMuniActionPerformed

    private void nombreDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDepActionPerformed

    /*
    
        Funciones
    */
    
        ArrayList <Municipios> listaMunicipios = new ArrayList<Municipios>();

    public int obtenerPosicionDep(int cod){
    for(int i = 0; i <  dep.getListaDepartamentos().size(); i++){
        Departamentos d = dep.getListaDepartamentos().get(i);
                if(cod == d.getCodigoDep()){
                    return i;
    }
    }
    return -1;
}
    
    public int obtenerPosicionMuni(int cod){
    for(int i = 0; i <  listaMunicipios.size(); i++){
        Municipios m = listaMunicipios.get(i);
                if(cod == m.getCodMuni()){
                    return i;
    }
    }
    return -1;
}
     public void rellenarCampos(){
      String cod = codDep.getSelectedItem().toString();
      Dep = dep.getListaDepartamentos().get(obtenerPosicionDep(Integer.parseInt(cod)));
      
      nombreDep.setText(Dep.getNombre());
      nombreDep.setEditable(false);
    }
     
     public void ListaDepartamentos(){
     for(int i= 0; i< dep.getListaDepartamentos().size(); i++){
        Dep = dep.getListaDepartamentos().get(i);
        codDep.addItem(""+Dep.getCodigoDep()+"");
        }
     }
     
     public void reseteoCampos(){
         nombre.setText("");
         codigoMuni.setText("");
     }
    
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> codDep;
    private javax.swing.JTextField codigoMuni;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelmuni;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreDep;
    private javax.swing.JTextPane txtMuni;
    // End of variables declaration//GEN-END:variables
}
