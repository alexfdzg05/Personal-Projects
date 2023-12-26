package FibonacciSucession;

import java.util.Scanner;

public class SucesionFibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numero1 = 1;
        long numero2 = 1;
        System.out.print("Introduzca la aproximación: ");
        long a = teclado.nextLong();
        for(int i = 0; i<a;i++){
            numero1 = numero1 + numero2;
            numero2 = numero1 + numero2;
        }
        System.out.println("Su primer número es: "+numero1);
        System.out.println("Su segundo número es: "+numero2);
        double aureo = (double) numero2/numero1;
        System.out.println("El valor aproximado del número aureo es: "+aureo);
        double errorAbsoluto = ((1+(Math.sqrt(5)))/2) - aureo;
        System.out.println("El error del valor actual es de: "+errorAbsoluto);
        double errorR = (errorAbsoluto/((1+(Math.sqrt(5)))/2)) * 100;
        System.out.printf("El error relativo será del: %.2f", errorR);
        System.out.println(' '+"%");
    }
}
