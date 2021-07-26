package test.java.composite;

import main.java.factory.Human;
import main.java.factory.HumanFactory;
import main.java.factory.HumanPeriodEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    private HumanFactory factory;

    @BeforeEach
    public void init(){
        factory = new HumanFactory();
    }

    @Test
    public void factoryDesignTest(){

        Human human = factory.getHuman(HumanPeriodEnum.CHILD);
        Assertions.assertNotNull(human);
        Assertions.assertTrue(human.getAge() < 20);

        human = factory.getHuman(HumanPeriodEnum.PARENT);
        Assertions.assertNotNull(human);
        Assertions.assertTrue(human.getAge() > 20 && human.getAge() < 55);

        human = factory.getHuman(HumanPeriodEnum.GRANDPARENT);
        Assertions.assertNotNull(human);
        Assertions.assertTrue(human.getAge() > 50 );

    }
}
