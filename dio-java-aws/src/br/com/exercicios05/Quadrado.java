package br.com.exercicios05;

public record Quadrado(double lado) implements FormaGeometrica {

    @Override
    public double getArea() {
        return lado * lado;
    }

}
