/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Interfaces;

public interface NameFormatter {

    default String formatName(String name, String familyName){
        return name+" "+familyName;
    }
}

