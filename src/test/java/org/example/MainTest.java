package org.example;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    
        @org.junit.jupiter.api.Test
        void add() {
            Calculator calculadora = new Calculator();
            double resultado = calculadora.add(2,3);
            assertEquals(5, resultado);
        }
    
        @org.junit.jupiter.api.Test
        void substract() {
            Calculator calculadora = new Calculator();
            double resultado = calculadora.substract(8,3);
            assertEquals(5, resultado);
        }
    
        @org.junit.jupiter.api.Test
        void multiply() {
            Calculator calculadora = new Calculator();
            double resultado = calculadora.multiply(6,3);
            assertEquals(18, resultado);
        }
    
        @org.junit.jupiter.api.Test
        void divide() {
            Calculator calculadora = new Calculator();
            double resultado = calculadora.divide(9,3);
            assertEquals(3, resultado);
        }

}