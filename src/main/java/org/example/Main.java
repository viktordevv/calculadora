package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        double resultado = calculadora.add(2,3);
        System.out.println(resultado);

        resultado = calculadora.substract(8,3);
        System.out.println(resultado);

        resultado = calculadora.multiply(6,3);
        System.out.println(resultado);

        resultado = calculadora.divide(9,3);
        System.out.println(resultado);
    }

}