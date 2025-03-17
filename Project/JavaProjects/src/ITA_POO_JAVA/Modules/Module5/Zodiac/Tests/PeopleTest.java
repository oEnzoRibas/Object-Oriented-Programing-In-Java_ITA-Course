/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module5.Zodiac.Tests;

import ITA_POO_JAVA.Modules.Module5.Zodiac.Project.People;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    private People person1;
    private People person2;
    private People person3;
    @BeforeEach
    void setUp() {
        person1 = new People("Alice", 2000, 3, 25); // Aries
        person2 = new People("Bob", 1995, 7, 10);  // Cancer
        person3 = new People("Charlie", 1988, 12, 5); // Sagittarius
    }

    @Test
    void testGetName() {
        assertEquals("Alice", person1.getName());
        assertEquals("Bob", person2.getName());
        assertEquals("Charlie", person3.getName());
    }

    @Test
    void testGetAge() {
        assertEquals(24, person1.getAge());  // Update for current year
        assertEquals(29, person2.getAge());
        assertEquals(36, person3.getAge());
    }

    @Test
    void testGetZodiacSign() {
        assertEquals("Aries", person1.getZodiacSign());
        assertEquals("Cancer", person2.getZodiacSign());
        assertEquals("Sagittarius", person3.getZodiacSign());
    }
}