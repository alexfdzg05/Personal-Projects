package CalculadoraCSV;

import java.util.Random;

public class Operation {
    private final int firstNumber;
    private final int secondNumber;
    public final char operator;

    public Operation (int num1, int num2, char operator){
        this.firstNumber = num1;
        this.secondNumber = num2;
        this.operator = operator;
    }
    public static int RandomNumber(int maximo, Random rand){
        return rand.nextInt(maximo);
    }
    public static void readOperation(String file){

    }
    public static void writeOperation(String file){

    }
}
