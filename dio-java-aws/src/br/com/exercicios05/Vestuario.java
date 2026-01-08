package br.com.exercicios05;

public record Vestuario(double valorParam) implements Imposto {

    @Override
    public double calcularImposto() {
        return valorParam * 0.025;
    }

}
