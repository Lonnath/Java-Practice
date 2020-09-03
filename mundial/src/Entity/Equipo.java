/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.LinkedList;

/**
 *
 * @author Lonnath
 */
public class Equipo {

    private String paisOrigen;
    private String nombreDirector;
    private String direccionImagen;
    private LinkedList<Jugador> jugadores;

    public Equipo(String paisOrigen, String nombreDirector, String direccionImagen) {
        this.paisOrigen = paisOrigen;
        this.nombreDirector = nombreDirector;
        this.direccionImagen = direccionImagen;
        this.jugadores = new LinkedList();
    }

    public double calcularNomina() {
        double nomin = 0;
        for (int i = 0; i < this.jugadores.size(); i++) {
            nomin += this.jugadores.get(i).getSalario();
        }
        return nomin;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    public void addPlayer(String nombre, int edad, float altura, float peso, double salario, String direccionImage, String posicion) {
        this.jugadores.add(new Jugador(nombre, edad, altura, peso, salario, direccionImage, posicion));
    }

    public Jugador searchP(String nombre) {
        for (int i = 0; i < this.jugadores.size(); i++) {
            if (this.jugadores.get(i).getNombre().equals(nombre)) {
                return this.jugadores.get(i);
            }
        }
        return null;
    }

    public String toString() {
        String salida = "\n         -Nombre Equipo: " + this.paisOrigen + "\n          Director: " + this.nombreDirector + "\n          Imagen: " + this.direccionImagen + "\n";
        if (this.jugadores.size() > 0) {
            for (int i = 0; i < this.jugadores.size(); i++) {
                salida +="                   "+ (i+1) + "." + this.jugadores.get(i).toString();
            }
        }

        return salida;

    }
}
