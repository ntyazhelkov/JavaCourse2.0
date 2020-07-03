package task5;

import task5.operations.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число!");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число!");
            double num2 = scanner.nextDouble();
            System.out.println("Введите операцию!");
            String oType = scanner.next();
            //Вывод на консоль результат работы метода
            System.out.println(Operations.calc(num1, num2, oType));
        }catch (ArithmeticException e) {
            System.out.println("Деление на ноль недопустимо");
        }catch (IncorrectOperationTypeExeption e) {
            System.out.println("Введен неверный тип операции");
        }catch (InputMismatchException e){
            System.out.println("Невернный тип данных");
        }
    }
}
