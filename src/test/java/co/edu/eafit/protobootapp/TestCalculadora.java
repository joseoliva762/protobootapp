package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Pruebas unitarias del proyecto
public class TestCalculadora {

    //Pruebas unitarias para el cuadrado
    @Test
    public void testCuadradoPositivo() {
        Calculator calculator = new Calculator();
        assertEquals(25.0, calculator.square(5.0), 0);
    }

    @Test
    public void testCuadradoCero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.square(0.0), 0);
    }

    @Test
    public void testCuadradoUno() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.square(1.0), 0);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(16.0, calculator.square(-4.0), 0);
    }
    
    //Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calculator calculator = new Calculator();
        assertEquals(125.0, calculator.cube(5.0), 0);
    }

    @Test
    public void testCuboCero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.cube(0.0), 0);
    }

    @Test
    public void testCuboUno() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.cube(1.0), 0);
    }
    
    @Test
    public void testCuboMenosUno() {
        Calculator calculator = new Calculator();
        assertEquals(-1.0, calculator.cube(-1.0), 0);
    }

    @Test
    public void testCuboNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(-64.0, calculator.cube(-4.0), 0);
    }
}
