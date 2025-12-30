public non-sealed class Manager extends Employee {
    private String login;
    private String password;
    private double comission;

    public Manager(String codeParam, String nameParam, String addressParam, int ageParam, double salaryParam, String loginParam, String passwordParam, double comissionParam) {
        super(codeParam, nameParam, addressParam, ageParam, salaryParam);
        this.login = loginParam;
        this.password = passwordParam;
        this.comission = comissionParam;
    }

    public Manager() {}

    @Override
    public String getCode() {
        return "MN" + this.code;
    }

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

    @Override
    public double getFullSalary() {
        return this.salary + this.comission;
    }
}
