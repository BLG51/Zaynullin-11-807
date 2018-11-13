import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CosineTextAnalyzer implements TextAnalyzer {
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> bag = tokenizeUnique(te1.getText() + te2.getText());
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te2.getText());
        return cosineSimilarity(list1, list2, bag);
    }

    /**
     * Returns a list of unique words found in an input text.
     * Words in the text can be delimited by one space or a space with a comma
     */
    private List<String> tokenizeUnique(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word))
                uniqueWords.add(word);
        }
        return uniqueWords;
    }

    private List<String> tokenize (String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> listWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
                listWords.add(word);
        }
        return listWords;
    }

    private double cosineSimilarity(List<String> l1, List<String> l2, List<String> bag) {
        double[] c1 = new double[bag.size()];
        double[] c2 = new double[bag.size()];
        for (String word : l1) {
            if (bag.contains(word)) {
                c1[bag.indexOf(word)]++;
            }
        }
        for (String word : l2) {
            if (bag.contains(word)) {
                c2[bag.indexOf(word)]++;
            }
        }
        double norm1 = 0; double norm2 = 0;
        for(double i: c1) {
            norm1 += i*i;
        }
        for (double i: c2) {
            norm2 += i*i;
        }
        norm1 = Math.sqrt(norm1); norm2 = Math.sqrt(norm2);
        double similatiry = 0;
        for (int i = 0; i < c1.length; i++) {
            c1[i] = c1[i]/norm1;
            c2[i] = c2[i]/norm2;
            similatiry += c1[i] * c2[i];
        }

        return similatiry;
    }
}