package Control;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import Entity.Asignado;
public class SistemaGestion {
    private Hashtable<String, String[]> alumnos;
    private Hashtable<Integer, String[]> materias;
    private ArrayList<Asignado> asignaciones;
    public String addAsignado(String codigo, String estudiante){
            if(this.asignaciones.size()==0){
                    Asignado c = new Asignado(Integer.parseInt(codigo));
                    c.addAlumno(estudiante);
                    asignaciones.add(c);
                    return "ASIGNADO EXITOSAMENTE";
            }
            for (Asignado s: this.asignaciones) {
                if(s.getMateria()==Integer.parseInt(codigo)){
                     s.addAlumno(estudiante);
                     return "ASIGNADO EXITOSAMENTE";
                }else {
                    Asignado c = new Asignado(Integer.parseInt(codigo));
                    c.addAlumno(estudiante);
                    asignaciones.add(c);
                    return "ASIGNADO EXITOSAMENTE";
                }
        }
            return "";
            
    }
    public String eliminarAssignado(String codigo, String estudiante){
        for (Asignado s: this.asignaciones) {
            if(s.getMateria()==Integer.parseInt(codigo)){
                for (int i = 0; i < s.getAlumnos().size(); i++) {
                    if(estudiante.equals(s.getAlumnos().get(i))){
                        s.eliminateAlumno(estudiante);
                        return "ELIMINADO EXITOSAMENTE";
                    }
                }
            
            }
        }
        return "NO ENCONTRADO";
    }
    public boolean verificarMateria(String materia){
        System.out.println(this.materias.containsKey(Integer.parseInt(materia)));
        return materias.containsKey(materia);
    }
    public String mostrarAsignados(){
        if(this.asignaciones.size()==0){
            return "NO HA ASIGNADO A NINGUN ESTUDIANTE";
        }
        String output ="--------------ASIGNACIONES------------------";
        for (Asignado s: this.asignaciones) {
            output+= "\n¤ Materia: "+s.getMateria()+""+s.toString();
        }
        return output;
    }
    public String modificarMateria(String identificador, String nombre, String creditos, boolean val, String alt){
        if(!identificador.equals("")){
            if(!nombre.equals("")){
            this.materias.get(Integer.parseInt(identificador))[0] = nombre;
            }
            if(!creditos.equals("")){
                this.materias.get(Integer.parseInt(identificador))[1]=creditos;
            }
            if(val){
                String [] tmp = new String[2];
                tmp[0] = this.materias.get(Integer.parseInt(identificador))[0];
                tmp[1] = this.materias.get(Integer.parseInt(identificador))[1];
                this.materias.remove(Integer.parseInt(identificador));
                this.materias.put(Integer.parseInt(alt), tmp);
            }
            return "CAMBIOS REALIZADOS CORRECTAMENTE";
        }else return "DIGITE UN CODIGO DE ASIGNATURA";
    }
    public String modificarAlumno(String dni, String nombre, String apellido, String direccion, String email, String edad, boolean valid, String alt){
        if(!dni.equals("")){
            boolean mod = true;
            for (int i = 0; i < this.alumnos.get("DNI").length; i++) {
                if(this.alumnos.get("DNI")[i].equals(dni)){
                    if(valid){
                    if(!alt.equals("")){
                        this.alumnos.get("DNI")[i] = alt;
                    }
                    }
                    if(!apellido.equals("")){
                        this.alumnos.get("Apellido")[i] = apellido;
                    }
                    if(!direccion.equals("")){
                        this.alumnos.get("Direccion")[i] = direccion;
                    }
                    if(!email.equals("")){
                        this.alumnos.get("email")[i] = email;
                    }
                    if(!edad.equals("")){
                        this.alumnos.get("edad")[i] = edad;
                    }
                    mod = false;
                }
            }
            if(!mod){
                
            return "MODIFICADO EXITOSAMENTE";
            }else return "DNI NO ENCONTRADO";
        }else return "DIGITE UN DNI";
    }

    public SistemaGestion() {
        this.alumnos = new Hashtable<String, String[]>();
        this.alumnos.put("DNI", new String[0]);
        this.alumnos.put("Nombre", new String[0]);
        this.alumnos.put("Apellido", new String[0]);
        this.alumnos.put("Direccion", new String[0]);
        this.alumnos.put("email", new String[0]);
        this.alumnos.put("edad", new String[0]);
        this.materias = new Hashtable<Integer, String[]>();
        this.asignaciones = new ArrayList();
    }

    public void addMateria(String identificador, String nombre, String numeroCreditos) {
        if(!verificarMateria(identificador)){
        
        String[] v = new String[3];
        v[0] = nombre;
        v[1] = numeroCreditos;
        this.materias.put(Integer.parseInt(identificador), v);

        }
    }
    public int tamanioMaterias(){
        return this.materias.size();
    }
    public void eliminateMateria(String identificador) {
        this.materias.remove(Integer.parseInt(identificador));

    }

    public void eliminateAlumno(String dni) {
        this.alumnos = eliminarDatos(dni);
    }

