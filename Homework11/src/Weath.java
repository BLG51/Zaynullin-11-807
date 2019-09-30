import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Weath {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("src/in1.txt"));
        PrintWriter pw = new PrintWriter(new File("src/out.txt"));
        int a = 0, b = 0;
        while (sc1.hasNextLine()){
            String[] arr = sc1.nextLine().split(" ");
            a += Integer.parseInt(arr[1]);
            b += Integer.parseInt(arr[2]);
        }
        pw.print((double)a/7 + ", " + (double)b/7);
        //pw.flush();
        pw.close();
    }
}
