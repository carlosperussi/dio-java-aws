public non-sealed class Salesman extends Employee {
    private double percentPerSold;
    private double soldAmount;

    public Salesman(String codeParam, String nameParam, String addressParam, int ageParam, double salaryParam, double percentPerSoldParam, double soldAmountParam) {
        super(codeParam, nameParam, addressParam, ageParam, salaryParam);
        this.percentPerSold = percentPerSoldParam;
        this.soldAmount = soldAmountParam;
    }

    public Salesman() {}

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(final double percentPerSoldParam) {
        this.percentPerSold = percentPerSoldParam;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(final double soldAmountParam) {
        this.soldAmount = soldAmountParam;
    }

    @Override
    public double getFullSalary() {
        return this.salary + (soldAmount * percentPerSold) / 100;
    }
}
