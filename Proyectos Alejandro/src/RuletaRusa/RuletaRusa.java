package RuletaRusa;

import java.util.Scanner;

public class RuletaRusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean vidas = true;
        int opcion;
        int balaJugador;
        int balaOrdenador;
        System.out.print("Selecciona el número de rondas: ");
        opcion = teclado.nextInt();
        while (opcion > 0 && vidas){
            System.out.print("Elige el hueco de la bala: ");
            balaJugador = teclado.nextInt();
            while (balaJugador < 1 || balaJugador > 6){
                System.out.println("Escoge un número entre 1 y 6:");
                balaJugador = teclado.nextInt();
            }
            balaOrdenador = (int) Math.floor(Math.random()* (7-1) + 1);
            //Yo lo que quiero es que se me genere un número aleatorio cada vez que se ejecuta el bucle
            switch (balaJugador){
                //Dejo el switch por si acaso quisiéramos implementar alguna clase con bala o hacer algún menú específico
                case 1:
                    System.out.println("Escogiste el hueco 1:");
                    System.out.println("La bala estaba en el hueco: "+balaOrdenador);
                     opcion--;
                    break;
                case 2:
                    System.out.println("Escogiste el hueco 2:");
                    System.out.println("La bala estaba en el hueco: "+balaOrdenador);
                    opcion--;
                    break;
                case 3:
                    System.out.println("Escogiste el hueco 3:");
                    System.out.println("La bala estaba en el hueco: "+balaOrdenador);
                    opcion--;
                    break;
                case 4:
                    System.out.println("Escogiste el hueco 4:");
                    System.out.println("La bala estaba en el hueco: "+balaOrdenador);
                    opcion--;
                    break;
                case 5:
                    System.out.println("Escogiste el hueco 5:");
                    System.out.println("La bala estaba en el hueco: "+balaOrdenador);
                    opcion--;
                    break;
                case 6:
                    System.out.println("Escogiste el hueco 6:");
                    System.out.println("La bala estaba en el hueco: "+balaOrdenador);
                    opcion--;
                    break;
            }
            if (balaJugador == balaOrdenador){
                vidas = false;
                System.out.println("Has muerto.");
            }else{
                System.out.println("Sobreviviste esta ronda!");
                System.out.println();
            }
        }
        if (opcion == 0 && vidas){
            System.out.println("Felicidades, has sobrevivido!");
        }
    }
}
