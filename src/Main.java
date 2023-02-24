import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean program_loop = true;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        new CalculatorView();

//        while (program_loop){
//
//            System.out.println("First number: ");
//            float num1 = Float.parseFloat(sc.nextLine());
//            System.out.println("Second number: ");
//            float num2 = Float.parseFloat(sc.nextLine());
//
//            System.out.println("What operation?(+,-,*,/) ");
//            String operation = sc.nextLine();
//
//            float answer = 0;
//            boolean operation_status = false;
//
//            switch (operation) {
//                case "+" -> {
//                    answer = calculator.Add(num1, num2);
//                    calculator.AddRecord(num1,num2);
//                    operation_status = true;
//                }
//                case "-" -> {
//                    answer = calculator.Subtraction(num1, num2);
//                    calculator.AddRecord(num1,num2);
//                    operation_status = true;
//                }
//                case "*" -> {
//                    answer = calculator.Multiplication(num1, num2);
//                    calculator.AddRecord(num1,num2);
//                    operation_status = true;
//                }
//                case "/" -> {
//                    answer = calculator.Division(num1, num2);
//                    calculator.AddRecord(num1,num2);
//                    operation_status = true;
//                }
//                default -> System.out.println("This is an invalid operation. Try again");
//            }
//
//            if (operation_status) {
//                calculator.AddRecord(answer);
//                System.out.printf("Result: %.2f\n", answer);
//                System.out.println(calculator.records);
//            }
//
//            System.out.println("Do you want to perform another operation?(y/n) ");
//            String status_input = sc.nextLine();
//            if (Objects.equals(status_input, "n")){
//                program_loop = false;
//            }
//
//        }
    }
}