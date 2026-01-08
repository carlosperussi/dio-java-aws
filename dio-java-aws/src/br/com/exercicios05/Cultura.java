package br.com.exercicios05;

public record Cultura(double valorParam) implements Imposto {

    @Override
    public double calcularImposto() {
        return valorParam * 0.04;
    }

}
