
package universidadgrupo37.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo37.accesoADatos.AlumnoData;
import universidadgrupo37.accesoADatos.InscripcionData;
import universidadgrupo37.entidades.Alumno;
import universidadgrupo37.entidades.Inscripcion;


public class CargarNotas extends javax.swing.JInternalFrame {
private DefaultTableModel tabla= new DefaultTableModel(){
  public boolean isCellEditable(int fila,int columna){
      if(columna ==2){
          return true;
      }else{
          return false;
      }   
  }
};

    public CargarNotas() {
        initComponents();
        setTitle("Carga de notas");
        cargarComboBox();
        crearCabecera();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbalumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbsalir = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setClosable(true);

        jLabel1.setText("Carga de notas");

        jLabel2.setText("Seleccione Alumno:");

        jcbalumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione alumno..." }));
        jcbalumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbalumnosMouseClicked(evt);
            }
        });
        jcbalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbalumnosActionPerformed(evt);
            }
        });

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

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jcbalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbguardar)
                .addGap(54, 54, 54)
                .addComponent(jbsalir)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalir)
                    .addComponent(jbguardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
         setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jcbalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbalumnosActionPerformed
        // TODO add your handling code here:
        Alumno aluselec=(Alumno) jcbalumnos.getSelectedItem();
    }//GEN-LAST:event_jcbalumnosActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        InscripcionData insc=new InscripcionData();
       
    }//GEN-LAST:event_jbguardarActionPerformed

    private void jcbalumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbalumnosMouseClicked
        // TODO add your handling code here  
    }//GEN-LAST:event_jcbalumnosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbalumnos;
    // End of variables declaration//GEN-END:variables

    private void crearCabecera(){
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Nota");
        jTable1.setModel(tabla);
    }
    private void cargarComboBox(){
        AlumnoData alu=new AlumnoData();
        for(int i=0;alu.listarAlumnos().size()>i;i++){
          jcbalumnos.addItem(alu.listarAlumnos().get(i)+"");
        } 
    } 
    
}
