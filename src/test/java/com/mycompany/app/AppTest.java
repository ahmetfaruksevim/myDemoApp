package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;  // Import correct class for JUnit 3.8

public class AppTest extends TestCase {

    public void testStringManipulationWithUpperCase() {
        String result = new App().StringManipulation("AHMET", new ArrayList<>(List.of(0, 4)), "FARUK", new ArrayList<>(List.of(0, 4)));
        assertEquals("aHMEt\nfARUk", result);
    }

    public void testStringManipulationWithLowerCase() {
        String result = new App().StringManipulation("ahmet", new ArrayList<>(List.of(0, 4)), "faruk", new ArrayList<>(List.of(0, 4)));
        assertEquals("AhmeT\nFaruK", result);
    }

    public void testStringManipulationWithMixedCase() {
        String result = new App().StringManipulation("AhMet", new ArrayList<>(List.of(0, 4)), "FaRuk", new ArrayList<>(List.of(0, 4)));
        assertEquals("ahMeT\nfaRuK", result);
    }

    public void testStringManipulationWithEmptyList() {
        String result = new App().StringManipulation("Ahmet", new ArrayList<>(), "Faruk", new ArrayList<>());
        assertEquals("Ahmet\nFaruk", result);
    }

    public void testStringManipulationWithSpecialCharacters() {
        String result = new App().StringManipulation("Ahme?", new ArrayList<>(List.of(0, 4)), "Faru*", new ArrayList<>(List.of(0, 4)));
        assertEquals("ahme?\nfaru*", result);
    }
    
}
