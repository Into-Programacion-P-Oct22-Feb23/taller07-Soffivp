package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        String listaedades = "";
        double estatura = 0;
        double sumaEstatura = 0;
        int edad = 0;
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;

        // contador para saber el número de iteraciones
        int contadorIteraciones = 0;
        // variables para promedio
        double promedioEdad;
        //double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();

            // sumo la edad a sumaEdades
            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;

            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1; // primera(0+1=1)
            listaedades = listaedades + edad + "\n";
            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);

            entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        } while (bandera);
        cadenaReporte = String.format("%sListado de edades\n%s",
                cadenaReporte, listaedades);
        promedioEdad = (double) sumaEdades / contadorIteraciones;
        sumaEstatura = sumaEstatura / contadorIteraciones;

        // Promedio de edades:  
        cadenaReporte = String.format("%sPromedio de edades: %.1f\n",
                cadenaReporte, promedioEdad);
        // Promedio de estaturas:  
        cadenaReporte = String.format("%sPromedio de estaturas: %.2f\n",
                cadenaReporte, sumaEstatura);

        // presentación de cadena final
        System.out.printf("%s\n", cadenaReporte);

    }

}
