package assignment;

public class AirConditioner {
    private int temperature;
    private boolean status;
    public void isOn() {
        status = true;
    }

    public boolean turnOn() {
        return status;
    }

    public void isOff() {
        status = false;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature = temperature + 1;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature = temperature - 1;
        }
    }
}
