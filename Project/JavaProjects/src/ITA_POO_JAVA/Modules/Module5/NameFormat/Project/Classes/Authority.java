/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Classes;

import ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Interfaces.NameFormatter;

public class Authority implements NameFormatter {
    private String name;
    private String familyname;
    private NameFormatter nameFormatter;

    public Authority(String name, String familyname, NameFormatter nameFormatter) {
        this.name = name;
        this.familyname = familyname;
        this.nameFormatter = nameFormatter;
    }

    public String getFormatted(){

        return nameFormatter.formatName(name,familyname);
    }
}
