package org.example;

public class ComplexMultiplication implements ComplexOperation {
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}

