
package Visual;
import java.util.Scanner;
import MaquinaBebidas.*;
import static Visual.ContratoMenu.contrato;




public class IngresoTeclado extends MenuPrincipal{
    
    static public void clearConsole() {
        System.out.print("\033[H\033[2J");
    }
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
                
        menuPrin();
        int opcion = leer.nextInt();
        clearConsole();
        
        contrato(opcion);
        
     
    }
}
