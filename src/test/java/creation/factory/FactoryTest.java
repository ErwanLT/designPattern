package creation.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Objects;

class FactoryTest {
    /**
     * Method under test: {@link CelestialFactory#getCelestial(String)}
     */
    @Test
    void testGetCelestial() {
        // Arrange, Act and Assert
        assertEquals("A man made satellite can't have natural satellite",
                Objects.requireNonNull(CelestialFactory.getCelestial("Type")).canHaveNaturalSatellite());
        assertEquals("A planet can have natural satellite",
                Objects.requireNonNull(CelestialFactory.getCelestial("PLANET")).canHaveNaturalSatellite());
        assertEquals("Stars can have natural Satellite",
                Objects.requireNonNull(CelestialFactory.getCelestial("STAR")).canHaveNaturalSatellite());
    }
}
