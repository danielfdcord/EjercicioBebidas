
package MaquinaBebidas;

import java.util.Scanner;


public class Menu {
    static public int menuBucle(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingrese una Opcion: ");
        System.out.println("1) Comprar");
        System.out.println("2) Administrar");
        System.out.println("3) Mantenimiento");
        System.out.println("4) Salir");
        
        int opcion = leer.nextInt();
        return opcion;
    }
}
