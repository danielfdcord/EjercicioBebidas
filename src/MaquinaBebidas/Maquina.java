
package MaquinaBebidas;

public class Maquina {
    
    public int cantVendidas=0;
    public int stockActual=10;
    public int precio=5;
    public int stockAumento=0;   
    
    
    public void iniciar(int stock){
        this.stockActual=stock;
    }
    
    public void vender(){
        System.out.println("Retire su bebida");
        this.stockActual--;
        this.cantVendidas++;
    }
    
    public int stockDisponible(){
        return this.stockActual;
    }
    
    public int dineroRecaudado(){
        return this.cantVendidas * this.precio;
    }
    
    public void aumentarStock(int mas){
        this.stockAumento=mas;
        this.stockActual=this.stockActual+this.stockAumento;
    } 
    
}
