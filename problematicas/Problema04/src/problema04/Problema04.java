/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author sofiv
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1;
        int contador = 3;
        String mensaje = "1";

        while (contador < 16) {
            if (contador == 3 || contador == 7 || contador == 11 || contador == 15) {
                mensaje = mensaje + " - " + numero + "/" + contador + " ";
            } else {
                mensaje = mensaje + " + " + numero + "/" + contador + " ";
            }
            contador = contador + 2;
        }
        System.out.println(mensaje);
    }

}
