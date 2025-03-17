package ITA_POO_JAVA.Modules.Module1.Cars;

public class RaceCar extends Car{

    public RaceCar() {
    }

    public RaceCar(String model, int enginePower, int maxSpeed){
        super(model,enginePower,maxSpeed);
    }

    @Override
    public void speedUp() {
        if (this.speed == 0){this.speed = 1;}
        this.speed = Math.min(this.speed * this.enginePower , this.maxSpeed);
    }

    @Override
    public void slowDown() {
        this.speed -= Math.pow(this.enginePower,2);
    }
}
