package behavioral.interpretor.expressions.impl.translate;

import behavioral.interpretor.expressions.Expression;

public class WordExpression implements Expression<String> {
    private String word;
    private TranslationContext translationContext;

    public WordExpression(String word, TranslationContext translationContext) {
        this.word = word;
        this.translationContext = translationContext;
    }

    @Override
    public String interpret() {
        // Interpréter le mot en utilisant le contexte de traduction
        return translationContext.translateWord(word);
    }
}
