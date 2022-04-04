import java.util.ArrayList;

public class technician extends Person {
    private double salary;
    private ArrayList<String>responsibleFor=new ArrayList();

    public technician(String Name, int Age, String PhoneNumber, long NationalId, double salary, ArrayList<String> responsibleFor) {
        super(Name, Age, PhoneNumber, NationalId);
        this.salary=salary;
        this.responsibleFor = responsibleFor;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public ArrayList<String> getResponsibleFor(){
        return responsibleFor;
    }

    public void setResponsibleFor(ArrayList<String> responsibleFor) {
        this.responsibleFor = responsibleFor;
    }

    @Override
    public void display() {
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
        System.out.println("phone:"+getPhoneNumber());
        System.out.println("national ID:"+getNationalId());
        System.out.println("Responsible for labs:"+getResponsibleFor());
        System.out.println("salary:"+getSalary());
    }

    @Override
    public String toString() {
        return "technician{" +
                "name="+getName()+
                ", age="+getAge()+
                ", phone="+getPhoneNumber()+
                ", national ID="+getNationalId()+
                "salary=" + salary +
                ", responsibleFor=" + responsibleFor +
                '}';
    }
}
