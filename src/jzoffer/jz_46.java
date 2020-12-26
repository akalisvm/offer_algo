package jzoffer;

import java.util.ArrayList;

public class jz_46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0 || m <= 0) return -1;

        if(n == 1) return 0;

        ArrayList<Integer> children = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            children.add(i);
        }

        int index = 0;
        int counter = 0;
        while(children.size() != 1) {

            if(counter == m-1) {
                if(index == -1) index = 0;
                children.remove(index);
                if(index == children.size()) {
                    index = 0;
                }
                counter = 0;
                System.out.println(children);
                continue;
            }
            if(index == children.size()-1) {
                index = -1;
                continue;
            }
            counter++;
            index++;
        }
        return children.get(0);
    }

    public static void main(String[] args) {
        System.out.println(new jz_46().LastRemaining_Solution(5, 3));
    }
}
