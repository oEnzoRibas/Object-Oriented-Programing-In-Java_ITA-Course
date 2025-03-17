package ITA_POO_JAVA.Modules.Module1.Cars.Tests;
import ITA_POO_JAVA.Modules.Module1.Cars.Car;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car c;

    @BeforeEach
    public void CarInit(){
        c = new Car("testCar",20,30);
    }

    @Test
    public void standingStillCarTest() {
        assertEquals(0, c.getSpeed());
    }

    @Test
    public void speedUpTest() {
        c.setEnginePower(10);
        c.speedUp();
        assertEquals(10, c.getSpeed());
    }

    @Test
    public void SlowDownTest() {
        c.setEnginePower(23);
        c.slowDown();
        assertEquals(-23, c.getSpeed());
    }

    @Test
    public void MaxSpeedTest(){
        c.speedUp();
        c.speedUp();
        c.speedUp();
        c.speedUp();
        assertEquals(c.getMaxSpeed(), c.getSpeed());
    }
}
