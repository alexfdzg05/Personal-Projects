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
    public int solve(){
        int solution;
        switch (operator){
            case '+':
                case '-':
                    //Our programm should detect the firstnumber - secondnumber as: - secondnumber (negative second number)
                    solution = firstNumber + secondNumber;
                break;
            case  '/':
                if (secondNumber != 0) {
                    solution = firstNumber / secondNumber;
                } else {
                    solution = -1;
                }
                break;
            case '*':
            default:
                solution = firstNumber * secondNumber;
        }
        return solution;
    }
}
