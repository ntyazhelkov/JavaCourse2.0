import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int numTask = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number of task: (1 - calculator, 2 - string array, 3 - finish tasks)");
            numTask = scanner.nextInt();
            if(numTask == 1){
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
                System.out.println();
            } else if (numTask == 2) {
                int arrSize;
                System.out.println("Enter array size:");
                //Задание размера массива
                arrSize = scanner.nextInt();
                String[] arr = new String[arrSize];
                System.out.println("Enter values of array: ");
                //Заполнение массива строковыми данными
                for(int i = 0; i < arr.length; i++) {
                    arr[i] = scanner.next();
                }
                String arrVal = arr[0];
                int valLen = arr[0].length();
                //Поиск самой длиной строки в массиев
                for(int i = 0; i < arr.length; i++) {
                    if (valLen < arr[i].length()) {
                        valLen = arr[i].length();
                        arrVal = arr[i];
                    }
                }
                System.out.println(arrVal + " has max length: " + valLen);
            }
        } while(numTask != 3);
    }
}
