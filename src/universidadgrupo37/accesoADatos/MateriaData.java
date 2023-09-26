
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

    public Materia buscarMateria(int id){
        Materia materia = null;
        
        String sql = "SELECT `idMateria`, `nombre`, `año`, `estado` FROM `materia` WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe una materia con ese ID");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla materia.");
        }
        return materia;
        
    }

    public void modificarMateria(Materia materia){
     String sql="UPDATE materia SET nombre=?,anioMateria=?,estado=? WHERE idMateria=? ";
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
    String sql="UPDATE materia SET estado=0 WHERE idMateria=? ";
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

    public List<Materia> listarMaterias(){ //Borre parametro de int id
        List <Materia> materias = new ArrayList<Materia>();
        String sql = "SELECT * FROM materia WHERE estado = 1";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Materia materia=new Materia();
                //Agregue esta parte
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
 
      return materias;
    }
    
    public boolean existeMateria(int idMat) { //metodo para verificar si exite Id de materia

        boolean existe = false;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT idMateria FROM materia WHERE IdMateria = ? AND estado = 1";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMat);
            rs = ps.executeQuery();

            if (rs.next()) {
                existe = true; // Hay un registro con el mismo idMateria y estado activo
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar el Id de la Materia en la base de datos: " + ex.getMessage());
        }

        return existe;
    }
     
    public int idMateria (String materia){
     String sql = "SELECT idMateria FROM materia WHERE nombre = ?";
     PreparedStatement ps = null;
     ResultSet rs = null;
     int idmat = 0;

        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, materia);
            rs = ps.executeQuery();
                if(rs.next()){
               idmat = rs.getInt("idMateria");
                }
            ps.close();
        
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error");
        }
        return idmat;
     }
    
    public boolean existeMateriaN(String nombre) { //metodo para verificar si exite Id de materia

        boolean existe = false;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT nombre FROM materia WHERE nombre = ? AND estado = 1";
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();

            if (rs.next()) {
                existe = true; // Hay un registro con el mismo idMateria y estado activo
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar el Id de la Materia en la base de datos: " + ex.getMessage());
        }

        return existe;
    }
    
    public String nombreM(String nombre) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        String name = "";

        try {
            String sql = "SELECT nombre FROM materia WHERE nombre = ? AND estado = 1";
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();

            if (rs.next()) {
                name = rs.getString("nombre");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar el nombre de la Materia en la base de datos: " + ex.getMessage());
        }

        return name;
    }
}
