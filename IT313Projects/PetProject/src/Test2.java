import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2 {
    private Pet p;

    @BeforeEach
    public void setUp() {
         p = new Pet("lucky", "rick", "dog");
    }

    @Test
    void getName() {
        assertEquals("lucky", p.getName());
    }

    @Test
    void getOwner() {
    }

    @Test
    void getAnimalType() {
    }

    @Test
    void isVaccinate() {
    }

    @Test
    void setVaccinate() {
        p.setVaccinate(true);
        assertEquals(true, p.isVaccinate());
    }

    @Test
    void testToString() {
        assertEquals( "lucky rick dog false" , p.toString());
    }
}