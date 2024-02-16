package CalculadoraCSV;

import java.util.Random;
import java.util.Scanner;

public class Operation {
    private final int firstNumber;
    private final int secondNumber;
    public final char operator;

    public Operation (int num1, int num2, char operator){
        this.firstNumber = num1;
        this.secondNumber = num2;
        this.operator = operator;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public String toString(){
        return firstNumber+" "+operator+" "+secondNumber+": ";
    }

    private static int RandomNumber(int maximo, Random rand){
        return rand.nextInt(maximo);
    }

    // I believe we should have 2 random objects as they should be different numbers 12 x 151 instead of 12 x 12
    public static Operation RandomOperation(){ //HERE puede haber errores
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        int number1 = RandomNumber(1000, rand1);
        int number2 = RandomNumber(1000, rand2);
        int option = rand3.nextInt(4) + 1;
        char operator = ' ';
        switch (option){
            case 1:
                operator = '*';
            case 2:
                operator = '/';
            case 3:
                operator = '+';
            case 4:
                operator = '-';
        }
        return new Operation(number1,number2,operator);
    }

    public static Operation createOperation(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Insert the first number: ");
        int number1 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println();
        System.out.print("Insert the operator: ");
        char operator = keyboard.nextLine().charAt(0);
        System.out.println();
        while (operator != '*' && operator != '+' && operator != '-' && operator != '/'){
            keyboard.nextLine();
            System.out.println("Invalid operation: ");
            System.out.print("Insert the operator: ");
            operator = keyboard.nextLine().charAt(0);
            System.out.println();
        }
        System.out.print("Insert the second number: ");
        int number2 = keyboard.nextInt();
        return new Operation(number1,number2,operator);
    }

    public static void readOperation(String file){

    }
    public static void writeOperation(String file){

    }
    public int solve(){
        int solution = 0;
        switch (operator){
            case '+':
                case '-':
                    //Our programm should detect the firstnumber - secondnumber as: - secondnumber (negative second number)
                    solution = (firstNumber + secondNumber);
                break;
            case  '/':
                if (secondNumber != 0) {
                    solution = (firstNumber / secondNumber);
                } else {
                    System.out.println("Invalid division: Divided by zero!");
                }
                break;
            case '*':
                solution = (firstNumber * secondNumber);
                break;
        }
        return solution;
    }
}
