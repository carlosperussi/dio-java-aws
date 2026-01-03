public non-sealed class RelogioBR extends Clock {
    @Override
    public Clock conversor(final Clock clock) {
        this.segundo = clock.getSegundo();
        this.minuto = clock.getMinuto();

        switch (clock) {
            case RelogioUS relogioUS ->
                this.hora = (relogioUS.getPeriodoDoDia().equals("PM")) ? relogioUS.getHora() - 12 : relogioUS.getHora();
            case RelogioBR relogioBR ->
                this.hora = relogioBR.getHora();
        }
        return this;
    }
}
