/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.util.*;
import Model.Mundial;

/**
 *
 * @author Lonnath
 */
public class Football {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------BIENVENIDO AL SISTEMA DE MUNDIAL DE FOOTBALL------------------");
        Mundial mundial = new Mundial();
        int a = 0;
        while (a == 0) {
            System.out.println("Escoja una opción del menú principal.");
            System.out.println("1.Añadir Equipo.");
            System.out.println("2.Añadir Jugador.");
            System.out.println("3.Calcular Valor de Nomina.");
            System.out.println("4.Imprimir información de Jugador.");
            System.out.println("5.Imprimir Equipos.");
            System.out.println("6.Salir.");
            int b = sc.nextInt();

            if (b == 1) {
                System.out.println("\n------------------Digite el Nombre del Pais Del Equipo------------------.");
                String nombrePais = sc.next();
                System.out.println("------------------Digite el Nombre del Director Tecnico.------------------");
                String nombreDirector = sc.next();
                System.out.println("------------------Digite la Direccion de Imagen. (sin espaciados)------------------");
                String dirImage = sc.next();
                mundial.addTeam(nombrePais, nombreDirector, dirImage);
                System.out.println("\n\nEl Equipo se integro correctamente al listado...         \n\n\n ");
            }
            if (b == 2) {
                System.out.println("------------------Digite Nombre del Equipo Al que Añadirá el Jugador------------------");
                String team = sc.next();
                System.out.println("------------------Digite el Nombre del Jugador------------------");
                String name = sc.next();
                System.out.println("------------------Digite la Edad del Jugador.------------------");
                int edad = sc.nextInt();
                System.out.println("------------------Digite la Altura del Jugador.------------------");
                float altura = sc.nextFloat();
                System.out.println("------------------Digite el Peso del Jugador.------------------");
                float peso = sc.nextFloat();
                System.out.println("------------------Digite el Salario del Jugador.------------------");
                double salario = sc.nextDouble();
                System.out.println("------------------Digite la Direccion de Imagen del Jugador. (sin espaciados)------------------");
                String direccion = sc.next();
                System.out.println("Escoja la Posición del Jugador.\n1.Delantero.\n2.Centro Campista.\n3.Defensa.\n4.Arquero.");
                int c = sc.nextInt();
                String pos = "";
                if (c == 1) {
                    pos = "Delantero";
                } else if (c == 2) {
                    pos = "Centro Campista";
                } else if (c == 3) {
                    pos = "Defensa";
                } else if (c == 4) {
                    pos = "Arquero";
                } else {
                    pos = "Null";
                }
                if (pos.equals("Null")) {
                    System.out.println("Intente nuevamente añadir a un jugador, escribio un dato invalido.");
                } else {
                    mundial.addPlayer(team, name, edad, altura, peso, salario, direccion, pos);
                }
            }
            if(b==3){
                System.out.println("\n\n\n"+mundial.calcularNominas()+"\n\n\n");
            }
            if (b==4) {
                System.out.println("------------------Digite Nombre del Equipo en el Cual Buscar------------------");
                String  equipo = sc.next();
                System.out.println("------------------Digite Nombre del Jugador al Cual Buscar------------------");
                String  jugador = sc.next();
                System.out.println("------------------INFORMACIÖN DE JUGADOR------------------\n"+mundial.buscarJugador(equipo, jugador)+"\n\n\n");
                       
            }
            if (b == 5) {
                System.out.println(mundial.datosEquipos());
            }
            if (b == 6) {
                a = 1;
            }

        }
    }

}
