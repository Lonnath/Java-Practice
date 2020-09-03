/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;
import Entity.Equipo;
import Entity.Jugador;
/**
 *
 * @author Lonnath
 */
public class Mundial {

    private LinkedList<Equipo> equipos;
    public Mundial(){
        this.equipos = new LinkedList();
    }
    private Equipo buscarEquipo(String nombre) {
        for (int i = 0; i < this.equipos.size(); i++) {
            if (this.equipos.get(i).getPaisOrigen().equals(nombre)) {
                return this.equipos.get(i);
            }
        }
        return null;
    }
    public String calcularNominas(){
        String nominaz ="------------------NOMINAS------------------";
        double nominas = 0;
        for (int i = 0; i < this.equipos.size(); i++) {
            nominaz+="\n-Equipo: "+this.equipos.get(i).getPaisOrigen()+" Nomina: "+this.equipos.get(i).calcularNomina();
            nominas+=this.equipos.get(i).calcularNomina();
        }
        return nominaz+"\nTotal de todas las nominas: "+nominas;
    }
    public String buscarJugador(String paisOrigen, String nombreJugador){
        Equipo team = buscarEquipo(paisOrigen);
         if (team == null) {
            return "Equipo no existe.";
        } else {
             Jugador tmpP = team.searchP(nombreJugador);
             if(tmpP==null){
                 return "No existe el Jugador.";
             }else {
                 return tmpP.toString();
             }
            
        }
    }
    public void addPlayer(String paisOrigen, String nombre, int edad, float altura, float peso, double salario, String direccionImage, String posicion) {
        Equipo team = buscarEquipo(paisOrigen);
        if (team == null) {
            System.out.println("Equipo no existe.");
        } else {
            team.addPlayer(nombre, edad, altura, peso, salario, direccionImage, posicion);
            team = null;
        }
    }

    public void addTeam(String paisOrigen, String nombreDirector, String direccionImage) {
        if (buscarEquipo(paisOrigen) == null) {
            this.equipos.add(new Equipo(paisOrigen, nombreDirector, direccionImage));
        } else {
            System.out.println("El Mundial Ya Cuenta Con Este Equipo, Comuniquese Con Los Directivos.");
        }
    }
    
    public String datosEquipos(){
        String salida = "------------------------------------EQUIPOS------------------------------------";
        for (int i = 0; i < this.equipos.size(); i++) {
            salida+= this.equipos.get(i).toString();
        }
        return salida;
    }
}
