
package universidadgrupo37.vistas;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import javax.swing.JOptionPane;
import universidadgrupo37.accesoADatos.AlumnoData;
import universidadgrupo37.entidades.Alumno;
        
public class GestionAlumno extends javax.swing.JInternalFrame {

    public GestionAlumno() {
        initComponents();
        setTitle("Alumnos");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbsalir = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbnuevo = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jrbestado = new javax.swing.JRadioButton();
        jtnombre = new javax.swing.JTextField();
        jtdni = new javax.swing.JTextField();
        jbbuscar = new javax.swing.JButton();
        jtapellido = new javax.swing.JTextField();
        jdcfnac = new com.toedter.calendar.JDateChooser();

        jButton3.setText("Guardar");

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha Nacimiento:");

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
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

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbestado)
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jbbuscar)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcfnac, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcfnac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalir)
                    .addComponent(jbeliminar)
                    .addComponent(jbnuevo)
                    .addComponent(jbguardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
         setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        //Este si me quedo, también se puede mejorar!
        String text = jtdni.getText();
        
        AlumnoData alu = new AlumnoData();
        try{
            if (text.isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Documento no debe estar vacio.");
            }
            int numconver = Integer.parseInt(text);
            Alumno en = alu.buscarAlumnoPorDni(numconver);
           // JOptionPane.showMessageDialog(null, "[Nombre]: "+en.getNombre()
           // + " [Apellido]: "+en.getApellido()+" [DNI]: "+en.getDni()+ " [Fecha de nacimiento]: "+ en.getFechaNacimiento()
            //+ " [ID]: "+ en.getIdAlumno());
            jtnombre.setText(en.getNombre()); 
            jtapellido.setText(en.getApellido());
            jrbestado.setSelected(en.isEstado());
            if (en.getFechaNacimiento() != null) {
    jdcfnac.setDate(Date.valueOf(en.getFechaNacimiento()));
} else {
    jdcfnac.setDate(null); // Para borrar la fecha si no hay fecha de nacimiento
}
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "El alumno no se encuentra en la Base de Datos.");
            limpiarPlanilla();
        }
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed

        //Esto de aca deberia de poder mejorarse, no logro que lance bien las excepciones.
        String text = jtdni.getText();
        AlumnoData alu = new AlumnoData();
        
        try{
            int numconver = Integer.parseInt(text);
            Alumno en = alu.buscarAlumnoPorDni(numconver);
            alu.eliminarAlumno(en.getIdAlumno());
            
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingrese solo numeros! [DNI]");
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "El alumno se encuentra actualmente inactivo.");
        }
        
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnuevoActionPerformed
        // TODO add your handling code here:
        limpiarPlanilla();
    }//GEN-LAST:event_jbnuevoActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        // TODO add your handling code here:
      try{
        // Obtener los valores de los campos
        int dni = Integer.parseInt(jtdni.getText());
        String apellido = jtapellido.getText();
        String nombre = jtnombre.getText();
        boolean estado = jrbestado.isSelected();
       // Obtener la fecha de nacimiento en formato Date
    java.util.Date utilDate = jdcfnac.getDate();
    
    // Convertir la fecha de util.Date a LocalDate
    Instant instant = utilDate.toInstant();
    LocalDate fechaNacimiento = instant.atZone(ZoneId.systemDefault()).toLocalDate();



        // Verificar que los campos obligatorios no estén vacíos
        if (jtdni.getText().isEmpty() || apellido.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }
        Alumno alumno = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
        AlumnoData alu = new AlumnoData();
        if(alu.existeDni(dni)){
            JOptionPane.showMessageDialog(null, "El DNI ya se encuentra asociado a un alumno");
            
        }else{
        alu.guardarAlumno(alumno);
        limpiarPlanilla();
      }
      }catch (NumberFormatException ex){
          JOptionPane.showMessageDialog(null, "El Dni debe contener solo numero");
      }
    }//GEN-LAST:event_jbguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbnuevo;
    private javax.swing.JButton jbsalir;
    private com.toedter.calendar.JDateChooser jdcfnac;
    private javax.swing.JRadioButton jrbestado;
    private javax.swing.JTextField jtapellido;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtnombre;
    // End of variables declaration//GEN-END:variables

private void limpiarPlanilla(){
   jtapellido.setText(""); // Limpia los campos
    jtnombre.setText("");
    jtdni.setText("");
    jrbestado.setSelected(false);
    jdcfnac.setDate(null);
}
}
