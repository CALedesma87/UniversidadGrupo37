
package universidadgrupo37.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo37.entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES (? ,? ,? ,? ,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla alumno");
        }
    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET dni = ?,apellido = ?,nombre = ?,fechaNacimiento = ?,estado = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
            ps.close();
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno"+ex.getMessage());
        }

    }

    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        PreparedStatement ps = null;
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla alumno");
        }

    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;

        String sql = "SELECT idAlumno,dni,apellido, nombre, fechaNacimiento, estado FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese id");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla alumno");
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {

        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni=? AND (estado =1 OR estado =0)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno" + alumno.isEstado());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }

        return alumno;

    }
    
    public List<Alumno> listarAlumnos(){
        
        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            Alumno alumno = new Alumno();
            
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setEstado(rs.getBoolean("estado"));
            alumnos.add(alumno);}
            
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }catch (NullPointerException e){JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());}
        return alumnos;
    }
    
    public boolean existeDni(int dni) { //metodo para verificar si exite el dni en la base de dato
    boolean existe = false;
    boolean inactivo = false;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        String sql = "SELECT idAlumno FROM alumno WHERE dni = ? AND (estado = 1 OR estado = 0)";
        ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        rs = ps.executeQuery();

        if (rs.next()) {
            int estado = rs.getInt("estado");
            if (estado == 1) {
                existe = true; // Hay un registro con el mismo DNI y estado activo
            } else if (estado == 0) {
                inactivo = true; // El alumno está inactivo
            }
        }
        ps.close();

        if (inactivo) {
            JOptionPane.showMessageDialog(null, "El alumno con DNI " + dni + " se encuentra en la base de datos, pero está INACTIVO.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al verificar el DNI en la base de datos: " + ex.getMessage());
    } 

    return existe;
}


    public int idAlumno (int dni){
     String sql = "SELECT idAlumno FROM alumno WHERE dni = ?";
     
     int idmat = 0;

        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
                if(rs.next()){
               idmat = rs.getInt("idAlumno");
                }
            ps.close();
        
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error");
        }
        return idmat;
     }

    
}
