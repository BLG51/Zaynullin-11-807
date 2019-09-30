import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("in1.txt"));
        Scanner sc2 = new Scanner(new File("in2.txt"));
        PrintWriter pw = new PrintWriter(new File("out.txt"));
        while (sc1.hasNextInt() && sc2.hasNextInt()) {
            int a = sc1.nextInt();
            int b = sc2.nextInt();
            pw.println(a+b);
        }
        while (sc1.hasNextInt()){
            pw.println(sc1.nextInt());
        }
        while (sc2.hasNextInt()){
            pw.println(sc2.nextInt());
        }
        //pw.flush();
        pw.close();
    }
}
