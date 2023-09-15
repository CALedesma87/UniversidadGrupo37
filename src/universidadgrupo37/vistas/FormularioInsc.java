/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo37.vistas;

import javax.swing.table.DefaultTableModel;
import universidadgrupo37.accesoADatos.AlumnoData;

/**
 *
 * @author Usuario
 */
public class FormularioInsc extends javax.swing.JInternalFrame {
private DefaultTableModel tabla= new DefaultTableModel();
   
    public FormularioInsc() {
        initComponents();
        setTitle("Formulario de Inscripcion");
        cargarComboBox();
        crearCabecera();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbalumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrbinscriptas = new javax.swing.JRadioButton();
        jrbnoinscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbsalir = new javax.swing.JButton();
        jbanularinscipcion = new javax.swing.JButton();
        jbinscribir = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripciones");

        jLabel2.setText("Selecione un Alumno:");

        jcbalumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Alumno..." }));
        jcbalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbalumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        jLabel4.setText("Materias Inscriptas");

        jLabel5.setText("Materias no Inscriptas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbanularinscipcion.setText("Anular Inscripcion");
        jbanularinscipcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbanularinscipcionActionPerformed(evt);
            }
        });

        jbinscribir.setText("Inscribir");
        jbinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jrbinscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbnoinscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbinscribir)
                        .addGap(43, 43, 43)
                        .addComponent(jbanularinscipcion)
                        .addGap(63, 63, 63)
                        .addComponent(jbsalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbinscriptas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbnoinscriptas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalir)
                    .addComponent(jbanularinscipcion)
                    .addComponent(jbinscribir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbalumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbalumnosActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbinscribirActionPerformed

    private void jbanularinscipcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbanularinscipcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbanularinscipcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbanularinscipcion;
    private javax.swing.JButton jbinscribir;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbalumnos;
    private javax.swing.JRadioButton jrbinscriptas;
    private javax.swing.JRadioButton jrbnoinscriptas;
    // End of variables declaration//GEN-END:variables

 private void crearCabecera(){
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Año");
        jTable1.setModel(tabla);
    }
  private void cargarComboBox(){
        AlumnoData alu=new AlumnoData();
        for(int i=0;alu.listarAlumnos().size()>i;i++){
          jcbalumnos.addItem(alu.listarAlumnos().get(i)+"");
        } 
  }
}
