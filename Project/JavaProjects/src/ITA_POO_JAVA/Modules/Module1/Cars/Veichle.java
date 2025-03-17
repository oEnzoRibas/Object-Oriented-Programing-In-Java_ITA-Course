package ITA_POO_JAVA.Modules.Module1.Cars;

public abstract class Veichle {

    protected int speed = 0;
    protected int maxSpeed;
    protected String model;

    public Veichle(){

    }

    public Veichle(String model, int maxSpeed, int speed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }

    public Veichle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public abstract void speedUp();


    public abstract void slowDown();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
