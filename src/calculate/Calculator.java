package calculate;

//Calculator class
public class Calculator {
    int a, b;
    char symbol;

    //addition method
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    //subtraction method
    public void subtraction(int a, int b) {
        System.out.println("subtraction  of " + a + " and " + b + " is: " + (a - b));
    }

    //division method
    public void division(int a, int b) {
        System.out.println("division of " + a + " and " + b + " is: " + (a / b));
    }

    //multiplication method
    public void multiplication(int a, int b) {
        System.out.println("multiplication of " + a + " and " + b + " is: " + (a * b));
    }

    //CalculateResult
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else {
            System.out.println("Entered symbol is Invalid,Please enter other");
        }
    }
}
