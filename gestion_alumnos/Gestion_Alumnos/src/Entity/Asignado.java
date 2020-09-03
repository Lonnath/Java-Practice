
package Entity;

import java.util.ArrayList;

public class Asignado {
        private int materia;
        private ArrayList<String> alumnos;

    public int getMateria() {
        return materia;
    }
    public void eliminateAlumno(String s){
        this.alumnos.remove(s);
    }
    
    public void addAlumno(String s){
        this.alumnos.add(s);
    }

    public ArrayList<String> getAlumnos() {
        return alumnos;
    }

    public Asignado(int materia) {
        this.materia = materia;
         this.alumnos = new ArrayList();
    }
    
    public String toString(){
        String var = "";
        for (int i = 0; i < this.alumnos.size(); i++) {
            var += "\n  - "+this.alumnos.get(i);
        }
        return var;
    }
}
