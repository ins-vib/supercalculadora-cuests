package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {

    @Test
    public void testSuperCalculadora() {
        assertEquals(6.0, Calculadora.SuperCalculadora(3));
        assertEquals(0.0, Calculadora.SuperCalculadora(0));
        assertEquals(10.0, Calculadora.SuperCalculadora(4));
    }

    @Test
    public void testSuperCaluladora() {
        assertEquals(5.0, Calculadora.SuperCaluladora(5));
    }

    @Test
    public void testSuperCalculadoraQuadrats() {
        assertEquals(14.0, Calculadora.SuperCalculadoraQuadrats(3));
        assertEquals(0.0, Calculadora.SuperCalculadoraQuadrats(0));
        assertEquals(30.0, Calculadora.SuperCalculadoraQuadrats(4));
    }

    @Test
    public void testCalcularPotencia() {
        assertEquals(1.0, Calculadora.calcularPotencia(2, 0)); 
        assertEquals(8.0, Calculadora.calcularPotencia(2, 3)); 
        assertEquals(27.0, Calculadora.calcularPotencia(3, 3)); 
        assertEquals(1.0, Calculadora.calcularPotencia(1, 10)); 
    }

    @Test
    public void testNombreDigits() {
        assertEquals(3, Calculadora.nombreDigits(123));
        assertEquals(1, Calculadora.nombreDigits(0));
        assertEquals(5, Calculadora.nombreDigits(-12345));
    }
}
