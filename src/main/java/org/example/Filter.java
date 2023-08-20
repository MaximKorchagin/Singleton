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
            if (integer < treshold) logger.log("Элемент " + integer + " не проходит");
            else {
                logger.log("Элемент " + integer + " проходит");
                count++;
                result.add(integer);
            }
        }
        logger.log("Прошло фильтр " + count + " элементов из " + source.size());
        return result;
    }
}
