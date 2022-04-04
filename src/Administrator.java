public class Administrator extends Person {
    private double salary;
    private  int yearOfEnrollment;

    public Administrator(String Name, int Age, String PhoneNumber, long NationalId, double salary, int yearOfEnrollment) {
        super(Name, Age, PhoneNumber, NationalId);
        this.salary=salary;
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setYearOfEnrollment(int yearOfEnrollment){
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public int getYearOfEnrollment(){
        return yearOfEnrollment;
    }

    @Override
    public void display() {
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
        System.out.println("phone:"+getPhoneNumber());
        System.out.println("national ID:"+getNationalId());
        System.out.println("year of enrollment:"+getYearOfEnrollment());
        System.out.println("salary:"+getSalary());
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "name="+getName()+
                ", age="+getAge()+
                ", phone="+getPhoneNumber()+
                ", national ID="+getNationalId()+
                ", year of enrollment=" + yearOfEnrollment +
                ", salary=" + salary +
                '}';
    }
}
