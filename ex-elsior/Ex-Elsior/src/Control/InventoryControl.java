
package Control;
import Entity.Product;
import java.util.TreeSet;

public class InventoryControl {
    TreeSet <Product> products = new TreeSet();
   
    public int getItemsCantity(){
        return products.size();
    }
    public void chargeItem(String name, String cantity, String minimalCantity, String priceBase, String tipo){
        products.add(new Product(name, tipo, Integer.parseInt(cantity), Integer.parseInt(minimalCantity), Integer.parseInt(priceBase), 0, 0));
    }
    public String lastSelled(){
        String output="------ORDENADOS POR VENDIDOS------\n";
        TreeSet <Product> tmpProducts = new TreeSet();
            for (Product p : this.products) {
                tmpProducts.add(new Product(p.getName(), p.getType().toString(), p.getCantity(), p.getRange(), p.getCost(), p.getSelled(), 1));
            }
        return tmpProducts.last().toString()+"\n  Vendidos: "+tmpProducts.last().getSelled();
    }
    public String firstSelled(){
        String output="------ORDENADOS POR VENDIDOS------\n";
        TreeSet <Product> tmpProducts = new TreeSet();
            for (Product p : this.products) {
                tmpProducts.add(new Product(p.getName(), p.getType().toString(), p.getCantity(), p.getRange(), p.getCost(), p.getSelled(), 1));
            }
        return tmpProducts.first().toString()+"\n  Vendidos: "+tmpProducts.first().getSelled();
    }
    
    public String selled(){
        String output="------TOTAL DE VENDIDOS------\n";
        int count =0;
        for(Product p : products){
            output+= "Producto: "+p.getName()+"\n Ventas: "+(p.getSelled()*p.getCost())+"\n Cantidad De Ventas: "+p.getSelled()+"\n";
            count+=p.getSelled()*p.getCost();
        }
        
        return output+"\nTOTAL DE VENTAS: "+count;
    }
    public String selledProm(){
        String output="------PROMEDIO DE VENTAS------\n";
        int count =0;
        int prom = 0;
        for(Product p : products){
            output+= "Producto: "+p.getName()+"\n Ventas: "+(p.getSelled()*p.getCost())+"\n Cantidad De Ventas: "+p.getSelled()+"\n";
            count+=p.getSelled()*p.getCost();
            prom+=p.getSelled();
        }
        
        return output+"\nPROMEDIO DE VENTAS: "+(count/prom);
    }
    public String getProductsList(){
        String output="-----PRODUCTOS-----\n";
        int count = 1;
        for(Product p : products){
            output+= "\n"+count+". "+p.toString()+"\n";
            count++;
        }
        
        return output;
    }
    public boolean venderProducto(String name, String cantity){
        int cant = Integer.parseInt(cantity);
        for(Product p : this.products){
            if(p.getName().equals(name)){
                if((p.getCantity()-cant)>=p.getRange()){
                    System.out.println((p.getCantity()-cant)>p.getRange());
                    p.setSelled(cant);
                    return true;
                }else return false;
            }
        }
        return false;
    }
    public boolean realizarPedido(String name, String cantity){
        int cant = Integer.parseInt(cantity);
        for (Product p: this.products) {
            if (p.getName().equals(name)) {
                if(cant>p.getRange()){
                    p.setCantity(cant);
                    return true;
                }else return false;
                
            }
        }
        return false;
    }
}
