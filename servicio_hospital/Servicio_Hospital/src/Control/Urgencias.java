package Control;

import Entity.Secure;
import java.util.Queue;
import java.util.PriorityQueue;
import Entity.Medico;
import Entity.Medico;
import Entity.Pacients;
import Entity.Secure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Urgencias {

    Queue<Pacients> atencion = new PriorityQueue<Pacients>();
    Queue<Secure> securityPacients = new PriorityQueue<Secure>();
    ArrayList<Medico> medicos = new ArrayList<Medico>();
    Queue<Medico> medicosOcupados = new LinkedList();

    public Urgencias() {

    }

    public String insertaPaciente(String asegurado, String gradoDolencia, String habitual) {
        boolean ver = verificarPaciente(Integer.parseInt(asegurado));
        if (ver) {
            
            atencion.add(new Pacients(Integer.parseInt(asegurado), Integer.parseInt(gradoDolencia), habitual));
            System.out.println(this.securityPacients.toString());
            return "TURNO ASIGNADO\nPACIENTE: " + asegurado;
        } else {
            return "El paciente no se encuentra\nasegurado.";
        }
    }
    private void normalizarLista(Queue<Secure> tmp){
    
        while (!tmp.isEmpty()) {
            this.securityPacients.add(tmp.poll());
        }
    }
    private boolean verificarPaciente(int secure) {
        
        Queue<Secure> tmp = new LinkedList();
        while (!this.securityPacients.isEmpty()) {
            Secure tmpo = this.securityPacients.poll();
            tmp.add(tmpo);
            if (secure == tmpo.getSecure()) {
                normalizarLista(tmp);
                return true;
            }
            
        }
        normalizarLista(tmp);
        return false;
    }

    public void crearTurno(String medicos, String pacientes) {
        String[] v = medicos.split("\n");
        Arrays.sort(v);
        for (int i = 0; i < v.length; i++) {
            this.medicos.add(new Medico(v[i]));
        }
        String[] v1 = pacientes.split("\n");
        for (int i = 0; i < v1.length; i++) {
            this.securityPacients.add(new Secure(Integer.parseInt(v1[i])));
        }
        
    }

    public String listarTurno() {
        if (this.medicos.size() == 0) {
            return "No Hay Medicos de Turno";
        } else {
            String output = "";
            for (int i = 0; i < this.medicos.size(); i++) {
                output += this.medicos.get(i).toString() + "\n";
            }
            return output;
        }
    }

    public String liberarMedico() {
        System.out.println(this.medicosOcupados.toString());
        if (this.medicosOcupados.size()>0) {
         
        Medico tmp = this.medicosOcupados.poll();
        tmp.setDisponible(true);
        return "Medico: "+tmp.getNombre()+" libre.";   
        }else{
            return "No Hay Medicos\nOcupados.";
        }
        
    }

    private String asignarMedico(Pacients p) {
        for (int i = 0; i < this.medicos.size(); i++) {
            if (this.medicos.get(i).disponible() || this.medicos.get(i).getTurnosDiarios()>0) {
                this.medicosOcupados.add(this.medicos.get(i));
                this.medicos.get(i).addAtendido(p);
                this.medicos.get(i).setDisponible(false);
                this.medicos.get(i).disminuirTurnosDiarios();
                return "MEDICO ASIGNADO";
            }
        }
        return "NO HAY MEDICOS DISPONIBLES";
            
    }

    public String atenderPaciente() {
        if(this.atencion.size()>0){
        Pacients leToca = this.atencion.poll();
        if (estaMedico(leToca)) {
            return "Medico Habitual Asignado";
        } else {
            asignarMedico(leToca);
            return "Medico Diferente al Habitual\nAsignado";
        }
        }else return "No Hay Pacientes\nCon Turno";
    }

    private boolean estaMedico(Pacients let) {
        for (int i = 0; i < this.medicos.size(); i++) {
            if (let.getMedicoHabitual().equals(this.medicos.get(i).getNombre())) {
                if(this.medicos.get(i).getTurnosDiarios()>0){
                    this.medicos.get(i).addAtendido(let);
                    this.medicos.get(i).setDisponible(false);
                    this.medicos.get(i).disminuirTurnosDiarios();
                    this.medicosOcupados.add(this.medicos.get(i));
                    return true;
                }else return false;
            }
        }
        return false;
    }
}
