/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Module5.NameFormat.Project.Classes;

import ITA_POO_JAVA.Module5.NameFormat.Project.Interfaces.NameFormatter;

public class Titled implements NameFormatter {
    private String title;

    public Titled(String title) {
        this.title = title;
    }

    @Override
    public String formatName(String name, String familyName) {
        return title + " " + name + " " + familyName;
    }
}
