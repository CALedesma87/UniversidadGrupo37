/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadgrupo37.vistas;


public class Instrucciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Instrucciones
     */
    public Instrucciones() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setTitle("Instrucciones");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Alumno:\n\n*Para agregar alumnos, debe completar los\ncampos de 'Documento', 'Apellido', 'Nombre'\n'Estado' (Activo / Inactivo), 'Fecha de Nac.' y\nluego seleccionar 'Nuevo'.\n\n*Para buscar alumnos debe ingresar el ID o\nel número de documento y luego seleccionar\n'Buscar'.\n\n*Para modificar los datos de los alumnos\ndebe buscar primero al alumno por ID o\ndocumento y luego de hacer los cambios \nseleccionar 'Modificar'.");
        jTextArea1.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        jTextArea1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("Materia:\n\n*Para buscar una materia debe ingresar \nel ID y luego seleccionar 'Buscar'.\n\n*Para modificar los datos de una materia \ncomo el nombre, el año o si esta activa, \ndebera buscar la materia primero y luego \nmodificar dichos datos y por ultimo sele-\nccionar 'Guardar'.\n\n*Para eliminar una materia debera buscar\nprimero la materia y por último seleccionar\n'Eliminar'.");
        jTextArea2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        jTextArea2.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Administracion:\n \n\\Manejo de inscripciones:\n\n*Para inscribir a un alumno en una materia\ndebe seleccionar primero al alumno en la\nlista, hacer click en 'Materias no Inscriptas'\nseleccionar la materia y luego seleccionar \n'Inscribir'.\n\n*Para eliminar a un alumno en una materia\ninscripta debe seleccionar primero al alumno\nen la lista, hacer click en 'Materias Inscrip-\ntas', seleccionar la materia y luego sele-\nccionar 'Anular Inscripcion'.\n\n\\Manipulacion de notas:\n\n*Para modificar las notas de cada materia,\ndebera seleccionar al alumno en la lista,\nhacer doble click en el casillero debajo de \n'Nota', ingresar la nota correspondiente\n(1-10 o 0.0-10.0) y seleccionar 'Guardar Nota'");
        jTextArea3.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        jTextArea3.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setRows(5);
        jTextArea4.setText("Consultas:\n\n*Para ver la cantidad de alumnos por materia\ntan solo debe seleccionar una de la lista y a\ncontinuacion se le proporcionara toda la info\nen la tabla de abajo.");
        jTextArea4.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        jTextArea4.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
