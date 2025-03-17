/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module6.Noise.Project.Classes;

import ITA_POO_JAVA.Modules.Module6.Noise.Project.Interfaces.Noisy;

public class Dog implements Noisy {

    @Override
    public String makeNoise() {
        return "Au Au";
    }
}
