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
public class Secure implements Comparable<Secure> {

    private int secure; 
    
    public Secure(int secure) {
        this.secure = secure;
        
    }
    public int getSecure() {
        return this.secure;
    }

    public void setSecure(int asecure) {
        this.secure = asecure;
    }

    @Override
    public int compareTo(Secure t) {
        if (t.getSecure() < this.getSecure()) {
            return 1;
        } else {
            return -1;
        }

    }

}
