package ITA_POO_JAVA.Module1.Cars;

public class Car extends Veichle {

    protected int enginePower;


    public Car() {
    }

    public Car(String model, int enginePower, int maxSpeed) {
        super( model,  maxSpeed);
        this.enginePower = enginePower;
    }

    public Car(String model, int enginePower, int maxSpeed, int speed, int year, String brand, String color) {
        super( model,  maxSpeed, speed);
        this.enginePower = enginePower;
    }

    public Car(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void speedUp() {
        this.speed = Math.min(this.speed + this.enginePower, this.maxSpeed);
    }

    @Override
    public void slowDown(){
        this.speed -= this.enginePower;
    }

    protected int calculateSpeed(int acceleration) {
        return this.getSpeed() + acceleration * this.enginePower / 10;
    }


    public void carInfo(){
        System.out.printf("""
                
                Modelo: %s
                Potência do Motor: %d
                Velocidade: %d
               
                """, getModel(),enginePower, getSpeed());
    }


    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }


}
