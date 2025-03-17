package ITA_POO_JAVA.Modules.Module1.Cars;

import java.util.HashMap;
import java.util.Map;

public class Race {

    private int trackLength;
    private Map<Veichle, Integer> veichles = new HashMap<>();

    public Race(int trackLength){
        this.trackLength = trackLength;
    }

    public void addCar(Car veichle){
        veichles.put(veichle,0);
    }

    private boolean finished(){
        for(Integer value : veichles.values()){
            if (value > trackLength){
                return true;
            }
        }
        return false;
    }

    public void startRace(){
        while(!finished()){
            for(Veichle veichle : veichles.keySet()){
                veichle.speedUp();
                int dist = veichles.get(veichle);
                dist += veichle.getSpeed();
                veichles.replace(veichle,dist);
            }
        }
        for(Veichle veichle : veichles.keySet()){
            System.out.println(veichle.model+ " - "+ veichles.get(veichle) );
        }
    }
}
