package br.com.exercicios05;

public record SaudeBemEstar(double valorTemp) implements Imposto {

    @Override
    public double calcularImposto() {
        return valorTemp * 0.015;
    }

}
