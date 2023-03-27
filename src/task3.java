// 3) Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите строку: ");
        String str = scanner.nextLine(); //читаем строку

        char[] array = str.toCharArray();
        // System.out.println(Arrays.toString(array));

        int count = 0;
        boolean Boolean = true;

        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] == array[array.length - 1 - i])
                count++;
        }

        if(count == array.length / 2) {
            System.out.println(Boolean);
        } else {
            System.out.println(!Boolean);
        }
    }
}