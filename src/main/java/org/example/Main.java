package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("��������� ���������");
        logger.log("������ ������������ ������ ������� ������ ��� ������");
        System.out.print("������� ������ ��� ������\n" +
                "������� ������ ������: ");
        int size = scanner.nextInt();
        System.out.print("������� ������� ������� ��� ��������: ");
        int maxValue = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> filtered;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        logger.log("������� � ��������� ������\n" +
                "��� ��������� ������: " + list);
        logger.log("������ ������������ ������ ������� ������ ��� ����������");
        System.out.print("������� ������� ������ ��� ����������: ");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        logger.log("��������� ����������");
        filtered = filter.filterOut(list);
        logger.log("������� ��������� �� �����\n" +
                "��������������� ������ " + filtered);
    }
}