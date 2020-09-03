
package Control;

import java.util.LinkedList;
import Entidad.Contacto;

public class Directorio {
    private LinkedList<Contacto> contactos;
    public Directorio (){
        this.contactos  = new LinkedList();
    }
    public void addUser(String nombre, String telefono, String direccionPostal, String email){
        contactos.add(new Contacto(nombre, telefono, direccionPostal, email));
    }
    public String remove(String nombre){
        if(this.contactos.size()==0){
            return "No Existen Contactos los Cuales Remover";
        }
        
        removeUser(nombre);
        return "El Contacto "+nombre+" Removido Exitosamente.";
    }
    public void removeUser(String nombre){
        for (Contacto cont: this.contactos) {
            if(cont.getNombre().equals(nombre))
                contactos.remove(cont);
        }
    }
    public String toString(){
        if (this.contactos.size()>0) {
            
        String  contactos = "";
        for (Contacto contacto: this.contactos) {
            contactos+=contacto.getNombre()+"\n";
        }
        return contactos;
    }else return "No hay contactos en la lista";
        }
    public String buscar(String nombre){
        if (this.contactos.isEmpty()) {
            return "No hay contactos en el directorio.";
        }
        for(Contacto cont : this.contactos){
            if(nombre.equals(cont.getNombre())){
                return cont.toString();
            }
        }
        return "No Encontrado";
    }
}
