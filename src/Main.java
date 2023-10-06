import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Unesite drugi broj: ");
        double operand2 = scanner.nextDouble();

        System.out.println("Unesite operator: ");
        String operator = scanner.next();

        switch (operator){
            case "+": {
                System.out.println("Zbir je: " + (operand1 + operand2));
            }break;
            case "-": {
                System.out.println("Razlika je: " + (operand1 - operand2));
            }break;
            case "*": {
                System.out.println("Kolicnik je: " + (operand1 * operand2));
            }break;
            case "/": {
                System.out.println("Deljenik je " + (operand1 / operand2));
            }break;
        }
    }
}
