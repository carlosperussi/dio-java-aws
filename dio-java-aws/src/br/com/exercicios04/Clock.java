package br.com.exercicios04;

public sealed abstract class Clock permits RelogioBR, RelogioUS {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public int getHora() {
        return this.hora;
    }

    public void setHora(final int horaParam) {
        if(horaParam >= 24) {
            this.hora = 24;
            return;
        }

        this.hora = horaParam;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(final int minutoParam) {
        if(minutoParam >= 60) {
            this.minuto = 60;
            return;
        }

        this.minuto = minutoParam;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(final int segundoParam) {
        if(segundoParam >= 60) {
            this.segundo = 60;
            return;
        }

        this.segundo = segundoParam;
    }

    abstract Clock conversor(Clock clock);

    public String getHoraCompleta() {
        return hora + ":" + minuto + ":" + segundo;
    }
}

