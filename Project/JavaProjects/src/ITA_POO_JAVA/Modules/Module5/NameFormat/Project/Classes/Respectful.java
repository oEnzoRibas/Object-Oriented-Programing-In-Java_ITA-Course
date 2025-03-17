/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Classes;

import ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Interfaces.NameFormatter;

public class Respectful implements NameFormatter {
    private boolean isMister;

    public Respectful(boolean male) {
        this.isMister = male;
    }

    @Override
    public String formatName(String name, String familyName) {
        return (isMister ? "Mr." : "Ms.") + " " + familyName;
    }
}
