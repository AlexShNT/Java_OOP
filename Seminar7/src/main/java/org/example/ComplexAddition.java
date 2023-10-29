package org.example;

public class ComplexAddition implements ComplexOperation {
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}

