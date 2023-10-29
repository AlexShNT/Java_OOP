package org.example;


public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexOperation addition = new ComplexAddition();
        ComplexCalculator calculator = new ComplexCalculator(addition);
        calculator.performCalculation(num1, num2);

        ComplexOperation multiplication = new ComplexMultiplication();
        calculator = new ComplexCalculator(multiplication);
        calculator.performCalculation(num1, num2);
    }
}