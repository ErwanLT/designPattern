package test.java.builder;

import main.java.builder.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void builderDesignTest(){
        Human human = new Human.HumanBuilder()
                .withName("Erwan")
                .withEyesColor("blue")
                .withHairColor("blond")
                .build();

        Assertions.assertNotNull(human);
        Assertions.assertEquals("Erwan", human.getName());
        Assertions.assertEquals("blue", human.getEyesColor());
        Assertions.assertEquals("blond", human.getHairColor());
    }
}
