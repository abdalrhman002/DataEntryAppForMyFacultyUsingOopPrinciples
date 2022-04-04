import java.time.Year;
import java.util.ArrayList;
import java.util.Objects;

public class Student extends Person {
    private final long Id;
    private double GPA;
    private String year;
    private String email;

    public Student(String Name, int Age, String PhoneNumber, long NationalId, long Id, double GPA, String year,String email) {
        super(Name, Age, PhoneNumber, NationalId);
        this.Id=Id;
        this.GPA=GPA;
        this.year = year;
        this.email=email;
    }

    public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public long getId(){
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name="+getName()+
                ", age="+getAge()+
                ", phone="+getPhoneNumber()+
                ", national ID="+getNationalId()+
                ", Id=" + Id +
                ", GPA=" + GPA +
                ", year=" + year +
                ", email="+email +
                '}';
    }

    @Override
    public void display() {
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
        System.out.println("phone:"+getPhoneNumber());
        System.out.println("national ID:"+getNationalId());
        System.out.println("GPA:"+getGPA());
        System.out.println("ID:"+getId());
        System.out.println("year:"+getYear());
        System.out.println("email="+getEmail());
    }

}
