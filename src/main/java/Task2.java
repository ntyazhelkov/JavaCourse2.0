/**
 *Created by Nikita T. 30.05.2020
 * @author Nikita T.
 * Калькулятор дробных чисел
 * Возможные операци: сложение, вычитание, умножение, деление
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res = 0;
        System.out.println("Enter the first number: ");
        //Ввод первого числа
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        //Ввод второго числа
        double num2 = scanner.nextDouble();
        System.out.println("Operation type: ");
        //Ввод типа операции
        String oType = scanner.next();
        if(oType.equals("+")){
            res = num1 + num2;
        }
        else if(oType.equals("-")){
            res = num1 - num2;
        }
        else if(oType.equals("/")){
            res = num1/num2;
        }
        else if (oType.equals("*")) {
            res = num1*num2;
        }
        else System.out.println("Operation type is incorrect!");
        //Вывод результата
        System.out.print("Result: " );
        System.out.printf("%.4f", res);
    }
}
