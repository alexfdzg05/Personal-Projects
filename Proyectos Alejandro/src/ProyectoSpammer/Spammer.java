package ProyectoSpammer;

import java.util.Scanner;

public class Spammer {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de veces que quiere escribir su texto: ");
        int n = teclado.nextInt();
        teclado.nextLine();
        //Cuidado porque el next int unicamente lee los números, y no los saltos de línea, entonces cuando le
        //toca leer al siguiente nextLine lo unico con lo que se e encuentra es el salto de línea \n
        System.out.println();
        System.out.println("Introduzca su mensaje: ");

        String msg = teclado.nextLine();

        System.out.println("-----------------------------");
        for (int i = 0; i<n; i++){
            System.out.println(msg);
        }
        teclado.close();
    }
}
