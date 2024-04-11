/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena1 = Mensaje.obtenerMensaje();
        int habitantes = Informacion.obtenerHabitantes();
        String cadenaFinal = String.format("%s con %d", cadena1, habitantes);
            int n;
            System.out.println("Ingrese un numero del 1 al 5 si desea ver el \n"
                    + "mensaje original: ");
            n = sc.nextInt();
            if (n<1 && n>5){
                    String cadena1 = Mensaje.obtenerMensaje(); 
                    //hay que escribir la ruta completa del paquete
            System.out.printf(Mensaje.obtenerMensaje() + Informacion.obtenerHabitantes());
            }
            else {
            
            }
    }
    
}
