/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo37.vistas;

import java.awt.Color;
import java.sql.Date;
import javax.swing.JOptionPane;
import universidadgrupo37.accesoADatos.MateriaData;
import universidadgrupo37.entidades.Alumno;
import universidadgrupo37.entidades.Materia;

/**
 *
 * @author Usuario
 */
public class GestionMateria extends javax.swing.JInternalFrame  {

    /**
     * Creates new form GestionMateria
     */
    public GestionMateria() {
         this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        setTitle("Materia");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtcodigo = new javax.swing.JTextField();
        jtnombre = new javax.swing.JTextField();
        jtanio = new javax.swing.JTextField();
        jrbestado = new javax.swing.JRadioButton();
        jbsalir = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbnuevo = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();
        jlestado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jrbestado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbestadoStateChanged(evt);
            }
        });

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbnuevo.setText("Nuevo");
        jbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnuevoActionPerformed(evt);
            }
        });

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jlestado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo37/imagen/universidad-de-la-punta.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbnuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jrbestado)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jlestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jtanio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jbbuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)))
                        .addGap(0, 55, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalir)
                    .addComponent(jbguardar)
                    .addComponent(jbeliminar)
                    .addComponent(jbnuevo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener los valores de los campos
            //int codigo = Integer.parseInt(jtcodigo.getText());
            String nombre = jtnombre.getText();
            int anio = Integer.parseInt(jtanio.getText());
            boolean estado = jrbestado.isSelected();

            if (nombre.isEmpty() || jtanio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete el campo nombre y año por favor.");
                return;
            }
            //creamos un constructor de Materia y de MateriaData
            Materia materia = new Materia(nombre, anio, estado);
            MateriaData mat = new MateriaData();
            String h = materia.getNombre();
            //Verificamos si existe la materia previamente
            if (h.equalsIgnoreCase(mat.nombreM(nombre))) {
                JOptionPane.showMessageDialog(null, "La materia ya existe o esta anulada");
            } else {
                mat.guardarMateria(materia);
                limpiarPlanilla();
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El año debe contener solo números");
        }
    }//GEN-LAST:event_jbguardarActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        // TODO add your handling code here:
        
          String text = jtcodigo.getText();
          MateriaData mat =new MateriaData();
          
          try{
            if (text.isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Documento no debe estar vacio.");
            }
            int idmat = Integer.parseInt(text);
            Materia mat1 = mat.buscarMateria(idmat);
            jtnombre.setText(mat1.getNombre()); 
            jtanio.setText(String.valueOf(mat1.getAnioMateria()));//convierte el int en String para poder setearlo en el TextField
            jrbestado.setSelected(mat1.isActivo());
          
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "La materia no se encuentra en la Base de Datos.");
           
        }
                           
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnuevoActionPerformed
        // TODO add your handling code here:
        
        limpiarPlanilla();
    }//GEN-LAST:event_jbnuevoActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
        MateriaData matData = new MateriaData();
        
        
        try{
            if(jtcodigo.getText().isEmpty()|| jtnombre.getText().isEmpty()||jtanio.getText().isEmpty()||!jrbestado.isSelected()){
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacio y/o el estado debe estar activo");
            return;
            }else{
            int matid = Integer.parseInt(jtcodigo.getText());
            matData.eliminarMateria(matid);
            }
            
            
        }catch(NullPointerException ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jrbestadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbestadoStateChanged
        // TODO add your handling code here:
        if(jrbestado.isSelected()){
            jlestado.setForeground(Color.BLUE);
            jlestado.setText("Activo");
        }else{
            jlestado.setForeground(Color.RED);
            jlestado.setText("Inactivo");}
    }//GEN-LAST:event_jrbestadoStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbnuevo;
    private javax.swing.JButton jbsalir;
    private javax.swing.JLabel jlestado;
    private javax.swing.JRadioButton jrbestado;
    private javax.swing.JTextField jtanio;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtnombre;
    // End of variables declaration//GEN-END:variables

private void limpiarPlanilla(){
   jtcodigo.setText(""); // Limpia los campos
    jtnombre.setText("");
    jtanio.setText("");
    jrbestado.setSelected(false);
    jlestado.setText("");
  }
}
