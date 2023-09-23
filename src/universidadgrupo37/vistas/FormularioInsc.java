package universidadgrupo37.vistas;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import universidadgrupo37.accesoADatos.AlumnoData;
import universidadgrupo37.accesoADatos.InscripcionData;
import universidadgrupo37.accesoADatos.MateriaData;
import universidadgrupo37.entidades.Alumno;
import universidadgrupo37.entidades.Inscripcion;
import universidadgrupo37.entidades.Materia;

public class FormularioInsc extends javax.swing.JInternalFrame {
private DefaultTableModel tabla= new DefaultTableModel();
private Materia md = new Materia();
private InscripcionData id = new InscripcionData();
private MateriaData mds = new MateriaData();
private Alumno al = new Alumno();
private AlumnoData alu = new AlumnoData();

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
        selecAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrbinscriptas = new javax.swing.JRadioButton();
        matNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbsalir = new javax.swing.JButton();
        anularInscripcion = new javax.swing.JButton();
        Inscribir = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripciones");

        jLabel2.setText("Selecione un Alumno:");

        selecAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Alumno..." }));
        selecAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        jLabel4.setText("Materias Inscriptas");

        jLabel5.setText("Materias no Inscriptas");

        jrbinscriptas.setToolTipText("*Muestra la lista de materias inscriptas del alumno seleccionado");
        jrbinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbinscriptasActionPerformed(evt);
            }
        });

        matNoInscriptas.setToolTipText("*Muestra la lista de materias no inscriptas del alumno seleccionado");
        matNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matNoInscriptasActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbsalir.setText("Salir");
        jbsalir.setToolTipText("*Cierra esta ventana");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        anularInscripcion.setText("Anular Inscripcion");
        anularInscripcion.setToolTipText("*Anula la inscripcion a la materia seleccionada");
        anularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anularInscripcionActionPerformed(evt);
            }
        });

        Inscribir.setText("Inscribir");
        Inscribir.setToolTipText("*Inscribe al alumno en la materia seleccionada");
        Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbinscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(matNoInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(selecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Inscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(anularInscripcion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbinscriptas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matNoInscriptas)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inscribir)
                    .addComponent(anularInscripcion)
                    .addComponent(jbsalir))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecAlumnoActionPerformed
        // TODO add your handling code here:
        limpiarPlanilla();
    }//GEN-LAST:event_selecAlumnoActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirActionPerformed

        //IMPORTANTE!:
        //# Tuve que establecer en 0 el valor predeterminado de la nota
        //# ya que en teoria hacemos un manejo de notas luego.
        InscripcionData id = new InscripcionData();
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();

        try {
            int filaSeleccionada = jTable1.getSelectedRow();
            String dPana = "";

            if (filaSeleccionada != -1) {
                // Crea un arreglo para almacenar los datos de la fila
                Object[] fila = new Object[tabla.getColumnCount()];
                // El for para llenar una fila con todos los datos
                for (int i = 0; i < tabla.getColumnCount(); i++) {
                    fila[i] = tabla.getValueAt(filaSeleccionada, i);
                }
                // le asignamos el valor a la materia:

                dPana = fila[1].toString();

                // le asignamos el valor al alumno:
                String alumnoSeleccionado = (String) selecAlumno.getSelectedItem();
                String[] partes = alumnoSeleccionado.split("-");
                String alumno = partes[0].trim();
                int alumSelec = alu.idAlumno(Integer.parseInt(alumno));
                Alumno aydiAl = ad.buscarAlumno(alumSelec);

                // Este es un paso adicional que tuve que hacer para poder buscar la materia por id por conflictos de tipo (materia, STR, INT):
                int mat = md.idMateria(dPana);
                Materia angora = md.buscarMateria(mat);

                // Asignamos todos los valores a la inscripcion:
                Inscripcion insc = new Inscripcion(aydiAl, angora, 0.0);
                id.guardarInscripcion(insc);
            }

        } catch (NullPointerException e) {
            //Hay que agregar los otros posibles errores que contenga esto:
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_InscribirActionPerformed

    private void anularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularInscripcionActionPerformed
        // TODO add your handling code here:
        InscripcionData id = new InscripcionData();
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();

        try {
            int filaSeleccionada = jTable1.getSelectedRow();
            String dPana = "";

            if (filaSeleccionada != -1) {
                // Crea un arreglo para almacenar los datos de la fila
                Object[] fila = new Object[tabla.getColumnCount()];
                // El for para llenar una fila con todos los datos
                for (int i = 0; i < tabla.getColumnCount(); i++) {
                    fila[i] = tabla.getValueAt(filaSeleccionada, i);
                }
                // le asignamos el valor a la materia:

                dPana = fila[1].toString();

                // le asignamos el valor al alumno:
                String alumnoSeleccionado = (String) selecAlumno.getSelectedItem();
                String[] partes = alumnoSeleccionado.split("-");
                String alumno = partes[0].trim();
                int alumSelec = alu.idAlumno(Integer.parseInt(alumno));

                int mat = md.idMateria(dPana);
                

                // Asignamos todos los valores a la inscripcion:
                id.borrarInscripcionMateriaAlumno(alumSelec, mat);
            }

        } catch (NullPointerException e) {
            //Hay que agregar los otros posibles errores que contenga esto:
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_anularInscripcionActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void matNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matNoInscriptasActionPerformed
        //#Leer los comentarios en el codigo del siguiente JRadioButton#
        boolean estado = matNoInscriptas.isSelected();
        if(estado == true){jrbinscriptas.setSelected(false);}
        
        try {

            if (estado == true) {
                String alumnoSeleccionado = (String) selecAlumno.getSelectedItem();
                
                String[] partes = alumnoSeleccionado.split("-");
                
                String alumno = partes[0].trim();
                 //Vereficamos que seleccione un alumno antes
                if(alumnoSeleccionado.equals("Seleccione Alumno...")){
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar una alumno");
                    return;
                }
                
                int alumSelec = alu.idAlumno(Integer.parseInt(alumno));
                
                List<Materia> materias_1 = id.obtenerMateriasNoCursadas(alumSelec);
                
                llenarTabla(materias_1);
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno..." );
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            
        }

    }//GEN-LAST:event_matNoInscriptasActionPerformed

    private void jrbinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbinscriptasActionPerformed
        //Esto comprueba el estado del JRadioButton "Materias Inscriptas"
        boolean estado = jrbinscriptas.isSelected();
        if(estado == true){matNoInscriptas.setSelected(false);}
        
        //Hay que pulir los try-catch #Hay que hacer prueba de errores (No olvidarse de usarlos)
        try {

            if (estado == true) {
                //Se selecciona el alumno del comboBox
                String alumnoSeleccionado = (String) selecAlumno.getSelectedItem();
                //Lo "convertimos" en un array/vector
                String[] partes = alumnoSeleccionado.split("-");
                //Seleccionamos la parte que nos interesa
                String alumno = partes[0].trim();
                //Vereficamos que seleccione un alumno antes
                if(alumnoSeleccionado.equals("Seleccione Alumno...")){
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar una alumno");
                    return;
                }
                //Creamos una variable nueva para hacer conversion del String a Int
                int alumSelec = alu.idAlumno(Integer.parseInt(alumno));
                //Se crea el array para pasarle los datos y crear la lista
                List<Materia> materias_1 = id.obtenerMateriasCursadas(alumSelec);
                //Cargamos la JTable:
                llenarTabla(materias_1);
            
            }

        } catch (NullPointerException e) {
           JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno...");
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            
        }
    }//GEN-LAST:event_jrbinscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inscribir;
    private javax.swing.JButton anularInscripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbsalir;
    private javax.swing.JRadioButton jrbinscriptas;
    private javax.swing.JRadioButton matNoInscriptas;
    private javax.swing.JComboBox<String> selecAlumno;
    // End of variables declaration//GEN-END:variables

 private void crearCabecera(){
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Año");
        jTable1.setModel(tabla);
    }
 
  private void cargarComboBox(){
        AlumnoData alu=new AlumnoData();
        List<Alumno> listaAlumno = alu.listarAlumnos();
//        for(int i=0;alu.listarAlumnos().size()>i;i++){
//          selecAlumno.addItem(alu.listarAlumnos().get(i)+"");
//        } 
for (Alumno alumno : listaAlumno) {
        selecAlumno.addItem(alumno.getDni()+" - "+ alumno.getApellido() + ", " + alumno.getNombre());
    }

  }
  
  private void llenarTabla(List<Materia> materiasInscriptas) {
        // Limpiar la tabla
        tabla.setRowCount(0);

        // Llenar la tabla con los datos de los alumnos inscritos en la materia
        for (Materia mats : materiasInscriptas) {
            tabla.addRow(new Object[]{mats.getIdMateria(), mats.getNombre(), mats.getAnioMateria()});
        }
    }
  private void limpiarPlanilla(){
  //setea a 0 planilla excepto el combobox
      
  DefaultTableModel modeloLimpio = (DefaultTableModel) jTable1.getModel();
    modeloLimpio.setRowCount(0);
    matNoInscriptas.setSelected(false);
    jrbinscriptas.setSelected(false);
  }
  
}
