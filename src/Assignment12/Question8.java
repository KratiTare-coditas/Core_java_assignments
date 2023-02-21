package Assignment12;

 import java.util.ArrayList;
 import java.util.StringTokenizer;

class OperatorandOperands{
    void display(){
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();
        StringTokenizer str = new StringTokenizer("3+20%2*20/2","[+%-/*]",true);
        int i=0;
        while(str.hasMoreTokens()){
            if(i%2==0){
                operands.add(str.nextToken());
            }
            else{
                operators.add(str.nextToken());
            }
            i++;
        }
        System.out.println("Operators are:"+operators);
        System.out.println("Operands are:"+operands);
    }
}
public class Question8 {
    public static void main(String args[]){
        OperatorandOperands operatorandOperands = new OperatorandOperands();
        operatorandOperands.display();

    }
}

//Output:Operators are:[+, %, *, /]
//Operands are:[3, 20, 2, 20, 2]