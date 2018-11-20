import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNameTextProvider extends FileTextProvider {
    private File input;

    public FileNameTextProvider(File input) {
        super(input);
        this.input = input;
    }

    @Override
    public String getText() {
        String filename = input.getName();
        String text = super.getText();
        return filename = ": " + text;
    }

}
