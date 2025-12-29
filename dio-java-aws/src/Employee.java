public sealed abstract class Employee permits Manager, Salesman {
    private String code;
    private String name;
    private String address;
    private int age;
    private double salary;

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
}
