package ITA_POO_JAVA.Module1.Cars.Tests;

import ITA_POO_JAVA.Module1.Cars.Car;
import ITA_POO_JAVA.Module1.Cars.RaceCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaceCarTest {

    RaceCar c;

    @BeforeEach
    public void CarInit(){
        c = new RaceCar("RaceCarTest",10,1000);
    }

    @Test
    public void standingStillCarTest() {
        assertEquals(0, c.getSpeed());
    }

    @Test
    public void speedUpTest() {
        c.speedUp();
        assertEquals(10, c.getSpeed());
    }

    @Test
    public void SlowDownTest() {
        c.setSpeed(1000);
        c.slowDown();
        assertEquals(900, c.getSpeed());
    }

    @Test
    public void MaxSpeedTest(){
        for (int i = 0; i < 4 ; i++) {c.speedUp();}
        assertEquals(c.getMaxSpeed(), c.getSpeed());
    }
}
