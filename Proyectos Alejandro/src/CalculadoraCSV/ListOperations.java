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
    public boolean insertOperation(int num1, int num2, char operator){
        boolean done = false;
       Operation operation = null;
        if (!full()){
            int i = 0;
            while (i < operations.length && operations[i]!=null){
                i++;
            }
            operation = new Operation(num1,num2,operator);
            operations[i] = operation;
            done = true;
        }
        return done;
    }

    public void removeOperation(int position){
        if (position > 0 && position < operations.length) {
            for (int i = position - 1; i < operations.length - 1; i++) {
                operations[i] = operations[i + 1];
            }
            operations[operations.length - 1] = null;
        } else  {
            System.out.println("Invalid position");
        }
    }
    public void removeOperations(int min, int max){
        if (min > 0 && max < operations.length) {
            for (int i = min; i < max; i++){
                operations[i] = null;
            }
        }else {
            System.out.println("Invalid range");
        }
    }
    public void solve(){
        for (int i = 0; i < operations.length; i++){
            if (operations[i]!= null){
                System.out.println(operations[i].solve());
            }
        }
        System.out.println("----Terminado----");
    }
}
