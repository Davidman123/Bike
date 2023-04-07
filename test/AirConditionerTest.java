import assignment.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void airConditionerTest(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        assertTrue(airConditioner.turnOn());
    }

    @Test
    public void airConditionerIsOffTest(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        airConditioner.isOff();
        assertFalse(airConditioner.turnOn());
    }

    @Test
    public void increaseTemperatureTest(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        airConditioner.increaseTemperature();
        assertEquals(1, airConditioner.getTemperature());
    }

    @Test
    public void decreaseTemperatureTest(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.decreaseTemperature();
        assertEquals(1, airConditioner.getTemperature());
    }

    @Test
    public void increaseTemperatureBy30Test(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void decreaseTemperatureBy16Test(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.isOn();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }
}