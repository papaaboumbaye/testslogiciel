package com.example.demo.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {

    @Test
    void testConstructeurAvecParametres() {
        Voiture v = new Voiture("Ferrari", 2000);

        assertEquals("Ferrari", v.getMarque());
        assertEquals(2000, v.getPrix());
    }

    @Test
    void testSettersGetters() {
        Voiture v = new Voiture();

        v.setMarque("Peugeot");
        v.setPrix(15000);
        v.setId(10);

        assertEquals("Peugeot", v.getMarque());
        assertEquals(15000, v.getPrix());
        assertEquals(10, v.getId());
    }

    @Test
    void testToString() {
        Voiture v = new Voiture("Renault", 12000);
        v.setId(5);

        assertTrue(v.toString().contains("Renault"));
        assertTrue(v.toString().contains("12000"));
    }
}