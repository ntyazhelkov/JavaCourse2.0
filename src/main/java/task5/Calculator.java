package task5;

import task5.operations.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число!");
        double num2 = scanner.nextDouble();
        System.out.println("Введите операцию!");
        String oType = scanner.next();
        Operations operResult = new Operations();
        System.out.println(operResult.calc(num1, num2, oType));
    }
}
