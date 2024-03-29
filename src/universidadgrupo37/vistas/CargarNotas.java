package universidadgrupo37.vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo37.accesoADatos.AlumnoData;
import universidadgrupo37.accesoADatos.InscripcionData;
import universidadgrupo37.entidades.Alumno;
import universidadgrupo37.entidades.Inscripcion;
import universidadgrupo37.entidades.Materia;

public class CargarNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 2) {
                return true;
            } else {
                return false;
            }
        }
    };

    public CargarNotas() {
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        setTitle("Carga de notas");
        cargarComboBox();
        crearCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbalumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jbsalir = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.getTableHeader().setResizingAllowed(false);
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);

        jbsalir.setText("Salir");
        jbsalir.setToolTipText("*Abandona esta ventana");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbguardar.setText("Guardar");
        jbguardar.setToolTipText("*Guarda las notas de la materia seleccionada");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
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
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbguardar)
                        .addGap(54, 54, 54)
                        .addComponent(jbsalir)
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
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
        tabla.setRowCount(0);
        String aluselec = (String) jcbalumnos.getSelectedItem();

        // Verificamos que se seleccionó "Seleccione alumno...", para que no salga la NumberFormatException
        if ("Selecione alumno...".equals(aluselec)) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alumno de la lista");
            return;
        }

        AlumnoData alu = new AlumnoData();
        InscripcionData insc = new InscripcionData();
        int alselec = idAlumno();

        List<Materia> obtenerMateriaCursada = insc.obtenerMateriasCursadas(alselec);
        cargarTabla(obtenerMateriaCursada);
    }//GEN-LAST:event_jcbalumnosActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed

        InscripcionData insc = new InscripcionData();
        int alselec = idAlumno();
        try {
            int fila = jTabla.getSelectedRow();
            //extraer el idMateria de la tabla en la fila seleccionada columna 0
            int materia = Integer.parseInt(jTabla.getValueAt(fila, 0).toString());

            //obtener la nota ingresada en la fila seleccionada columna 2 
            double nota = Double.parseDouble(jTabla.getValueAt(fila, 2).toString());
//            cuando la celda nota esta vacia 

            //asegurarnos que seleccione una fila
            if (fila == -1) {

                JOptionPane.showMessageDialog(null, "Usted debe seleccionar una fila");

            } else if (nota > 0 && nota <= 10) {
                //llamar al metodo para guardar la nota
                insc.actualizarNota(alselec, materia, nota);

            } else {
                JOptionPane.showMessageDialog(null, "La nota ingresada debe ser igual o menor a 10");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese solo números ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usted debe seleccionar una fila");
        }
        //            if (jTabla.getValueAt(jTabla.getSelectedRow(), 2) == null) {
//                JOptionPane.showMessageDialog(null, "Debe ingresar una nota");
//            }


    }//GEN-LAST:event_jbguardarActionPerformed

    private void jcbalumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbalumnosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jcbalumnosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbalumnos;
    // End of variables declaration//GEN-END:variables

    private void crearCabecera() {
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Nota");
        jTabla.setModel(tabla);
    }

    private void cargarComboBox() {
        AlumnoData alu = new AlumnoData();
        List<Alumno> listaAlumno = alu.listarAlumnos();
//        for (int i = 0; alu.listarAlumnos().size() > i; i++) {
//            jcbalumnos.addItem(alu.listarAlumnos().get(i) + "");
//          
//        }
        for (Alumno alumno : listaAlumno) {
            jcbalumnos.addItem(alumno.getDni() + " - " + alumno.getApellido() + ", " + alumno.getNombre());
        }
    }

    private void cargarTabla(List<Materia> obtenerMateriaCursada) {
        InscripcionData insc = new InscripcionData();
        int alselec = idAlumno();
        for (Materia materia : obtenerMateriaCursada) {
            double notaselec = insc.buscarNota(materia.getIdMateria(), alselec);
            tabla.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), notaselec});
        }
    }

    private int idAlumno() {

        String aluselec = (String) jcbalumnos.getSelectedItem();
        InscripcionData insc = new InscripcionData();
        AlumnoData alu = new AlumnoData();
        String[] partes = aluselec.split("-");
        int alselec = 0;
        if (partes.length > 0) {
            // Usar trim() para eliminar espacios en blanco alrededor del dni
            int alumno = Integer.parseInt(partes[0].trim());
            //JOptionPane.showMessageDialog(null, alumno);
            // obtenemos el idMateria seleccionada buscandola por el nombre   
            alselec = alu.buscarAlumnoPorDni(alumno).getIdAlumno();
            //JOptionPane.showMessageDialog(null, alselec);
        }
        return alselec;
    }
}
