/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module5.Zodiac.Project;

public class teste {
    public static void main(String[] args) {
        People p = new People("Ítalo",2004,07,13);

        System.out.printf("""
                    
                    Name:%s,
                    Age: %d,
                    Zodiac Sign: %s
                    
                    """,p.getName(),p.getAge(),p.getZodiacSign());
    }
}
