package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите данные для списка\n" +
                "Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> filtered;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        logger.log("Создаем и наполняем список\n" +
                "Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите входные данные для фильтрации: ");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        logger.log("Запускаем фильтрацию");
        filtered = filter.filterOut(list);
        logger.log("Выводим результат на экран\n" +
                "Отфильтрованный список " + filtered);
    }
}