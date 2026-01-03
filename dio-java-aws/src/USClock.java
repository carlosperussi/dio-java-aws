public class USClock extends Clock {
    private String periodoDoDia;

    @Override
    public Clock converter(final Clock clock) {
        return null;
    }

    public void setHora(final int horaParam) {
        if(horaParam >= 12) {
            this.hora = 12;
            this.periodoDoDia = "PM";
        }
    }
}
