package CalculadoraCSV;

import java.util.Scanner;
//Se trata de un programa que sea capaz de resolver operaciones a través d eun fichero (parecido al CSV)
// Resolver alguna operación directamente desde el teclado
// Lanzar operaciones y realizar un contador del último número de aciertos

public class Calculator {
    public static void main(String[] args) {
        int option;
        Scanner teclado = new Scanner(System.in);
        do {
            option = menu(teclado);
            switch (option){
                case 1:
                    // Solve operation
                    Operation operation = Operation.createOperation();
                    System.out.println("The result is: "+operation.solve());
                    break;
                case 2:
                    // Solve homework

                    break;
                case 3:
                    // Generate homework
                    int option2 = Utilities.leerEleccion(teclado, '1', '2', "1. Generate random operations" +
                            "\n2. Generate specific random operations");
                    if (option2 == '1'){

                    } else {

                    }
                    break;
                case 4:
                    //Strikes
                    boolean finished = false;
                    System.out.println("Good luck!");
                    int solution;
                    int strike = 0;
                    while (!finished){
                        Operation operation1 = Operation.RandomOperation();
                        System.out.print(operation1.toString());
                        solution = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println();
                        if (operation1.solve() != solution){
                            finished = true;
                        }else{
                            strike++;
                        }
                    }
                    System.out.println("You made it with a "+strike+" strike");
                    System.out.println("Congrats!");
                    break;
                case 0:
                    System.out.println("GOOD BYE");
                    break;
            }

        }while (option != 0);
    }
    public static int menu(Scanner teclado){
        int opcion;
        int minimo = 0;
        int maximo = 4;
        System.out.println("1. Solve an operation\n2. Solve homework\n3. Generate Homework\n4. Strikes\n0. Exit");
        System.out.println("---------------------------");
        opcion = Utilities.leerNumero(teclado, minimo, maximo, "Choose an option ("+minimo+" - "+maximo+") :");
        return opcion;
    }

}
