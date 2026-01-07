package br.com.exercicios05;

public record Retangulo(double base, double altura) implements FormaGeometrica {
    
    @Override
    public double getArea() {
        return base * altura;
    }

}
