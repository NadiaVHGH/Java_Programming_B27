package day10_Statements;

public class SimpleCalculatot {
    public static void main(String[] args) {
        double numOne = 5;
        double numTwo = 24;
        char operator = '+';
        double result = 0;

        if (operator == '+') {
            result = numOne + numTwo;
        } else if (operator == '-') {
            result = numOne - numTwo;
        } else if(operator == '*' || operator == 'x'){
            result = numOne * numTwo;
        } else if(operator == '/'){
            result = numOne / numTwo;
        } else if (operator == '%') {
            result = numOne % numTwo;
        } else {
            System.out.println("Invalid operator");
        }

        System.out.println("" + numOne + operator + numTwo + " = " + result);
        System.out.println(numOne + " " + operator + " " + numTwo + " = " + result); // another option to display the out

    }
}
