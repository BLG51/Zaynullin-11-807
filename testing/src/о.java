import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class о {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = a;
        System.out.println(Arrays.toString(b));
        a[1] = 1;
        System.out.println(b[1]);
        boolean[] c = new boolean[3];
        System.out.println(c[0]);
        char[] d = new char[3];
        System.out.println(d[0]+ "hey" +d[1] + "ho");
        char r = 'a';
        int h = r;
        System.out.println((char)(r+2) + "  " + h);
//[id5161|обращение] -> обращение,
        //Matcher matcher = Pattern.compile("\\[id[0-9]*\\|[^\\]]*]").matcher("id5161|обращение] asdas  [id5161|обращение]]ad  [id5161|обращение]");
        Matcher matcher = Pattern.compile("[a-z]*").matcher("12a");
        while (matcher.find()){
            System.out.println(matcher.group() + " 1");
        }
        a2 a2 = new a2();
        a1[] arr = new a1[5];
        arr[1] = a2;
        try{
        throw new Exception("kek");
        } catch (Exception e) {e.printStackTrace();}
        System.out.println("wow");
        System.out.println("how");
        System.out.println(f());
        nn n = new nnn();
        String aaa = "sd"; String bbb = "ds";
        b(aaa,bbb);
        System.out.println(aaa);
    }

    static void b(String a, String b){a = b;}

    public static boolean f() {
        try{
            System.out.println("sosat"
            );return false;} finally {
            System.out.println("animeee"); return true;}
    }




     void n() {
        return;
    }
}
