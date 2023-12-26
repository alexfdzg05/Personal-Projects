package Inducción;

import java.util.Scanner;

public class NumeroMaximoBinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca n:");
        int n = teclado.nextInt();
        long resultado = 0;
        for (int i = 0;i<n;i++){
            resultado += Elevado(i);
        }
        System.out.println();
        System.out.print("El número máximo en decimal con "+n+" casillas en binario es: ");
        for (int j = 0; j<n; j++){
            System.out.print("_ ");
        }
        System.out.println();
        System.out.println("Resultado via función:"+resultado);
        //Solución que cuesta más recursos de procesado
        long operacion = Elevado(n) - 1;
        System.out.println("Resultado vía inducción: "+operacion);
        //Solución que cuesta menos recursos de procesado
        System.out.println("Introduzca un número: ");
        int numero = teclado.nextInt();
        int k = 0;
        while (numero >= Elevado(k)){
            k++;
        }
        System.out.println("El número "+numero+" puede representarse con "+ (k)+" casillas");

    }
    public static int Elevado(int numero){
        int resultado = 1;
        if (numero == 0){
            resultado *= 1;
        } else {
            resultado = 2 * Elevado(numero-1);
        }
        return resultado;
    }
}
