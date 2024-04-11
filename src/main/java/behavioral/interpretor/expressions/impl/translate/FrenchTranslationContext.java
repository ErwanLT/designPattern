package behavioral.interpretor.expressions.impl.translate;

import java.util.HashMap;
import java.util.Map;

public class FrenchTranslationContext implements TranslationContext{
    private Map<String, String> translations;

    public FrenchTranslationContext() {
        translations = new HashMap<>();
        translations.put("hello", "bonjour");
        translations.put("world", "monde");
        translations.put("java", "Java");
    }

    @Override
    public String translateWord(String word) {
        return translations.getOrDefault(word, word);
    }
}
