import assignment.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void checkThatBikeIsOnTest(){
        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.turnOn());
    }

    @Test
    public void checkThatBikeCanBeOffTest(){<
        Bike bike = new Bike();
        bike.isOn();
        bike.isOff();
        assertFalse(bike.turnOn());
    }

    @Test
    public void increaseSpeedBy1Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        assertEquals(15,bike.getSpeed());
        assertEquals("gear 1", bike.gearType());
    }
    @Test
    public void increaseSpeedBy2Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        assertEquals(24,bike.getSpeed());
        assertEquals("gear 2", bike.gearType());
    }

    @Test
    public void increaseSpeedBy3Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        assertEquals(38,bike.getSpeed());
        assertEquals("gear 3", bike.gearType());
    }
    @Test
    public void increaseSpeedBy4Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        assertEquals(44,bike.getSpeed());
        assertEquals("gear 4", bike.gearType());
    }

    @Test
    public void decreaseSpeedBy1Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.decelerate();
        assertEquals(14,bike.getSpeed());
    }
    @Test
    public void decreaseSpeedBy2Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.decelerate();
        assertEquals(22,bike.getSpeed());
    }
    @Test
    public void decreaseSpeedBy3Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.decelerate();
        assertEquals(35,bike.getSpeed());
    }
    @Test
    public void decreaseSpeedBy4Test(){
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.acceleration();
        bike.decelerate();
        assertEquals(40,bike.getSpeed());
    }
}