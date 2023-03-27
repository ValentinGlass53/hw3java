

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //указываем путь
        String separator = File.separator;
        String path = "src" + separator + "file.txt";

        //объявляю StringBuilder
        StringBuilder sb = new StringBuilder();

        //объявляю Scanner
        try (Scanner scan = new Scanner(new File(path))) {
            //заполняю массив строками
            while (scan.hasNextLine()) {
                sb.append(scan.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File [%s] is not found.\n", path);
        }

        String[] array = sb.toString().split("\n");

        StringBuilder str = new StringBuilder();

        for (String i : array) {
            String[] el = i.toString().split(",");
            for (String j : el) {
                String[] words = j.toString().split(":");
                str.append(words[1]).append("\n");
            }
        }

        String[] list = str.toString().split("\n");

        for (int i = 0; i < list.length; i+=3) {
            System.out.println("Студент " + list[i].replace("\"", "") + " получил " + list[i + 1].replace("\"", "") + " по предмету " + list[i + 2].replace("\"", "") + ".");
        }

    }
}