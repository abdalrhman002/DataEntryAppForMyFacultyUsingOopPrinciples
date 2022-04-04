public class Worker extends Person {
    private double salary;
    private String typeOfWork;

    public Worker(String Name, int Age, String PhoneNumber, long NationalId, double salary, String typeOfWork) {
        super(Name, Age, PhoneNumber, NationalId);
        this.salary=salary;
        this.typeOfWork = typeOfWork;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getTypeOfWork(){
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    @Override
    public void display() {
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
        System.out.println("phone:"+getPhoneNumber());
        System.out.println("national ID:"+getNationalId());
        System.out.println("type of work:"+getTypeOfWork());
        System.out.println("salary:"+getSalary());
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name="+getName()+
                ", age="+getAge()+
                ", phone="+getPhoneNumber()+
                ", national ID="+getNationalId()+
                "salary=" + salary +
                ", typeOfWork='" + typeOfWork + '\'' +
                '}';
    }
}
