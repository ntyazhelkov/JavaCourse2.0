package task5;

import task5.operations.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число!");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число!");
        double num2 = scanner.nextDouble();
        System.out.println("Введите операцию!");
        String oType = scanner.next();
        Oper res = null;

        if(oType.equals("+")){
            res = new Plus();
        }
        else if(oType.equals("-")){
            res = new Minus();
        }
        else if(oType.equals("/")){
            res = new Division();
        }
        else if (oType.equals("*")) {
            res = new Multiplication();
        }
        else System.out.println("Operation type is incorrect!");
        res.operResult(num1,num2);
    }
}
