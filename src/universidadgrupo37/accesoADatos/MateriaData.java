
package universidadgrupo37.accesoADatos;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import universidadgrupo37.entidades.Materia;


public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia){}

    //Materia buscarMateria(int id){}

    public void modificarMateria(Materia materia){}

    public void eliminarMateria(int id){}

    public List<Materia> listarMaterias(int id){
        List <Materia> materias = new ArrayList<Materia>();


    }
}
