package com.company.com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GenericLinkedList<Integer>  list1 = new GenericLinkedList<>();
        GenericLinkedList<Integer> list2 = new GenericLinkedList<>();
        list1.add(5); list1.add(6); list1.add(7);

        System.out.println(Arrays.toString(list1.toArray()));
        list2.add(8); list2.add(9);
        System.out.println(Arrays.toString(list2.toArray()));
        list1.addFromIndex(list2,2);
        System.out.println(Arrays.toString(list1.toArray()));
    }
}
