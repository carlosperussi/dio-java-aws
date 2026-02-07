package br.com.exercicios06.calc;

@FunctionalInterface
public interface Calculate {
    long exec(long...numbers);
}
