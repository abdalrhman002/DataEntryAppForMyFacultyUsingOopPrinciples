import java.util.ArrayList;

public class Instructors extends Person {
    private String Department;
    private double Salary;
    private ArrayList<String>subjects=new ArrayList<>();

    public Instructors(String Name, int Age, String PhoneNumber, long NationalId, String Department, double Salary, ArrayList<String> subjects) {
        super(Name, Age, PhoneNumber, NationalId);
        this.Department=Department;
        this.Salary=Salary;
        this.subjects = subjects;
    }

    public ArrayList<String> getSubjects(){
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects){
        this.subjects = subjects;
    }

    public String getDepartment(){
        return Department;
    }

    public void setDepartment(String department){
        Department = department;
    }

    public double getSalary(){
        return Salary;
    }

    public void setSalary(double salary){
        Salary = salary;
    }

    @Override
    public void display() {
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
        System.out.println("phone:"+getPhoneNumber());
        System.out.println("national ID:"+getNationalId());
        System.out.println("department:"+getDepartment());
        System.out.println("salary:"+getSalary());
        System.out.println("subjects"+getSubjects());
    }

    @Override
    public String toString() {
        return "Instructors{" +
                "name="+getName()+
                ", age="+getAge()+
                ", phone="+getPhoneNumber()+
                ", national ID="+getNationalId()+
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                ", subjects=" + subjects +
                '}';
    }

    public void AddSubject(String sub){

        subjects.add(sub);
    }

    public void DeletSubject(String sub){

        subjects.remove(sub);
    }
}
