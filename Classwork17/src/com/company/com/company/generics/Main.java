package com.company.com.company.generics;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer>  list1 = new MyArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list1.add(5); list1.add(6); list1.add(7);

        System.out.println(Arrays.toString(list1.toArray()));
        list2.add(8); list2.add(9);
        System.out.println(Arrays.toString(list2.toArray()));
        list1.addAll(list2,1);
        System.out.println(Arrays.toString(list1.toArray()));
    }
}
