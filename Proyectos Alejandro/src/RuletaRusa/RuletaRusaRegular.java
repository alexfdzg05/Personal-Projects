package RuletaRusa;

import java.util.Scanner;

public class RuletaRusaRegular {
    //aquí empieza el código
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Choose difficulty(1-5):");
        int i=0;
        int n=0;
        for (int difficulty = teclado.nextInt(); i<difficulty; i++ ) {
            System.out.print("Dame un número del 1 al 6: ");
            int numeroBala = (int) Math.floor(Math.random() * 6);
            //no puede ir fuera del for porque entonces podrías reutilizar el mismo número para salvarte
            int numero = teclado.nextInt();
            if (numeroBala == numero) {
                System.out.println("BANG: END GAME");
                break;
                //Ya se que no debería utilizar el break, pero es que es la unica manera que se me ocurre (*lágrimas*)
            } else {
                System.out.println("Little brat, u have been saved by god, be thankfull");
                n = n + 1;
                if(difficulty != n){
                    System.out.println("NEXT ROUND");

                }else{
                    System.out.println("GOOD GAME");
                }
            }
        }
        System.out.println("Thanks for playing.");
        //Aquí acaba
    }
}