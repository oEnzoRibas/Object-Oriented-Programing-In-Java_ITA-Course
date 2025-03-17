/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module5.Zodiac.Project;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class People {

    private LocalDate dateOfBirth;
    private String name;
    private Calendar calendar = Calendar.getInstance();

    public People(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth){
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.name = name;
    }

    public People(String alice, Date date) {
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public String getZodiacSign(){
        int month = dateOfBirth.getMonthValue();
        int day = dateOfBirth.getDayOfMonth();

        return switch(month){
            case 1 -> (day >= 21) ? "Aquarius" : "Capricorn";
            case 2 -> (day >= 20) ? "Pisces" : "Aquarius";
            case 3 -> (day >= 21) ? "Aries" : "Pisces";
            case 4 -> (day >= 21) ? "Taurus" : "Aries";
            case 5 -> (day >= 21) ? "Gemini" : "Taurus";
            case 6 -> (day >= 21) ? "Cancer" : "Gemini";
            case 7 -> (day >= 22) ? "Leo" : "Cancer";
            case 8 -> (day >= 23) ? "Virgo" : "Leo";
            case 9 -> (day >= 23) ? "Libra" : "Virgo";
            case 10 -> (day >= 23) ? "Scorpio" : "Libra";
            case 11 -> (day >= 22) ? "Sagittarius" : "Scorpio";
            case 12 -> (day >= 22) ? "Capricorn" : "Sagittarius";
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
    }
}
