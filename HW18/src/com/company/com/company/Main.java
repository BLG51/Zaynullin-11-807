package com.company.com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GenericLinkedList<Integer>  list1 = new GenericLinkedList<>();
        GenericLinkedList<Integer> list2 = new GenericLinkedList<>();
        list1.add(5); list1.add(6); list1.add(7);

        System.out.println(Arrays.toString(list1.toArray()));
        list2.add(8); list2.add(9);
        System.out.println(Arrays.toString(list2.toArray()));
        list1.addFromIndex(list2,2);
        System.out.println(Arrays.toString(list1.toArray()));

        /*
        System.out.println("bregex testing here");
        String text = "hello there [id5161|general kenobi] [id5161|professor]  fishing is [] three [sdw|hey] hundred ] b |] u [| cks";

        Matcher matcher = Pattern.compile("\\[id[0-9]*\\|[^\\]]*]").matcher(text);
        while (matcher.find()){
            String res = matcher.group();
            String rep=res.substring(res.indexOf("|") +1 ,res.length()-1);
            text = text.replace(res, rep);
        }

        System.out.println(text);
        */

        System.out.println("btime check");
        while (true) {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(1000);
        }
    }
}
