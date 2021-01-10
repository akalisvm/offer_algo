package jzoffer;

import java.util.ArrayList;
import java.util.Collections;

public class jz_63 {
    private ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        Collections.sort(list);
        if(list.size() % 2 == 1) {
            return (double) list.get(list.size() / 2);
        } else {
            int sum = list.get(list.size() / 2 - 1) + list.get(list.size() / 2);
            return (double) sum / 2;
        }
    }
}
