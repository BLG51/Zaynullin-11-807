import java.util.List;

public class SearchEngineImpl implements SearchEngine {
    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        //TextAnalyzer analyzer = new JaccardTextAnalyzer();
        TextAnalyzer analyzer = new CosineTextAnalyzer();

        for (int i = 0; i < sources.size(); i++) {
            for (int j = sources.size()-1; j > i; j--) {
                double coef1 = analyzer.analyze(target, sources.get(j-1));
                double coef2 = analyzer.analyze(target, sources.get(j));
                if (coef1 < coef2) {
                    TextProvider t = sources.remove(j-1);
                    sources.add(j, t);
                }
            }
        }
        return sources;
    }
}
