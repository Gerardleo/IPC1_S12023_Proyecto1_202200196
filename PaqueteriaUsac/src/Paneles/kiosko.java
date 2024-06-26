/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import Modelos.Kioskos;
import Modelos.Regiones;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 */
public class kiosko extends javax.swing.JPanel {

    /**
     * Creates new form kiosko
     */
    public kiosko() {
        initComponents();
        ListaRegiones();
    }
    regiones reg = new regiones();
    Regiones Reg = new Regiones();
    Kioskos Kio = new Kioskos();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codRegion = new javax.swing.JComboBox<>();
        labelCodKio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreKiosko = new javax.swing.JTextField();
        codKiosko = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKiosko = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(4, 80, 113));

        labelCodKio.setText("Codigo Kiosco");

        jLabel2.setText("Nombre Kiosco");

        jLabel3.setText("Codigo Region");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        mostrar.setText("mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        txtKiosko.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(txtKiosko);

        jLabel4.setText("Kioskos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCodKio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreKiosko)
                            .addComponent(codKiosko)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(agregar)
                        .addGap(26, 26, 26)
                        .addComponent(editar)
                        .addGap(32, 32, 32)
                        .addComponent(mostrar)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(labelCodKio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codKiosko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreKiosko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(editar)
                    .addComponent(mostrar))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        agregar.getAccessibleContext().setAccessibleName("");

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

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        try{
            String codKiosk = codKiosko.getText() ;
            String nomKiosko= nombreKiosko.getText();
            String codRegi = codRegion.getSelectedItem().toString();
            
            if(!(codKiosk.equals("")|| nombreKiosko.equals(""))){
                int codKiosk1 = Integer.parseInt(codKiosk);
                
                listaKioskos.add(new Kioskos(codKiosk1, nomKiosko, codRegi));
                reseteoCampos();
                System.out.println("-------------------- Registro Usuario --------------------");
                System.out.println("Kiosko Registrado: "+" Codigo Kiosko: "+ codKiosk + " Nombre Kiosko: "+nomKiosko+" Codigo Kiosko: "+ codRegi);
                JOptionPane.showConfirmDialog(this, "Kiosko registrado exitosamente", "Confirmar acción", JOptionPane.DEFAULT_OPTION);

                System.out.println("Kiosko registrado exitosamente");
            }else{
                System.out.println("Ingrese los datos correspondientes");
                JOptionPane.showConfirmDialog(this, "Ingrese los datos correspondientes", "Confirmar acción", JOptionPane.DEFAULT_OPTION);

            }
            
            
            
        }catch(Exception e){
            codKiosko.setText("");
            labelCodKio.setForeground(Color.red);
             
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try{
            String codKiosk = codKiosko.getText() ;
            String nomKiosko= nombreKiosko.getText();
            String codRegi = codRegion.getSelectedItem().toString();
            
            if(!(codKiosk.equals("")|| nombreKiosko.equals(""))){
                int codKiosk1 = Integer.parseInt(codKiosk);
                
                int i = obtenerPosicion(codKiosk1);
                listaKioskos.set(i,new Kioskos(codKiosk1, nomKiosko, codRegi));
                reseteoCampos();
                System.out.println("-------------------- Registro Usuario --------------------");
                System.out.println("Kiosko Modificado: "+" Codigo Kiosko: "+ codKiosk + " Nombre Kiosko: "+nomKiosko+" Codigo Kiosko: "+ codRegi);
                System.out.println("Kiosko Modificado exitosamente");
                JOptionPane.showConfirmDialog(this, "Kiosko Modificado: "+nomKiosko , "Confirmar acción", JOptionPane.DEFAULT_OPTION);

            }else{
                System.out.println("Ingrese los datos correspondientes");
                JOptionPane.showConfirmDialog(this, "Ingrese los datos correspondientes" , "Confirmar acción", JOptionPane.DEFAULT_OPTION);

            }
            
            
            
        }catch(Exception e){
            codKiosko.setText("");
            labelCodKio.setForeground(Color.red);
             
        }
    }//GEN-LAST:event_editarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        String cadenaKiosko="<html><head></head><body><table><tr><th>Codigo Kiosko</th><th>Nombre Kiosko</th><th>Codigo Region</th></tr>";
        for(int i=0; i< listaKioskos.size();i++){

            Kio = listaKioskos.get(i);
            cadenaKiosko = cadenaKiosko+"<tr><td>"+Kio.getCodKiosko()+"</td><td>"+Kio.getNombreKiosco()+"</td>"+"<td>"+Kio.getCodRegion()+"</td></tr>";
        }

        cadenaKiosko=cadenaKiosko+"</table></body></html>";

        txtKiosko.setText(cadenaKiosko); 
    }//GEN-LAST:event_mostrarActionPerformed

    /*
        Funciones 
    */
    
    
    ArrayList <Kioskos> listaKioskos = new ArrayList<Kioskos>();
    
    public void ListaRegiones(){
        for(int i=0; i < reg.getListaRegiones().size(); i++){
            Reg = reg.getListaRegiones().get(i);
            codRegion.addItem(Reg.getCodigo());
            
        }
    
    }
    
    public void reseteoCampos(){
        codKiosko.setText("");
        nombreKiosko.setText("");
        codRegion.addItem("");
        codRegion.setSelectedItem("");
    }

    public int obtenerPosicion(int cod){
        for(int i =0; i< listaKioskos.size(); i++){
         Kio = listaKioskos.get(i);
         if(cod == Kio.getCodKiosko()){
             return i;
         }
        }
        return -1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField codKiosko;
    private javax.swing.JComboBox<String> codRegion;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodKio;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombreKiosko;
    private javax.swing.JTextPane txtKiosko;
    // End of variables declaration//GEN-END:variables
}
