package com.qgx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        Collections.sort(list, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
