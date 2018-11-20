import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileTextProvider extends AbstractFileTextProvider {

    public FileTextProvider(File input) {
        super(input);
    }

    @Override
    public String getText() {
        return textToString(input);
    }

}
