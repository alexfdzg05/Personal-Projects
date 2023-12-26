package CalculadoraCSV;

import java.util.Scanner;

public class Utilities {
    //NOTA de aprendizaje: Colocamos el objeto teclado Scanner dentro de los parámetros de los métodos
    // de leer para que el programa no cree objetos tipo Scanner innecesarios ---> Queremos que se cree un único objeto
    // Scanner que se creará en el main
    public static int leerNumero(Scanner teclado, int minimo, int maximo, String mensaje){
        System.out.print(mensaje);
        int numero = teclado.nextInt();
        while (numero > maximo || numero < minimo){
            System.out.println("Invalid number according with parameters");
            System.out.print(mensaje);
            numero = teclado.nextInt();
        }
        return numero;
    }
    public static char leerEleccion(Scanner teclado, char a, char b, String mensaje){
        System.out.println(mensaje);
        System.out.print("-->");
        char option = teclado.next().charAt(0);
        while (option != a && option != b){
            System.out.println("Error: choose option "+a+" / "+b);
            System.out.println(mensaje);
            System.out.print("-->");
            option = teclado.next().charAt(0);
        }
        return option;
    }
}
