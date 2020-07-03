import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        String s;
        List<String> list = new ArrayList<String>();
        //Вычитываем строки из файла, разбиваем слова, отдельенные пробелами и записываем в массив
        //Записываем массив в список
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                String str[] = s.split(" ");
                for (String s1 : str) {
                    list.add(s1);
                }
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        //Выводит список на консоль
        for (String s2 : list) {
            System.out.println(s2);
        }
        //Сортируем список по алфавитному порядку и выводим на консоль
        System.out.println("Вывод в алфавитном порядке:");
        Collections.sort(list);
        for (String s2 : list) {
            System.out.println(s2);
        }
        //Для подчета повторений слов используем HashMap
        System.out.println("Статистика повторения слов:");
        HashMap<String, Integer> mapStr = new HashMap<String, Integer>();
        Integer count;
        for (String word : list) {
            count = mapStr.get(word);
            if (count == null)
                mapStr.put(word, 1);
            else mapStr.put(word, count + 1);
        }
        //Ищем, какое слово повторяется максимально число раз
        int max = 0;
        String maxWord = null;
        for (Map.Entry<String, Integer> pair : mapStr.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
            if (pair.getValue() > max) {
                max = pair.getValue();
                maxWord = pair.getKey();
            }
        }
        System.out.println("Максимальное количество раз повторялось слово:");
        System.out.println(maxWord + " " + mapStr.get(maxWord));
    }
}