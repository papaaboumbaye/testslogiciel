package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EchantillonTest {

    @Test
    void testConstructeurAvecParametres() {
        Echantillon echantillon = new Echantillon(3, 12000);

        assertEquals(3, echantillon.getNombreDeVoitures());
        assertEquals(12000, echantillon.getPrixMoyen());
    }

    @Test
    void testSettersGetters() {
        Echantillon echantillon = new Echantillon();

        echantillon.setNombreDeVoitures(4);
        echantillon.setPrixMoyen(15000);

        assertEquals(4, echantillon.getNombreDeVoitures());
        assertEquals(15000, echantillon.getPrixMoyen());
    }
}
