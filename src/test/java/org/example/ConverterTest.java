package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void testSi() {
        assertEquals(0.1, converter.si(1, 10));
        assertEquals(17.62, converter.si(1, 1762));
        assertEquals(3.3, converter.si(2, 33));
        assertEquals(1111.1, converter.si(2, 11111));
        assertEquals(500, converter.si(3, 0.5));
        assertEquals(78000, converter.si(3, 78));
    }
}