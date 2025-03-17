/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Classes;

import ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Interfaces.NameFormatter;

public class Informal implements NameFormatter {

    public Informal() {
    }

    @Override
    public String formatName(String name, String sobrenome) {
        return name;
    }
}
