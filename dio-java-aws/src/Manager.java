public non-sealed class Manager extends Employee {
    private String login;
    private String password;
    private double comission;

    public String getLogin() {
        return login;
    }

    public void setLogin(final String loginParam) {
        this.login = loginParam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(final double comissionParam) {
        this.comission = comissionParam;
    }
}
