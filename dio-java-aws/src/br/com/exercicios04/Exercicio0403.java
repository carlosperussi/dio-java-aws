package br.com.exercicios04;

public class Exercicio0403 {
    public static void main(String[] args) {
        Clock relogioBR = new RelogioBR();
        relogioBR.setSegundo(0);
        relogioBR.setMinuto(0);
        relogioBR.setHora(25);
        
        System.out.println(relogioBR.getHoraCompleta());

        System.out.println(new RelogioUS().conversor(relogioBR).getHoraCompleta());
    }
}

