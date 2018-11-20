import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNameTextProvider extends AbstractFileTextProvider{
    public FileNameTextProvider(File input) {
        super(input);
    }

    @Override
    public String getText() {
        String fileName = input.getName();
        String text = textToString(input);
        return fileName + ": " + text;
    }

}
