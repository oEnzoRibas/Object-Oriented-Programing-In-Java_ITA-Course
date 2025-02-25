/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Module6.Noise.Project.Classes;

import ITA_POO_JAVA.Module6.Noise.Project.Interfaces.Noisy;

public class Main {
    public static void main(String[] args) {
        Noisy[] noisyStuff = new Noisy[10];

        noisyStuff[0] = new Dog();
        noisyStuff[1] = new Car();
        noisyStuff[2] = new Dog();
        noisyStuff[3] = new Car();
        noisyStuff[4] = new Dog();
        noisyStuff[5] = new Car();
        noisyStuff[6] = new DrumKit();
        noisyStuff[7] = new Dog();
        noisyStuff[8] = new Car();
        noisyStuff[9] = new Sax();


        for (Noisy item : noisyStuff){
            System.out.println(item.makeNoise());
        }
    }
}
