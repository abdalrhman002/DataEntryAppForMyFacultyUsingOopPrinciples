import java.util.Objects;

public abstract class Person {
    private String Name;
    private int Age;
    private String PhoneNumber;
    final private long NationalId;

    public Person(String Name, int Age, String PhoneNumber, long NationalId){
        this.Name=Name;
        this.Age=Age;
        this.PhoneNumber=PhoneNumber;
        this.NationalId=NationalId;
    }

    abstract public void display();
    abstract public String toString();


    public String getName(){
        return Name;
    }

    public void setName(String name){
        Name = name;
    }

    public int getAge(){
        return Age;
    }

    public void setAge(int age){
        Age = age;
    }

    public String getPhoneNumber(){
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        PhoneNumber = phoneNumber;
    }

    public long getNationalId(){
        return NationalId;
    }
}
