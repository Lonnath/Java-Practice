/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Lonnath
 */
public class Jugador {
    private String nombre;
    private int edad;
    private float altura;
    private float peso;
    private double salario;
    private String direccionImage;
    private String posicion;

    public Jugador(String nombre, int edad, float altura, float peso, double salario, String direccionImage, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.salario = salario;
        this.direccionImage = direccionImage;
        this.posicion = posicion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDireccionImage() {
        return direccionImage;
    }

    public void setDireccionImage(String direccionImage) {
        this.direccionImage = direccionImage;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String toString(){
        return "-Nombre: "+this.nombre+".\n                     -Edad: "+this.edad+" anios.\n                     -Altura: "+this.altura+" m.\n                     -Peso: "+this.peso+" kg.\n                     -Salario: $"+this.salario+" dls.\n                     -Imagen: "+this.direccionImage+".\n                     -Posicion: "+this.posicion+".";
    
    }
}
