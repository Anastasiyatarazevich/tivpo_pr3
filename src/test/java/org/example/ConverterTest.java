package org.example;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void testSi() {
        assertEquals(0.1, converter.si(1, 10), 0.01);
        assertEquals(17.62, converter.si(1, 1762), 0.01);
        assertEquals(3.3, converter.si(2, 33), 0.01);
        assertEquals(1111.1, converter.si(2, 11111), 0.01);
        assertEquals(500, converter.si(3, 0.5), 0.01);
        assertEquals(78000, converter.si(3, 78), 0.01);
    }

    @Test
    public void testOldRussian(){
        assertEquals(BigDecimal.valueOf(0.11125), converter.oldRussian(1, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(0.445), converter.oldRussian(2, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(1.125), converter.oldRussian(3, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(6.2), converter.oldRussian(4, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(4.4), converter.oldRussian(5, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(0.775), converter.oldRussian(6, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(0.0625), converter.oldRussian(7, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(5.325), converter.oldRussian(8, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(2.275), converter.oldRussian(9, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(2667.5), converter.oldRussian(10, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        assertEquals(BigDecimal.valueOf(1.775), converter.oldRussian(11, BigDecimal.valueOf(2.5)).stripTrailingZeros());
    }
}