import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortAlf {
    public static void main(String[] args) throws FileNotFoundException {
        int len = length();
        for (int i = 0; i <= len; i++) {
            sort(i);
            merge();
        }
        for (int i = 0; i < 26; i++) {  //char i = 'a' can be used for ina.txt    ("a", "asd", "Asdsad") = String ... arr;
            File f = new File(  "in" + i + ".txt");
            if (f.exists()) f.delete();
        }
    }

    static void merge() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("in.txt"));
        Scanner[] scanners = new Scanner[26];
        for (int i = 0; i < 26; i++) {
            //int + letter + .txt; (char) letter = i + 'a'
            scanners[i] = new Scanner(new File("in" + i + ".txt"));
        }
        for (int i = 0; i < 26; i++) {
            while (scanners[i].hasNext()) {
                pw.println(scanners[i].next());
            }
        }
        for (Scanner sc : scanners) {
            sc.close();
        }
        pw.close();
    }

    static void sort(int k) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter[] pws = new PrintWriter[26];
        for (int i = 0; i < 26; i++) {
            pws[i] = new PrintWriter(new File("in" + i + ".txt"));
        }
        while (sc.hasNext()) {
            String n = sc.next();
            int c = n.length()-k-1;
            /*int c = n.length()-1;
            for (int i = 0; i < k; i++) {
                c--;
            } */
            if (c < 0) c = 0;
            int m = n.charAt(c) - 97;  //charAt(c)-'a'
            pws[m].println(n);
        }
        for (int i = 0; i < 26; i++) {
            pws[i].close();
        }
        //int digitsNum = (int) Math.log10(n) + 1;

    }

    static int length() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("in.txt"));
        int max = 0;
        while (sc.hasNext()) {
            String x = sc.next();
            int digitsNum = x.length();
            if (digitsNum > max) {
                max = digitsNum;
            }
        }
        return max;
    }
}

