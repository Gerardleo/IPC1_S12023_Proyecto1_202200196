/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import Modelos.Regiones;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 */
public class regiones extends javax.swing.JPanel {

    /**
     * Creates new form regiones
     */
    public regiones() {
        initComponents();
        listaRegiones.add(new Regiones("M", "Metropolitana", 25.0, 35.00));
        listaRegiones.add(new Regiones("NT", "Norte", 45.55, 68.50));
        listaRegiones.add(new Regiones("NO", "Nororiente", 35.48, 58.68));
        listaRegiones.add(new Regiones("SO", "Suroriente", 32.48, 38.68));
        listaRegiones.add(new Regiones("SOC", "Suroccidente", 29.00, 34.00));
        listaRegiones.add(new Regiones("NOC", "Noroccidente", 40.00, 44.50));
        ListaRegiones();
       
    }

     Regiones temp = new Regiones();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        precioEsp = new javax.swing.JTextField();
        precioEst = new javax.swing.JTextField();
        codigo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarRegiones = new javax.swing.JTextPane();
        mostrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(4, 80, 113));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio Estandar");

        jLabel4.setText("Precio Especial");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jLabel5.setText("Regiones Creadas");

        mostrarRegiones.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(mostrarRegiones);
        mostrarRegiones.getAccessibleContext().setAccessibleDescription("text/html");

        mostrar.setText("Mostrar Regiones");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(precioEst, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(Agregar)
                        .addGap(33, 33, 33)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(mostrar)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(codigo, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioEsp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precioEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precioEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar)
                            .addComponent(Editar)
                            .addComponent(mostrar))
                        .addGap(81, 81, 81))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        try{
        String cod = codigo.getSelectedItem().toString();
        String nom= nombre.getText();
        String est= precioEst.getText();
        String esp = precioEsp.getText();
        
        if(!(cod.equals("") || nom.equals("") || est.equals("") || esp.equals(""))){
            Double prEst= Double.parseDouble(precioEst.getText());
            Double prEsp = Double.parseDouble(precioEsp.getText());
           
                int i = obtenerPosicion(cod);
                listaRegiones.set(i,new Regiones(cod, nom, prEsp, prEst ));
                System.out.println("Cod : "+cod +" nombre:" + nom+" precio Especial:" + prEsp +" precio Especial: " + prEst);
                JOptionPane.showConfirmDialog(this, "Se ha editado la region " + nom , "Confirmar acción", JOptionPane.DEFAULT_OPTION);
                reseteoCampos();
            
        }else{            
            System.out.println("Ingrese todos los datos");
            JOptionPane.showConfirmDialog(this, "Ingrese los datos correspondientes" , "Confirmar acción", JOptionPane.DEFAULT_OPTION);

        }
        }catch(java.lang.NumberFormatException v ){
               precioEsp.setText("");
               precioEsp.setBackground(Color.red);
               precioEsp.setForeground(Color.white);
               
               precioEst.setText("");
               precioEst.setBackground(Color.red);
               precioEst.setForeground(Color.white);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
         try{
        String cod = codigo.getSelectedItem().toString();
        String nom= nombre.getText();
        String est= precioEst.getText();
        String esp = precioEsp.getText();
        
        if(!(cod.equals("") || nom.equals("") || est.equals("") || esp.equals(""))){
            Double prEst= Double.parseDouble(precioEst.getText());
            Double prEsp = Double.parseDouble(precioEsp.getText());
           
                listaRegiones.add(new Regiones(cod, nom, prEsp, prEst ));
                System.out.println("Cod: "+cod +" nombre: " + nom+" precio Especial: " + prEsp +" precio Especial: " + prEst);
                JOptionPane.showConfirmDialog(this, "Se ha Agregado la region " + nom , "Confirmar acción", JOptionPane.DEFAULT_OPTION);
                reseteoCampos();
            
        }else{            
            System.out.println("Ingrese todos los datos");
           JOptionPane.showConfirmDialog(this, "Ingrese los datos correspondientes" , "Confirmar acción", JOptionPane.DEFAULT_OPTION);

        }
        }catch(java.lang.NumberFormatException v ){
               precioEsp.setText("");
               precioEsp.setBackground(Color.red);
               precioEsp.setForeground(Color.white);
               
               precioEst.setText("");
               precioEst.setBackground(Color.red);
               precioEst.setForeground(Color.white);
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
       
       rellenarCampos();
       
    }//GEN-LAST:event_codigoActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
             String cadenaRegiones="<html><head></head><body><table><tr><th>Codigo</th><th>Nombre</th><th>Precio Especial</th><th>Precio Estandar</th><tr>";  
        for(int i=0; i<listaRegiones.size();i++){
            
            temp = listaRegiones.get(i);            
            cadenaRegiones = cadenaRegiones+"<tr><td>"+temp.getCodigo()+"</td><td>"+temp.getNombre()+"</td>"+"<td>"+"Q"+temp.getPrecioEsp()+"</td>"+"<td>"+"Q"+temp.getPrecioEst()+"</td></tr>";            
        }
        
        cadenaRegiones=cadenaRegiones+"</table></body></html>";
        
        mostrarRegiones.setText(cadenaRegiones);
    }//GEN-LAST:event_mostrarActionPerformed
/*
    Funciones 
*/
ArrayList <Regiones> listaRegiones = new ArrayList<Regiones>();

public ArrayList<Regiones> getListaRegiones() {
        return listaRegiones;
    }


public void reseteoCampos(){
    
    nombre.setText("");
    codigo.setSelectedItem("");
    precioEsp.setText("");
    precioEst.setText("");
}

public int obtenerPosicion(String cod){
    for(int i = 0; i < listaRegiones.size(); i++){
        Regiones r = listaRegiones.get(i);
                if(cod.equalsIgnoreCase(r.getCodigo())){
                    return i;
    }
    }
    return -1;
}
public void ListaRegiones(){
    for(int i= 0; i< listaRegiones.size(); i++){
        temp = listaRegiones.get(i);
        codigo.addItem(temp.getCodigo());
        }
}

public void rellenarCampos(){
      String cod = codigo.getSelectedItem().toString();
      temp = listaRegiones.get(obtenerPosicion(cod));
      
       nombre.setText(temp.getNombre());
       precioEsp.setText(temp.getPrecioEsp().toString());
       precioEst.setText(temp.getPrecioEst().toString());
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Editar;
    private javax.swing.JComboBox<String> codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextPane mostrarRegiones;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precioEsp;
    private javax.swing.JTextField precioEst;
    // End of variables declaration//GEN-END:variables
}
