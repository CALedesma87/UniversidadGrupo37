package universidadgrupo37.vistas;

import java.awt.Color;
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
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        setTitle("Alumnos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbsalir = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbnuevo = new javax.swing.JButton();
        jbmodificar = new javax.swing.JButton();
        jrbestado = new javax.swing.JRadioButton();
        jtnombre = new javax.swing.JTextField();
        jtdni = new javax.swing.JTextField();
        jbbuscar = new javax.swing.JButton();
        jtapellido = new javax.swing.JTextField();
        jdcfnac = new com.toedter.calendar.JDateChooser();
        Estado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("Guardar");

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");

        jbsalir.setText("Salir");
        jbsalir.setToolTipText("*Abandona ventana Alumno");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbeliminar.setText("Eliminar");
        jbeliminar.setToolTipText("*Elimina a un alumno");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbnuevo.setText("Nuevo");
        jbnuevo.setToolTipText("*Crear alumno nuevo");
        jbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnuevoActionPerformed(evt);
            }
        });

        jbmodificar.setText("Modificar");
        jbmodificar.setToolTipText("*Guarda los datos del alumno");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jrbestado.setToolTipText("*Click para activo o Inactivo");
        jrbestado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbestadoStateChanged(evt);
            }
        });

        jtnombre.setToolTipText("*Nombre del alumno");

        jtdni.setToolTipText("*Ingrese solo números");

        jbbuscar.setText("Buscar");
        jbbuscar.setToolTipText("*Buscar por alumno por documento");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jtapellido.setToolTipText("*Apellido del alumno");

        jdcfnac.setToolTipText("");

        Estado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Estado.setForeground(new java.awt.Color(0, 0, 204));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ID:");

        jtID.setEditable(false);
        jtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo37/imagen/universidad-de-la-punta.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbnuevo)
                        .addGap(57, 57, 57)
                        .addComponent(jbeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbmodificar)
                        .addGap(56, 56, 56)
                        .addComponent(jbsalir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrbestado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jbbuscar)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcfnac, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jrbestado))
                    .addComponent(Estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcfnac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalir)
                    .addComponent(jbeliminar)
                    .addComponent(jbnuevo)
                    .addComponent(jbmodificar))
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
        //Verificamos que el campo Documento no este vacio antes de seguir buscando
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Documento no debe estar vacio.");
            return;
        }
     
        try {

            int numconver = Integer.parseInt(text);
            Alumno en = alu.buscarAlumnoPorDni(numconver);

            jtnombre.setText(en.getNombre());
            jtapellido.setText(en.getApellido());
            jrbestado.setSelected(en.isEstado());
            jtID.setText(String.valueOf(en.getIdAlumno()));
            if (en.getFechaNacimiento() != null) {
                jdcfnac.setDate(Date.valueOf(en.getFechaNacimiento()));
            } else {
                jdcfnac.setDate(null); // Para borrar la fecha si no hay fecha de nacimiento
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El alumno no se encuentra en la Base de Datos.");
            limpiarPlanilla();
        }
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed

        //Esto de aca deberia de poder mejorarse, no logro que lance bien las excepciones.
        String text = jtdni.getText();
        AlumnoData alu = new AlumnoData();

        try {
            int numconver = Integer.parseInt(text);
            Alumno en = alu.buscarAlumnoPorDni(numconver);
            if (en.isEstado() == false) {
                JOptionPane.showMessageDialog(null, "El alumno ya se encuentra eliminado");
            } else {
                alu.eliminarAlumno(en.getIdAlumno());
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros! [DNI]");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El alumno se encuentra actualmente inactivo.");
        }

    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnuevoActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener los valores de los campos
            int dni = Integer.parseInt(jtdni.getText());
            String apellido = jtapellido.getText();
            String nombre = jtnombre.getText();
            boolean estado = jrbestado.isSelected();
            // Obtener la fecha de nacimiento en formato Date
            java.util.Date utilDate = jdcfnac.getDate();

            // Verificar que los campos obligatorios no estén vacíos
            if (jtdni.getText().isEmpty() || apellido.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                return;
            }
            // Convertir la fecha de util.Date a LocalDate
            Instant instant = utilDate.toInstant();
            LocalDate fechaNacimiento = instant.atZone(ZoneId.systemDefault()).toLocalDate();

            Alumno alumno = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
            AlumnoData alu = new AlumnoData();
            if (alu.existeDni(dni)) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra asociado a un alumno");

            } else {
                alu.guardarAlumno(alumno);
                limpiarPlanilla();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El Dni debe contener solo numero");
        }
        limpiarPlanilla();
    }//GEN-LAST:event_jbnuevoActionPerformed

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed
        // Verificar que los campos obligatorios no estén vacíos
        if (jtdni.getText().isEmpty() || jtapellido.getText().isEmpty() || jtnombre.getText().isEmpty()
                || jtID.getText().isEmpty() || jdcfnac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "No hay datos a modificar.");
            return;
        }
        try {
            // Obtener los valores de los campos
            int dni = Integer.parseInt(jtdni.getText());
            String apellido = jtapellido.getText();
            String nombre = jtnombre.getText();
            boolean estado = jrbestado.isSelected();
            int id = Integer.parseInt(jtID.getText());
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

            Alumno AluUpdate = new Alumno(id, dni, apellido, nombre, fechaNacimiento, estado);
            AlumnoData gg = new AlumnoData();
            gg.modificarAlumno(AluUpdate);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Valor nulo: " + e);
        }

    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jrbestadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbestadoStateChanged
        // TODO add your handling code here:
        if (jrbestado.isSelected()) {
            Estado.setForeground(Color.BLUE);
            Estado.setText("Activo");
        } else {
            Estado.setForeground(Color.RED);
            Estado.setText("Inactivo");
        }
    }//GEN-LAST:event_jrbestadoStateChanged

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbnuevo;
    private javax.swing.JButton jbsalir;
    private com.toedter.calendar.JDateChooser jdcfnac;
    private javax.swing.JRadioButton jrbestado;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtapellido;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtnombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarPlanilla() {
        jtapellido.setText(""); // Limpia los campos
        jtnombre.setText("");
        jtdni.setText("");
        jtID.setText("");
        jrbestado.setSelected(false);
        jdcfnac.setDate(null);
    }
}