    private Hashtable<String, String[]> eliminarDatos(String dni) {
        Hashtable<String, String[]> aTmp = new Hashtable<String, String[]>();
        aTmp.put("DNI", new String[this.alumnos.get("DNI").length - 1]);
        aTmp.put("Nombre", new String[this.alumnos.get("DNI").length - 1]);
        aTmp.put("Apellido", new String[this.alumnos.get("DNI").length - 1]);
        aTmp.put("Direccion", new String[this.alumnos.get("DNI").length - 1]);
        aTmp.put("email", new String[this.alumnos.get("DNI").length - 1]);
        aTmp.put("edad", new String[this.alumnos.get("DNI").length - 1]);
        int tmpo = 0;
        for (int i = 0; i < this.alumnos.get("DNI").length; i++) {
            if (!dni.equals(this.alumnos.get("DNI")[i])) {
                aTmp.get("DNI")[tmpo] = this.alumnos.get("DNI")[i];
                aTmp.get("Nombre")[tmpo] = this.alumnos.get("Nombre")[i];
                aTmp.get("Apellido")[tmpo] = this.alumnos.get("Apellido")[i];
                aTmp.get("Direccion")[tmpo] = this.alumnos.get("Direccion")[i];
                aTmp.get("email")[tmpo] = this.alumnos.get("email")[i];
                aTmp.get("edad")[tmpo] = this.alumnos.get("edad")[i];
                tmpo++;
            }
        }

        return aTmp;
    }

    public String materiasToString() {
        if (this.materias.size() == 0) {
            return "No hay Materias registradas";
        }
        String output = "---------MATERIAS---------\n¤ IDENTIFICADOR - NOMBRE MATERIA - CREDITOS MATERIA\n";
        Set<Integer> keys = this.materias.keySet();
        for (Integer key : keys) {

            output += "\n¤ " + key + " - " + this.materias.get(key)[0] + " - " + this.materias.get(key)[1];
        }
        return output;

    }
    public int tamanioAlumnos(){
       return this.alumnos.get("DNI").length;
    }
    private boolean verificarIngreso(String dni){
        for (int i = 0; i < this.alumnos.get("DNI").length; i++) {
            if(dni.equals(this.alumnos.get("DNI")[i])){
                return true;
            }
        }
        return false;
    }
    public String addAlumno(String dni, String nombre, String apellido, String direccion, String email, String edad) {
        if (verificarIngreso(dni)) {
            return "USUARIO REGISTRADO PREVIAMENTE";
        }else{
        this.alumnos = incrementarAlumno();
        this.alumnos.get("DNI")[this.alumnos.get("DNI").length - 1] = dni;
        this.alumnos.get("Nombre")[this.alumnos.get("DNI").length - 1] = nombre;
        this.alumnos.get("Apellido")[this.alumnos.get("DNI").length - 1] = apellido;
        this.alumnos.get("Direccion")[this.alumnos.get("DNI").length - 1] = direccion;
        this.alumnos.get("email")[this.alumnos.get("DNI").length - 1] = email;
        this.alumnos.get("edad")[this.alumnos.get("DNI").length - 1] = edad;
            return "USUARIO REGISTRADO EXITOSAMENTE";
        }
    }

    private Hashtable<String, String[]> incrementarAlumno() {
        Hashtable<String, String[]> alumnosTmp = new Hashtable<String, String[]>();
        alumnosTmp.put("DNI", new String[this.alumnos.get("DNI").length + 1]);
        alumnosTmp.put("Nombre", new String[this.alumnos.get("DNI").length + 1]);
        alumnosTmp.put("Apellido", new String[this.alumnos.get("DNI").length + 1]);
        alumnosTmp.put("Direccion", new String[this.alumnos.get("DNI").length + 1]);
        alumnosTmp.put("email", new String[this.alumnos.get("DNI").length + 1]);
        alumnosTmp.put("edad", new String[this.alumnos.get("DNI").length + 1]);
        for (int i = 0; i < this.alumnos.get("DNI").length; i++) {
            alumnosTmp.get("DNI")[i] = this.alumnos.get("DNI")[i];
            alumnosTmp.get("Nombre")[i] = this.alumnos.get("Nombre")[i];
            alumnosTmp.get("Apellido")[i] = this.alumnos.get("Apellido")[i];
            alumnosTmp.get("Direccion")[i] = this.alumnos.get("Direccion")[i];
            alumnosTmp.get("email")[i] = this.alumnos.get("email")[i];
            alumnosTmp.get("edad")[i] = this.alumnos.get("edad")[i];
        }

        return alumnosTmp;
    }

    public String estudiantesToString() {
        if (this.alumnos.get("Nombre").length == 0) {
            return "No hay Alumnos registrados";
        }
        String output = "---------ALUMNOS REGISTRADOS---------\n¤ DNI - Nombre - Apellido - Direccion - Email - Edad\n";

        for (int i = 0; i < this.alumnos.get("DNI").length; i++) {
            String val = "¤ " + this.alumnos.get("DNI")[i] + " - " + this.alumnos.get("Nombre")[i] + " - " + this.alumnos.get("Apellido")[i] + " - " + this.alumnos.get("Direccion")[i] + " - " + this.alumnos.get("email")[i] + " - " + this.alumnos.get("edad")[i] + "";

            output += val + ";\n";
        }
        return output;
    }

}
