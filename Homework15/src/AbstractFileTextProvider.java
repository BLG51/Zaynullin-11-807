import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AbstractFileTextProvider implements TextProvider {
    protected static final int MAX_SYMBOLS_NUM = 100;

    protected File input;

    public AbstractFileTextProvider(File input) {
        this.input = input;
    }

    @Override
    public abstract String getText();

    protected String textToString (File input) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = null;
        try {
            sc = new Scanner(input);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        String strToReturn;
        String text = getText();
        if (text.length() <= MAX_SYMBOLS_NUM) {
            strToReturn = text;
        } else {
            strToReturn = text.substring(0, MAX_SYMBOLS_NUM - 1);
        }
        return "SimpleTextProvider{" +
                "text='" + strToReturn + '\'' +
                '}';
    }
}
