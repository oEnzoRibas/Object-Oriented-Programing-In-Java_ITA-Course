/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Module5.Zodiac.Project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<People> PeopleList = new ArrayList<>();

        People Enzo = new People("Enzo", 2005, 5, 23);
        People Jessica = new People("Jessica", 2005, 9, 2);
        People Joao = new People("Joao", 2006, 4, 10);

        PeopleList.add(Enzo);
        PeopleList.add(Jessica);
        PeopleList.add(Joao);


        for (People p : PeopleList) {

            System.out.printf("""
                    
                    Name:%s,
                    Age: %d,
                    Zodiac Sign: %s
                    
                    """,p.getName(),p.getAge(),p.getZodiacSign());
        }
    }
}
