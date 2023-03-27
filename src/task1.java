/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        System.out.println("Bubble sorted elements: " + bubble(array));
        System.out.println();

    }
    public static String bubble(int[] mas) {
        boolean isSorted = false;
        int buf;
        String file_name = "log.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,false);
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                        writer.write(Arrays.toString(mas));
                        writer.write("\n");
                    }

                }
            }
            writer.close();
        } catch (Exception e){
            System.out.println("Что то пошло не так");
        }
        return Arrays.toString(mas);
    }
}


