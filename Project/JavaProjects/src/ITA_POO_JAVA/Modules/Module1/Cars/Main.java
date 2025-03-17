package ITA_POO_JAVA.Modules.Module1.Cars;

public class Main {
    public static void main(String[] args) {
        Race race = new Race(2000);
        race.addCar(new Car("Car X",10,300));

        race.addCar(new Car("Car Y",20,500));

        race.addCar(new RaceCar("Car Z",2,500));

        race.addCar(new RaceCar("Car W",1,500));

        race.startRace();
    }
}
