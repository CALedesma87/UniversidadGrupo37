
package universidadgrupo37.vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo37.accesoADatos.InscripcionData;
import universidadgrupo37.accesoADatos.MateriaData;
import universidadgrupo37.entidades.Alumno;
import universidadgrupo37.entidades.Inscripcion;
import universidadgrupo37.entidades.Materia;


public class ConsultaAlumnosxM extends javax.swing.JInternalFrame {
private DefaultTableModel tabla= new DefaultTableModel();
private MateriaData materiaData;
private InscripcionData inscripcionData; 

    public ConsultaAlumnosxM() {
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        setTitle("Listado de alumnos por Materias");
        cargarComboBox();
        crearCabecera();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jcbmaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una materia:  ");

        jcbmaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione materia..." }));
        jcbmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmateriasActionPerformed(evt);
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
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jcbmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbsalir)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jbsalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jcbmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmateriasActionPerformed

     //instanciamos las clase que vamos a utilizar...
      materiaData = new MateriaData(); 
      inscripcionData = new InscripcionData();

// Obtener la materia seleccionada desde el comboBox
    String materiaSeleccionada = (String) jcbmaterias.getSelectedItem();
    
    // Dividir la cadena en función de la - y tomar la primera parte
    String[] partes = materiaSeleccionada.split("-");
    if (partes.length > 0) {
                
// Usar trim() para eliminar espacios en blanco alrededor del nombre
        String materia = partes[0].trim(); 
//      JOptionPane.showMessageDialog(null, "Usted Seleccionó: "+materia);
        
     // obtenemos el idMateria seleccionada buscandola por el nombre   
        int matselec = materiaData.idMateria(materia);
        //JOptionPane.showMessageDialog(null, "El ID de la materia es : "+matselec);
    //Luego hasta que no selecciona una materia no hago nada
    if (!"Seleccione materia...".equals(materiaSeleccionada)) {
    
        //JOptionPane.showMessageDialog(null, "Ingreso al primer if");
        // Obtenemos la lista de alumnos inscritos en la materia seleccionada
        List<Alumno> alumnosInscritos = inscripcionData.obtenerAlumnosPorMateria(matselec);

       // Verificamos si hay alumnos inscritos
            if (!alumnosInscritos.isEmpty()) {
                //JOptionPane.showMessageDialog(null, "Se verifico que halla alumnos inscriptos en "+matselec);
                // Llenamos la tabla con los alumnos inscritos en la materia si hay alumnos
                llenarTabla(alumnosInscritos);
            } else {
                // Limpiamos la tabla si no hay alumnos inscritos en la materia seleccionada
                tabla.setRowCount(0);

                // Despues de limpiar la tabla mostramos un msj que no hay alumnos inscriptos
                JOptionPane.showMessageDialog(null, "No hay alumnos inscritos en esta materia.");
            }
    }
    } 
    }//GEN-LAST:event_jcbmateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbmaterias;
    // End of variables declaration//GEN-END:variables

private void crearCabecera(){
        tabla.addColumn("ID");
        tabla.addColumn("DNI");
        tabla.addColumn("Apellido");
        tabla.addColumn("Nombre");
        jTable1.setModel(tabla);
    }
 private void cargarComboBox(){
        MateriaData mat =new MateriaData();
        List <Materia> materiasel = mat.listarMaterias();
 
//        for(int i=0;mat.listarMaterias().size()>i;i++){
//          jcbmaterias.addItem(mat.listarMaterias().get(i)+"");
//        } 
        for(Materia materia : materiasel){
        jcbmaterias.addItem(materia.getNombre()+ " - Año: "+materia.getAnioMateria());
        }

    } 
 
private void llenarTabla(List<Alumno> alumnosInscritos) {
        // Limpiar la tabla
        tabla.setRowCount(0);

        // Llenar la tabla con los datos de los alumnos inscritos en la materia
        for (Alumno alumno : alumnosInscritos) {
            tabla.addRow(new Object[]{alumno.getIdAlumno(),alumno.getDni(), alumno.getApellido(), alumno.getNombre()});
        }
    }

}
