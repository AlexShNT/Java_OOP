package org.example;

public class ComplexCalculator {
    private ComplexOperation operation;

    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber performCalculation(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = operation.calculate(a, b);
        System.out.println("Result: " + a + " " + operation.getClass().getSimpleName() + " " + b + " = " + result);
        return result;
    }
}

