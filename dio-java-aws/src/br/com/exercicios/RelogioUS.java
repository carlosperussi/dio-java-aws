public non-sealed class RelogioUS extends Clock {
    private String periodoDoDia;

    public String getPeriodoDoDia() {
        return periodoDoDia;
    }

    public void DefinirPeriodoMatutino() {
        this.periodoDoDia = "AM";
    }

    public void DefinirPeriodoVespertino() {
        this.periodoDoDia = "PM";
    }

    public void setHora(int hora) {
        this.periodoDoDia = "AM";

        if((hora > 12) && (hora <= 23)) {
            this.periodoDoDia = "PM";
            this.hora = hora - 12;
        }else if(hora >= 24)
            this.hora = 0;
        else
            this.hora = hora;
    }

    @Override
    public Clock conversor(final Clock clock) {
        this.segundo = clock.getSegundo();
        this.minuto = clock.getMinuto();

        switch (clock) {
            case RelogioUS relogioUS -> {
                this.hora = relogioUS.getHora();
                this.periodoDoDia = relogioUS.getPeriodoDoDia();
            }
            case RelogioBR relogioBR -> this.setHora(relogioBR.getHora());
        }
        return this;
    }

    @Override
    public String getHoraCompleta () {
        return super.getHoraCompleta() + " " + this.periodoDoDia;
    }
}
