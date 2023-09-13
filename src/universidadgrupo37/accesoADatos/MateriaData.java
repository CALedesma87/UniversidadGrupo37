
package universidadgrupo37.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo37.entidades.Materia;


public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia){
    String sql="INSERT INTO materia( nombre, año, estado) "
            + "VALUES (?,?,?)";

        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
             if (rs.next()) {

                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada");
            }
            ps.close();
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla materia");
        }}

    //Materia buscarMateria(int id){}

    public void modificarMateria(Materia materia){
     String sql="UPDATE materia SET nombre=?,anioMateria=?,estado=? WHERE idMatria=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            int exito= ps.executeUpdate();
            if(exito==1){
              JOptionPane.showMessageDialog(null,"Materia modificada");
          }
           ps.close(); 
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }

    public void eliminarMateria(int id){
    String sql="UPDATE materia SET activo=0 WHERE idMatria=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
        int exito=ps.executeUpdate();
            if(exito==1){
             JOptionPane.showMessageDialog(null,"Materia eliminada");
         }
           ps.close();  
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }

    public List<Materia> listarMaterias(int id){
        List <Materia> materias = new ArrayList<Materia>();
        String sql = "SELECT * FROM materia WHERE activo = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Materia materia=new Materia();
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
 
      return materias;
    }
}
