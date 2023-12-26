package CalculadoraCSV;

public class ListOperations {
    private Operation[] operations;

    public ListOperations(int quantity){
        this.operations = new Operation[quantity];
    }

    public boolean full(){
        boolean property = true;
        int i = 0;
        while (i < operations.length && property){
            if(operations[i] == null){
                property = false;
            }
            i++;
        }
        return property;
    }
    public Operation insertOperation(int num1, int num2, char operator){
       Operation operation = null;
        if (!full()){
            int i = 0;
            while (i < operations.length && operations[i]!=null){
                i++;
            }
            operation = new Operation(num1,num2,operator);
            operations[i] = operation;
        }
        return operation;
    }

}
