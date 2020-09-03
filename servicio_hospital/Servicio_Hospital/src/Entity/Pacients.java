/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Lonnath
 */
public class Pacients implements Comparable<Pacients> {

    private int secure;
    private int gradoDolencia;
    private String medicoHabitual;

    public Pacients(int secure, int gradoDolencia, String habitual) {
        this.secure = secure;
        this.gradoDolencia = gradoDolencia;
        this.medicoHabitual = habitual;
    }

    public String getMedicoHabitual() {
        return this.medicoHabitual;
    }

    public void setMedicoHabitual(String medicoHabitual) {
        this.medicoHabitual = medicoHabitual;
    }

    public int getGradoDolencia() {
        return gradoDolencia;
    }

    public void setGradoDolencia(int gradoDolencia) {
        this.gradoDolencia = gradoDolencia;
    }

    public int getSecure() {
        return this.secure;
    }

    public void setSecure(int asecure) {
        this.secure = asecure;
    }

    public String toString() {
        return "PACIENTE: " + this.secure + "\n  GRADO DE DOLENCIA: " + this.gradoDolencia;
    }

    @Override
    public int compareTo(Pacients t) {
        if (t.getGradoDolencia() < this.getGradoDolencia()) {
            return 1;
        } else {
            return -1;
        }

    }

}
