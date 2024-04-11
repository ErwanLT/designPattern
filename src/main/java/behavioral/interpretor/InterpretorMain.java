package behavioral.interpretor;

import behavioral.interpretor.expressions.Expression;
import behavioral.interpretor.expressions.impl.compute.AddExpression;
import behavioral.interpretor.expressions.impl.compute.MultiplyExpression;
import behavioral.interpretor.expressions.impl.compute.NumberExpression;
import behavioral.interpretor.expressions.impl.translate.EnglishTranslationContext;
import behavioral.interpretor.expressions.impl.translate.FrenchTranslationContext;
import behavioral.interpretor.expressions.impl.translate.WordExpression;

public class InterpretorMain {

    public static void main(String[] args) {
        computeExpression();
        translateExpression();
    }

    private static void computeExpression() {
        Expression<Integer> expr1 = new NumberExpression(10);
        Expression<Integer> expr2 = new NumberExpression(5);
        Expression<Integer> expr3 = new NumberExpression(3);

        // Construction de l'expression (5 + 3) * 10
        Expression<Integer> multiplication = new MultiplyExpression(
                new AddExpression(expr2, expr3),
                expr1
        );
        int result = multiplication.interpret();
        System.out.println("Result: " + result); // Output: Result: 80
    }

    private static void translateExpression() {
        // Création des expressions avec différents contextes de traduction
        Expression<String> expr1 = new WordExpression("hello", new EnglishTranslationContext());
        Expression<String> expr2 = new WordExpression("world", new EnglishTranslationContext());
        Expression<String> expr3 = new WordExpression("java", new EnglishTranslationContext());

        Expression<String> expr4 = new WordExpression("hello", new FrenchTranslationContext());
        Expression<String> expr5 = new WordExpression("world", new FrenchTranslationContext());
        Expression<String> expr6 = new WordExpression("java", new FrenchTranslationContext());

        // Interprétation des expressions dans différentes langues
        System.out.println("English Translation:");
        System.out.println(expr1.interpret() + " " + expr2.interpret() + " " + expr3.interpret());

        System.out.println("French Translation:");
        System.out.println(expr4.interpret() + " " + expr5.interpret() + " " + expr6.interpret());
    }
}
