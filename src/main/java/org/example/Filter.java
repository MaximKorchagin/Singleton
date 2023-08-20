package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int count = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : source) {
            if (integer < treshold) logger.log("������� " + integer + " �� ��������");
            else {
                logger.log("������� " + integer + " ��������");
                count++;
                result.add(integer);
            }
        }
        logger.log("������ ������ " + count + " ��������� �� " + source.size());
        return result;
    }
}
