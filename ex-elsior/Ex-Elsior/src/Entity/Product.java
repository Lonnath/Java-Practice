package Entity;

import java.util.Arrays;

public class Product implements Comparable<Product> {

    private String name;
    private Type type;
    private int cantity;
    private int range;
    private double cost;
    private int selled;
    private int order;

    public void setCantity(int cantity) {
        this.cantity = cantity;
    }

    public Product(String name, String type, int cantity, int range, double cost, int selled, int order) {
        double iva = 0;
        this.name = name;
        if (type.equals("PAPELERIA")) {
            this.type = Type.PAPELERIA;
            iva = cost * 0.16;
        }
        if (type.equals("DROGUERIA")) {
            this.type = Type.DROGUERIA;
            iva = cost * 0.12;
        }
        if (type.equals("SUPERMERCADO")) {
            this.type = Type.SUPERMERCADO;
            iva = cost * 0.04;
        }
        this.cost = cost + iva;
        this.cantity = cantity;
        this.range = range;
        this.selled = selled;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getCantity() {
        return cantity;
    }

    public int getRange() {
        return range;
    }

    public double getCost() {
        return cost;
    }

    public int getSelled() {
        return selled;
    }

    public void setSelled(int cantity) {
        this.selled += cantity;
        this.cantity -= cantity;
    }

    @Override
    public String toString() {
        return "Nombre Producto: " + this.name + "\n  Tipo: " + this.type + "\n  Cantidad: " + this.cantity + "\n  Rango Minimo: " + this.range + "\n  Precio: " + this.cost;
    }

    @Override
    public int compareTo(Product t) {
        if (this.order == 0) {
            String[] v = new String[2];

            v[0] = this.name;
            v[1] = t.getName();
            Arrays.sort(v);
            if (v[0].equals(this.name)) {
                return -1;
            } else {
                return 1;
            }
        } else {
            if (this.selled > t.getSelled()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
