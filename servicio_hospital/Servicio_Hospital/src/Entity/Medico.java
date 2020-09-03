package Entity;

import java.util.ArrayList;

public class Medico {

    private String nombre;
    private ArrayList<Pacients> atendidos = new ArrayList();
    private boolean disponible = true;
    private int turnosDiarios = 20;

    public ArrayList<Pacients> getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(ArrayList<Pacients> atendidos) {
        this.atendidos = atendidos;
    }

    public int getTurnosDiarios() {
        return turnosDiarios;
    }
    public void disminuirTurnosDiarios() {
        this.turnosDiarios--;
    }
    public Medico(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void addAtendido(Pacients p){
       this.atendidos.add(p);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean disponible(){
        return this.disponible;
    }
    public void setDisponible(boolean disp){
        this.disponible = disp;
    }
    public String toString(){
        String output="\nMedico: "+this.nombre+"\n";
        for (int i = 0; i < this.atendidos.size(); i++) {
            output+="\n - "+this.atendidos.get(i);
        }
        
        return output;
    }
}
