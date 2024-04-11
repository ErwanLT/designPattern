package behavioral.interpretor.expressions.impl.translate;

import java.util.HashMap;
import java.util.Map;

public class EnglishTranslationContext implements TranslationContext {
    private Map<String, String> translations;

    public EnglishTranslationContext() {
        translations = new HashMap<>();
        translations.put("hello", "hello");
        translations.put("world", "world");
        translations.put("java", "Java");
    }

    @Override
    public String translateWord(String word) {
        return translations.getOrDefault(word, word);
    }
}
