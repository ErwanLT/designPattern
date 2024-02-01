package creation.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class BuilderTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Human.HumanBuilder#build()}
     *   <li>{@link Human.HumanBuilder#withAge(int)}
     *   <li>{@link Human.HumanBuilder#withBirthDate(Date)}
     *   <li>{@link Human.HumanBuilder#withBirthPlace(String)}
     *   <li>{@link Human.HumanBuilder#withEyesColor(String)}
     *   <li>{@link Human.HumanBuilder#withHairColor(String)}
     *   <li>{@link Human.HumanBuilder#withHeight(String)}
     *   <li>{@link Human.HumanBuilder#withLastName(String)}
     *   <li>{@link Human.HumanBuilder#withName(String)}
     *   <li>{@link Human.HumanBuilder#withNumberOfSibling(int)}
     *   <li>{@link Human.HumanBuilder#withWeight(String)}
     * </ul>
     */
    @Test
    void testHumanBuilderBuild() {
        // Arrange
        Human.HumanBuilder withAgeResult = (new Human.HumanBuilder()).withAge(1);
        Date birthDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

        // Act
        Human actualBuildResult = withAgeResult.withBirthDate(birthDate)
                .withBirthPlace("Birth Place")
                .withEyesColor("Eyes Color")
                .withHairColor("Hair Color")
                .withHeight("Height")
                .withLastName("Doe")
                .withName("Name")
                .withNumberOfSibling(10)
                .withWeight("Weight")
                .build();

        // Assert
        assertEquals("Birth Place", actualBuildResult.getBirthPlace());
        assertEquals("Doe", actualBuildResult.getLastName());
        assertEquals("Eyes Color", actualBuildResult.getEyesColor());
        assertEquals("Hair Color", actualBuildResult.getHairColor());
        assertEquals("Height", actualBuildResult.getHeight());
        assertEquals("Name", actualBuildResult.getName());
        assertEquals("Weight", actualBuildResult.getWeight());
        assertEquals(1, actualBuildResult.getAge());
        assertEquals(10, actualBuildResult.getNumberOfSibling());
        assertFalse(actualBuildResult.isMarried());
        assertSame(birthDate, actualBuildResult.getBirthDate());
    }

}
