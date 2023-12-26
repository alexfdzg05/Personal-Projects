package JuegoCamion;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String marca = "";
        String modelo = "";
        String matricula = "";
        String opcion = "";
        int combustibleMaximo = 0;
        int combustibleActual = 0;
        boolean salir = false;

        System.out.println("Bienvenido a Drive Simulator!");
        System.out.println("-----------------------------");
        System.out.println("Introduzca los datos para el juego: ");
        System.out.print("Nombre del conductor: ");
        String nombre = teclado.nextLine();
        while(!salir) {
            System.out.println("Quieres jugar en default o en personalizado?");
            opcion = teclado.nextLine();
            if (opcion.toUpperCase().equals("DEFAULT")) {
                marca = "Iveco";
                modelo = "S-way";
                matricula = "XJA 19K0";
                combustibleMaximo = 1000;
                combustibleActual = 1000;
                salir = true;
            } else if (opcion.toUpperCase().equals("PERSONALIZADO")) {
                System.out.println("Marca del camión: ");
                marca = teclado.nextLine();
                System.out.println("Modelo del camión: ");
                modelo = teclado.nextLine();
                System.out.println("Matricula del camión: ");
                matricula = teclado.nextLine();
                System.out.println("Combustible máximo: ");
                combustibleMaximo = teclado.nextInt();
                System.out.println("Combustible actual: ");
                combustibleActual = teclado.nextInt();
                salir = true;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Bienvenido "+nombre+",gracias por usar el calculador de rutas de tu empresa");
        System.out.println("Nos vemos en la necesidad por preguntarte qué tan largo es el recorrido");
        System.out.println("Introduzca la cantidad en km entre origen y destino: ");
        int distancia = teclado.nextInt();
        System.out.println("Introduzca la velocidad a la que quiere circular:");
        int velocidad = teclado.nextInt();
        Camion camion = new Camion(modelo, marca, nombre, matricula,combustibleMaximo, combustibleActual, distancia, velocidad);
        System.out.println("Buen viaje!");
        System.out.println("-----------------------------");
        System.out.println(camion.toString());
        //A àrtir de aquí quedaría implementar el switch con las diferentes acciones que puedas tomar duarnte tu trayecto
    }
}
