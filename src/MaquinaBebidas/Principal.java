
package MaquinaBebidas;

import java.util.Scanner;

public class Principal extends Menu{
    /*
    static public void clearConsole() {
        System.out.print("\033[H\033[2J");
    }
    */
    public static void main(String[] args) {
        
        Scanner leer1 = new Scanner(System.in);
        Maquina oMaquina = new Maquina ();
        oMaquina.iniciar(20);
        int opcion = 1;
        System.out.println("-------------- Bienvenidos --------------");
        
        while(opcion<4 ){
        
            opcion = menuBucle();
        
            switch (opcion){
            
                case 1:
                    oMaquina.vender();
                     
                    break;
                case 2:
                    System.out.println("El stock Actual es: "+oMaquina.stockDisponible());
                    System.out.println("El dinero recaudado es: "+oMaquina.dineroRecaudado());
                    
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de bebidas que desea agregar al Stock");
                    int cant = leer1.nextInt();
                    oMaquina.aumentarStock(cant);
                    System.out.println("Stock aumentado \n"+
                                       "Bebidas Disponibles: "+oMaquina.stockDisponible());
                    
                    break; 
                case 4:
                    
                    break;
            }
           
        }
    } 
}
