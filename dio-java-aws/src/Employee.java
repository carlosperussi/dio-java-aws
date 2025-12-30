public sealed abstract class Employee permits Manager, Salesman {
    protected String code;
    protected String name;
    protected String address;
    protected int age;
    protected double salary;

    public Employee(String codeParam, String nameParam, String addressParam, int ageParam, double salaryParam) {
        this.code = codeParam;
        this.name = nameParam;
        this.address = addressParam;
        this.age = ageParam;
        this.salary = salaryParam;
    }

    public Employee() {}

    public String getCode() {
        return code;
    }

    public void setCode(final String codeParam) {
        this.code = codeParam;
    }

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String addressParam) {
        this.address = addressParam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salaryParam) {
        this.salary = salaryParam;
    }

    public abstract double getFullSalary();
}
