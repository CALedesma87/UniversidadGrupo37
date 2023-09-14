package universidadgrupo37;

import java.time.LocalDate;
import universidadgrupo37.accesoADatos.AlumnoData;
import universidadgrupo37.accesoADatos.InscripcionData;
import universidadgrupo37.accesoADatos.MateriaData;
import universidadgrupo37.entidades.Alumno;
import universidadgrupo37.entidades.Inscripcion;
import universidadgrupo37.entidades.Materia;

public class UniversidadGrupo37 {

    public static void main(String[] args) {
        //Aca solamente estuve probando los metodos como lo hace el pela en los videos.

        /*Alumno juan = new Alumno(43450222,"Luna","Pedro", LocalDate.of(1234, 4, 24), true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(juan);*/
        //AlumnoData alu = new AlumnoData();
        //Alumno encontrado = alu.buscarAlumnoPorDni(42392456);
        //Alumno encontrado = alu.buscarAlumno(2);
        //if(encontrado != null){
        //System.out.println("DNI: " + encontrado.getDni());
        //System.out.println("Nombre: " + encontrado.getNombre());
        //System.out.println("Apellido: "+ encontrado.getApellido());
//        AlumnoData alu = new AlumnoData();
//        for(Alumno alumno:alu.listarAlumnos()){
//            System.out.println("---------------------------");
//            System.out.println("-/ " + alumno.getNombre());
//            System.out.println("-/ " +alumno.getApellido());
//            System.out.println("-/ " +alumno.getDni());
//            System.out.println("-/ " +alumno.getFechaNacimiento());
//            System.out.println("-/ " +alumno.getIdAlumno());
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();

//        Alumno mish = ad.buscarAlumno(1);
//        Materia mate = md.buscarMateria(1);
//        Inscripcion insc = new Inscripcion(mish, mate, 5);
//        id.guardarInscripcion(insc);
//        System.out.println("---------------------------");
//        System.out.println("-/ " + mate.getNombre());
//        System.out.println("-/ " + mate.getAnioMateria());
//        System.out.println("-/ " + mate.isActivo());
//        for(Inscripcion insc:id.obtenerInscripciones()){
//            System.out.println("id: " + insc.getIdInscripcion());
//            System.out.println("Apellido: "+ insc.getAlumno().getApellido());
//            System.out.println("Materia: " + insc.getMateria().getNombre());
//            System.out.println("---------------------");

//        for(Materia materia:id.obtenerMateriasNoCursadas(3)){
//            System.out.println("Materia: " + materia.getNombre());
//        }
    
    }

}
