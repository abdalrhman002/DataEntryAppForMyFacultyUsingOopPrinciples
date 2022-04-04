import java.util.ArrayList;
import java.util.Scanner;
public class FacultySystem {
   private static boolean sys=false;
    public static void start(){
        Scanner in=new Scanner(System.in);
        while (true){
            System.out.println("To add a person enter [1]");
            System.out.println("To search about a person enter [2]");
            System.out.println("To remove a person enter [3]");
            System.out.println("To edit a person info enter [4]");
            System.out.println("To show list of persons enter [5]");
            System.out.println("To out of the program enter [6]");
            int x=validInt();
            switch (x){
                case 1: {
                    boolean sys1=false;
                    while (true){
                        if(sys1==true)
                            break;
                        System.out.println("To add a student enter [1]");
                        System.out.println("To add a instructor enter [2]");
                        System.out.println("To add a administrator enter [3]");
                        System.out.println("To add a worker enter [4]");
                        System.out.println("To add a technician enter [5]");
                        System.out.println("To go to the previous list enter [6]");
                        int y = validInt();
                        switch (y){
                            case 1: {
                                System.out.print("enter student name:");
                                String name=in.next();
                                System.out.print("enter student age:");
                                int age=validInt();
                                System.out.print("enter student phone number:");
                                String phoneNumber=in.next();
                                System.out.print("enter student national ID:");
                                long nationalId=validLong();
                                System.out.print("enter student ID:");
                                long ID=validLong();
                                System.out.print("enter student GPA:");
                                double GPA=validDouble();
                                while(GPA>4.0||GPA<0.0){
                                    System.out.print("enter valid GPA:");
                                    GPA=validDouble();
                                }
                                System.out.print("enter student year:");
                                String year=in.next();
                                System.out.print("enter student email:");
                                String mail=in.next();
                                FacultySystem.AddStudent(name,age,phoneNumber,nationalId,ID,GPA,year,mail);
                                System.out.println("student added");
                                break;

                            }
                            case 2:{
                                System.out.print("enter instructor name:");
                                String name=in.next();
                                System.out.print("enter instructor age:");
                                int age=validInt();
                                System.out.print("enter instructor phone number:");
                                String phoneNumber=in.next();
                                System.out.print("enter instructor national ID:");
                                long nationalId=validLong();
                                System.out.print("enter instructor department:");
                                String department=in.next();
                                System.out.print("enter instructor salary:");
                                double salary=validDouble();
                                System.out.print("enter number of subjects of instructor:");
                                int n=validInt();
                                ArrayList<String>subjects=new ArrayList<>();
                                String subject;
                                System.out.print("enter subjects of instructor:");
                                for (int i=1;i<=n;i++){
                                    subject=in.next();
                                    subjects.add(subject);
                                }
                                FacultySystem.AddInstructor(name,age,phoneNumber,nationalId,department,salary,subjects);
                                System.out.println("instructor added");
                                break;
                            }
                            case 3:{
                                System.out.print("enter administrator name:");
                                String name=in.next();
                                System.out.print("enter administrator age:");
                                int age=validInt();
                                System.out.print("enter administrator phone number:");
                                String phoneNumber=in.next();
                                System.out.print("enter administrator national ID:");
                                long nationalId=validLong();
                                System.out.print("enter administrator salary:");
                                double salary=validDouble();
                                System.out.println("enter administrator year of enrolment:");
                                int year=validInt();
                                FacultySystem.addAdministrator(name,age,phoneNumber,nationalId,salary,year);
                                System.out.println("administrator added");
                                break;
                            }
                            case 4:{
                                System.out.print("enter worker name:");
                                String name=in.next();
                                System.out.print("enter worker age:");
                                int age=validInt();
                                System.out.print("enter worker phone number:");
                                String phoneNumber=in.next();
                                System.out.print("enter worker national ID:");
                                long nationalId=validLong();
                                System.out.print("enter worker salary:");
                                double salary=validDouble();
                                System.out.println("enter worker type of work:");
                                String typeOfWork=in.next();
                                FacultySystem.addWorker(name,age,phoneNumber,nationalId,salary,typeOfWork);
                                System.out.println("worker added");
                                break;
                            }
                            case 5:{
                                System.out.print("enter technician name:");
                                String name=in.next();
                                System.out.print("enter technician age:");
                                int age=validInt();
                                System.out.print("enter technician phone number:");
                                String phoneNumber=in.next();
                                System.out.print("enter technician national ID:");
                                long nationalId=validLong();
                                System.out.print("enter technician salary:");
                                double salary=validDouble();
                                System.out.print("enter number of labs of technician:");
                                int n=validInt();
                                ArrayList<String>labs=new ArrayList<>();
                                System.out.print("enter labs of technician:");
                                String lab;
                                for (int i=1;i<=n;i++){
                                    lab=in.next();
                                    labs.add(lab);
                                }
                                FacultySystem.addTichnicians(name,age,phoneNumber,nationalId,salary,labs);
                                System.out.println("technician added");
                                break;
                            }
                            case 6:{
                              sys1=true;
                                break;
                            }
                            default:{
                                System.out.println("this choose is not correct enter number from the list");
                            }
                        }

                    }
                    break;
                }
                case 2:{
                    boolean sys2=false;
                    while (true){
                        if(sys2==true)
                            break;
                        System.out.println("To search about student enter [1]");
                        System.out.println("To search about instructor enter [2]");
                        System.out.println("To search about administrator enter [3]");
                        System.out.println("To search about worker enter [4]");
                        System.out.println("To search about technician enter [5]");
                        System.out.println("To go to the previous list enter [6]");
                        int v = validInt();
                        switch (v){
                            case 1: {
                                System.out.print("enter student id:");
                                long id=validLong();
                                FacultySystem.SearchStudent(id);
                                break;
                            }
                            case 2:{
                                System.out.print("enter instructor national id:");
                                long nationalId=validLong();
                                FacultySystem.SearchInstructor(nationalId);
                                break;
                            }
                            case 3:{
                                System.out.print("enter administrator national id:");
                                long nationalId=validLong();
                                FacultySystem.searchAdministrator(nationalId);
                                break;
                            }
                            case 4:{
                                System.out.print("enter worker national id:");
                                long nationalId=validLong();
                                FacultySystem.SearchWorker(nationalId);
                                break;
                            }
                            case 5:{
                                System.out.print("enter technician national id:");
                                long nationalId=validLong();
                                FacultySystem.SearchWorker(nationalId);
                                break;
                            }
                            case 6:{
                                sys2=true;
                                break;
                            }
                            default:{
                                System.out.println("this choose is not correct enter number from the list");
                            }
                        }

                    }
                    break;
                }
                case 3:{
                    boolean sys3=false;
                    while (true){
                        if(sys3==true)
                            break;
                        System.out.println("To remove student enter [1]");
                        System.out.println("To remove instructor enter [2]");
                        System.out.println("To remove administrator enter [3]");
                        System.out.println("To remove worker enter [4]");
                        System.out.println("To remove technician enter [5]");
                        System.out.println("To go to the previous list enter [6]");
                        int n = validInt();
                        switch (n){
                            case 1: {
                                System.out.print("enter student id:");
                                long id=validLong();
                                FacultySystem.DeletStudent(id);
                                System.out.println("student deleted");
                                break;
                            }
                            case 2:{
                                System.out.print("enter instructor national id:");
                                long nationalId=validLong();
                                FacultySystem.DeletInstructor(nationalId);
                                System.out.println("instructor deleted");
                                break;
                            }
                            case 3:{
                                System.out.print("enter administrator national id:");
                                long nationalId=validLong();
                                FacultySystem.deletAdministrator(nationalId);
                                System.out.println("administrator deleted");
                                break;
                            }
                            case 4:{
                                System.out.print("enter worker national id:");
                                long nationalId=validLong();
                                FacultySystem.deletWorker(nationalId);
                                System.out.println("worker deleted");
                                break;
                            }
                            case 5:{
                                System.out.print("enter technician national id:");
                                long nationalId=validLong();
                                FacultySystem.deletTichnicians(nationalId);
                                System.out.println("technician deleted");
                                break;
                            }
                            case 6:{
                                sys3=true;
                                break;
                            }
                            default:{
                                System.out.println("this choose is not correct enter number from the list");
                            }
                        }
                    }
                    break;
                }
                case 4:{
                    boolean sys4=false;
                    while (true) {
                        if(sys4==true)
                            break;
                        System.out.println("To edit student info enter [1]");
                        System.out.println("To edit instructor info enter [2]");
                        System.out.println("To edit administrator info enter [3]");
                        System.out.println("To edit worker info enter [4]");
                        System.out.println("To edit technician info enter [5]");
                        System.out.println("To go to the previous list enter [6]");
                        int m =validInt();
                        switch (m) {
                            case 1: {
                                boolean te1 = false;
                                System.out.print("enter student ID:");
                                int id=validInt();
                                while (FacultySystem.GetStudent(id)==null){
                                    System.out.print("student not found enter correct ID:");
                                    id=validInt();
                                }
                                while (true) {
                                    if(te1==true)
                                        break;
                                    System.out.println("To edit name enter [1]");
                                    System.out.println("To edit age enter [2]");
                                    System.out.println("To edit phone number enter [3]");
                                    System.out.println("To edit GPA enter [4]");
                                    System.out.println("To edit year enter [5]");
                                    System.out.println("To go to the previous list enter [6]");
                                    int t=validInt();
                                    switch (t){
                                        case 1:{
                                            System.out.print("enter new name:");
                                            String name=in.next();
                                            FacultySystem.GetStudent(id).setName(name);
                                            System.out.println("name edited");
                                            break;

                                        }
                                        case 2:{
                                            System.out.print("enter new age:");
                                            int age=validInt();
                                            FacultySystem.GetStudent(id).setAge(age);
                                            System.out.println("age edited");
                                            break;
                                        }
                                        case 3:{
                                            System.out.print("enter new phone number:");
                                            String phoneNumber=in.next();
                                            FacultySystem.GetStudent(id).setPhoneNumber(phoneNumber);
                                            System.out.println("phone number edited");
                                            break;
                                        }
                                        case 4:{
                                            System.out.print("enter new GPA:");
                                            double GPA=validDouble();
                                            while(GPA>4.0||GPA<0.0){
                                                System.out.print("enter valid GPA:");
                                                GPA=validDouble();
                                            }
                                            FacultySystem.GetStudent(id).setGPA(GPA);
                                            System.out.println("GPA edited");
                                            break;
                                        }
                                        case 5:{
                                            System.out.print("enter new year:");
                                            String year=in.next();
                                            FacultySystem.GetStudent(id).setYear(year);
                                            System.out.println("year edited");
                                            break;
                                        }
                                        case 6:{
                                            te1=true;
                                            break;
                                        }
                                        default:{
                                            System.out.println("this choose is not correct enter number from the list");
                                        }
                                    }
                                }
                                break;
                            }
                            case 2: {
                                boolean te = false;
                                System.out.print("enter instructor national ID:");
                                long nationalId=validLong();
                                while (FacultySystem.getInstructor(nationalId)==null){
                                    System.out.print("instructor not found enter correct national ID:");
                                    nationalId=validLong();
                                }
                                while (true) {
                                    if(te==true)
                                        break;
                                    System.out.println("To edit name enter [1]");
                                    System.out.println("To edit age enter [2]");
                                    System.out.println("To edit phone number enter [3]");
                                    System.out.println("To edit salary enter [4]");
                                    System.out.println("To edit department enter [5]");
                                    System.out.println("To edit subjects enter [6]");
                                    System.out.println("To go to the previous list enter [7]");
                                    int p=validInt();
                                    switch (p){
                                        case 1:{
                                            System.out.print("enter new name:");
                                            String name=in.next();
                                            FacultySystem.getInstructor(nationalId).setName(name);
                                            System.out.println("name edited");
                                            break;

                                        }
                                        case 2:{
                                            System.out.print("enter new age:");
                                            int age=validInt();
                                            FacultySystem.getInstructor(nationalId).setAge(age);
                                            System.out.println("age edited");
                                            break;
                                        }
                                        case 3:{
                                            System.out.print("enter new phone number:");
                                            String phoneNumber=in.next();
                                            FacultySystem.getInstructor(nationalId).setPhoneNumber(phoneNumber);
                                            System.out.println("phone number edited");
                                            break;
                                        }
                                        case 4:{
                                            System.out.print("enter new salary:");
                                            double salary=validDouble();
                                            FacultySystem.getInstructor(nationalId).setSalary(salary);
                                            System.out.println("salary edited");
                                            break;
                                        }
                                        case 5:{
                                            System.out.print("enter new department:");
                                            String department=in.next();
                                            FacultySystem.getInstructor(nationalId).setDepartment(department);
                                            System.out.println("department edited");
                                            break;
                                        }
                                        case 6:{
                                            System.out.print("enter new number of subjects:");
                                            int n=validInt();
                                            ArrayList<String>subjects=new ArrayList<>();
                                            String subject;
                                            System.out.print("enter subjects:");
                                            for (int i=0;i<n;i++){
                                                subject=in.next();
                                                subjects.add(subject);
                                            }
                                            FacultySystem.getInstructor(nationalId).setSubjects(subjects);
                                            break;
                                        }
                                        case 7:{
                                            te=true;
                                            break;
                                        }
                                        default:{
                                            System.out.println("this choose is not correct enter number from the list");
                                        }
                                    }
                                }
                                break;
                            }
                            case 3: {
                                boolean te3 = false;
                                System.out.print("enter administrator national ID:");
                                long natioalId=validLong();
                                while (FacultySystem.getAdministrator(natioalId)==null){
                                    System.out.print("administrator not found enter correct national ID:");
                                    natioalId=validLong();
                                }
                                while (true) {
                                    if(te3==true)
                                        break;
                                    System.out.println("To edit name enter [1]");
                                    System.out.println("To edit age enter [2]");
                                    System.out.println("To edit phone number enter [3]");
                                    System.out.println("To edit salary enter [4]");
                                    System.out.println("To edit yearOfEnrollment enter [5]");
                                    System.out.println("To go to the previous list enter [6]");
                                    int p=validInt();
                                    switch (p){
                                        case 1:{
                                            System.out.print("enter new name:");
                                            String name=in.next();
                                            FacultySystem.getAdministrator(natioalId).setName(name);
                                            System.out.println("name edited");
                                            break;

                                        }
                                        case 2:{
                                            System.out.print("enter new age:");
                                            int age=validInt();
                                            FacultySystem.getAdministrator(natioalId).setAge(age);
                                            System.out.println("age edited");
                                            break;
                                        }
                                        case 3:{
                                            System.out.print("enter new phone number:");
                                            String phoneNumber=in.next();
                                            FacultySystem.getAdministrator(natioalId).setPhoneNumber(phoneNumber);
                                            System.out.println("phone number edited");
                                            break;
                                        }
                                        case 4:{
                                            System.out.print("enter new salary:");
                                            double salary=validDouble();
                                            FacultySystem.getAdministrator(natioalId).setSalary(salary);
                                            System.out.println("salary edited");
                                            break;
                                        }
                                        case 5:{
                                            System.out.print("enter new year of enrollment:");
                                            int yearOfEnrollment=validInt();
                                            FacultySystem.getAdministrator(natioalId).setYearOfEnrollment(yearOfEnrollment);
                                            System.out.println("year of enrollment edited");
                                            break;
                                        }
                                        case 6:{
                                            te3=true;
                                            break;
                                        }
                                        default:{
                                            System.out.println("this choose is not correct enter number from the list");
                                        }
                                    }
                                }
                                break;
                            }
                            case 4: {
                                boolean te4 = false;
                                System.out.print("enter worker national ID:");
                                long natioalId=validLong();
                                while (FacultySystem.getWorker(natioalId)==null){
                                    System.out.print("worker not found enter correct national ID:");
                                    natioalId=validLong();
                                }
                                while (true) {
                                    if(te4==true)
                                        break;
                                    System.out.println("To edit name enter [1]");
                                    System.out.println("To edit age enter [2]");
                                    System.out.println("To edit phone number enter [3]");
                                    System.out.println("To edit salary enter [4]");
                                    System.out.println("To edit type of work enter [5]");
                                    System.out.println("To go to the previous list enter [6]");
                                    int p=validInt();
                                    switch (p){
                                        case 1:{
                                            System.out.print("enter new name:");
                                            String name=in.next();
                                            FacultySystem.getWorker(natioalId).setName(name);
                                            System.out.println("name edited");
                                            break;

                                        }
                                        case 2:{
                                            System.out.print("enter new age:");
                                            int age=validInt();
                                            FacultySystem.getWorker(natioalId).setAge(age);
                                            System.out.println("age edited");
                                            break;
                                        }
                                        case 3:{
                                            System.out.print("enter new phone number:");
                                            String phoneNumber=in.next();
                                            FacultySystem.getWorker(natioalId).setPhoneNumber(phoneNumber);
                                            System.out.println("phone number edited");
                                            break;
                                        }
                                        case 4:{
                                            System.out.print("enter new salary:");
                                            double salary=validDouble();
                                            FacultySystem.getWorker(natioalId).setSalary(salary);
                                            System.out.println("salary edited");
                                            break;
                                        }
                                        case 5:{
                                            System.out.print("enter new year of type of work:");
                                            String typeOfWorke=in.next();
                                            FacultySystem.getWorker(natioalId).setTypeOfWork(typeOfWorke);
                                            System.out.println("year of enrollment edited");
                                            break;
                                        }
                                        case 6:{
                                            te4=true;
                                            break;
                                        }
                                        default:{
                                            System.out.println("this choose is not correct enter number from the list");
                                        }
                                    }
                                }
                                break;
                            }
                            case 5: {
                                boolean te5 = false;
                                System.out.print("enter technician national ID:");
                                long natioalId=validLong();
                                while (FacultySystem.getechnician(natioalId)==null){
                                    System.out.print("technician not found enter correct national ID:");
                                    natioalId=validLong();
                                }
                                while (true) {
                                    if(te5==true)
                                        break;
                                    System.out.println("To edit name enter [1]");
                                    System.out.println("To edit age enter [2]");
                                    System.out.println("To edit phone number enter [3]");
                                    System.out.println("To edit salary enter [4]");
                                    System.out.println("To edit labs that technician responsible for [5]");
                                    System.out.println("To go to the previous list enter [6]");
                                    int p=validInt();
                                    switch (p){
                                        case 1:{
                                            System.out.print("enter new name:");
                                            String name=in.next();
                                            FacultySystem.getechnician(natioalId).setName(name);
                                            System.out.println("name edited");
                                            break;

                                        }
                                        case 2:{
                                            System.out.print("enter new age:");
                                            int age=validInt();
                                            FacultySystem.getechnician(natioalId).setAge(age);
                                            System.out.println("age edited");
                                            break;
                                        }
                                        case 3:{
                                            System.out.print("enter new phone number:");
                                            String phoneNumber=in.next();
                                            FacultySystem.getechnician(natioalId).setPhoneNumber(phoneNumber);
                                            System.out.println("phone number edited");
                                            break;
                                        }
                                        case 4:{
                                            System.out.print("enter new salary:");
                                            double salary=validDouble();
                                            FacultySystem.getechnician(natioalId).setSalary(salary);
                                            System.out.println("salary edited");
                                            break;
                                        }
                                        case 5:{
                                            System.out.print("enter new number of labs that technician responsible for:");
                                            int n=validInt();
                                            ArrayList<String> labs=new ArrayList<>();
                                            String lab;
                                            System.out.print("enter new labs that technician responsible for:");
                                            for(int i=0;i<n;i++){
                                                lab=in.next();
                                                labs.add(lab);
                                            }
                                            FacultySystem.getechnician(natioalId).setResponsibleFor(labs);
                                            break;
                                        }
                                        case 6:{
                                            te5=true;
                                            break;
                                        }
                                        default:{
                                            System.out.println("this choose is not correct enter number from the list");
                                        }
                                    }
                                }
                                break;
                            }
                            case 6: {
                              sys4=true;
                                break;
                            }
                            default: {
                                System.out.println("this choose is not correct enter number from the list");
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    boolean te8 = false;
                    while (true) {
                        if (te8 == true)
                            break;
                        System.out.println("To show list of students enter [1]");
                        System.out.println("To show list of instructors enter [2]");
                        System.out.println("To show list of administrators enter [3]");
                        System.out.println("To show list of workers enter [4]");
                        System.out.println("To show list of technician enter [5]");
                        System.out.println("To go to the previous list enter [6]");
                        int b = validInt();
                        switch (b) {
                            case 1: {
                                System.out.println(FacultySystem.getStudentsList());
                                break;
                            }
                            case 2: {
                                System.out.println(FacultySystem.getinstructorsList());
                                break;
                            }
                            case 3: {
                                System.out.println(FacultySystem.getAdministratorList());
                                break;
                            }
                            case 4: {
                                System.out.println(FacultySystem.getWorkerList());
                                break;
                            }
                            case 5: {
                                System.out.println(FacultySystem.getTechniciansList());
                                break;
                            }
                            case 6: {
                                te8 = true;
                                break;
                            }
                            default: {
                                System.out.println("this choose is not correct enter number from the list");
                            }
                        }
                    }
                    break;
                }
                case 6:{
                   sys=true;
                    break;
                }
                default:{
                    System.out.println("this choose is not correct enter number from the list");
                }
            }
            if (sys==true)
                break;
        }
    }
    //student
    private static ArrayList<Student> StudentsList=new ArrayList();

    public static void displayStudentsList (){
        for(Student i:StudentsList){
            System.out.println(i);
        }
    }

    public static ArrayList<Student> getStudentsList() {
        return StudentsList;
    }

    public static void SearchStudent(long id){
        boolean t=false;
        for(int i=0;i<StudentsList.size();i++){
            if(StudentsList.get(i).getId()==id){
                System.out.println(StudentsList.get(i));
                t=true;
                break;
            }
        }
        if(t==false) {
            System.out.println("student not found");
        }
    }

    public static void SearchStudent(String email){
        boolean t=false;
        for(int i=0;i<StudentsList.size();i++){
            if(StudentsList.get(i).getEmail().equals(email)){
                System.out.println(StudentsList.get(i));
                t=true;
                break;
            }
        }
        if(t==false) {
            System.out.println("student not found");
        }
    }

    public static void AddStudent(String Name, int Age, String PhoneNumber, long NationalId, long Id, double GPA, String year,String email){
        StudentsList.add(new Student(Name, Age, PhoneNumber, NationalId, Id, GPA,year,email ));
    }

    public static void DeletStudent(long id){
        for(int i=0;i<StudentsList.size();i++){
            if(StudentsList.get(i).getId()==id){
                StudentsList.remove(i);
                break;
            }

        }
    }

    public static void DeletStudent(String email){
        for(int i=0;i<StudentsList.size();i++){
            if(StudentsList.get(i).getEmail().equals(email)){
                StudentsList.remove(i);
                break;
            }

        }
    }

    public static Student GetStudent(long id){
        for(int i=0;i<StudentsList.size();i++){
            if(StudentsList.get(i).getId()==id){
                return StudentsList.get(i);
            }
        }
        return null;
    }

    public static Student GetStudent(String email){
        for(int i=0;i<StudentsList.size();i++){
            if(StudentsList.get(i).getEmail().equals(email)){
                return StudentsList.get(i);
            }
        }
        return null;
    }


    //instructor
    private static ArrayList<Instructors>instructorsList=new ArrayList();

    public static void displayinstructorsList(){
        for(Instructors i:instructorsList){
            System.out.println(i);
        }
    }

    public static ArrayList<Instructors> getinstructorsList() {
        return instructorsList;
    }

    public static void SearchInstructor(long nationalId){
        boolean t=false;
        for(int i=0;i<instructorsList.size();i++){
            if(instructorsList.get(i).getNationalId()==nationalId){
                System.out.println(instructorsList.get(i));
                t=true;
                break;
            }
        }
        if(t==false) {
            System.out.println("instructor not found");
        }
    }

    public static void AddInstructor(String Name, int Age, String PhoneNumber, long NationalId, String Department, double Salary, ArrayList<String> subjects){
        instructorsList.add(new Instructors(Name,Age,PhoneNumber,NationalId,Department,Salary,subjects));
    }

    public static void DeletInstructor(long nationalid){
        for(int i=0;i<instructorsList.size();i++){
            if(instructorsList.get(i).getNationalId()==nationalid){
                instructorsList.remove(i);
                break;
            }
        }
    }

    public static Instructors getInstructor(long nationalId){
        for (Instructors i:instructorsList){
            if(i.getNationalId()==nationalId){
                return i;
            }
        }
        return null;
    }

    //adminastrator
    private static ArrayList<Administrator>administratorList=new ArrayList();

    public static void displayadministratorList(){
        for(Administrator i:administratorList){
            System.out.println(i);
        }
    }

    public static ArrayList<Administrator> getAdministratorList(){
        return administratorList;
    }

    public static void searchAdministrator(long nationalId){
        boolean t=false;
        for (int i=0;i<administratorList.size();i++){
            if(administratorList.get(i).getNationalId()==nationalId){
                System.out.println(administratorList.get(i));
                t=true;
                break;
            }
        }
        if(t==false) {
            System.out.println("administrator not found");
        }
    }

    public static void addAdministrator(String Name, int Age, String PhoneNumber, long NationalId, double salary, int yearOfEnrollment){
        administratorList.add(new Administrator(Name,Age,PhoneNumber,NationalId,salary,yearOfEnrollment));
    }

    public static void deletAdministrator(long nationalId){
        for (int i=0;i<administratorList.size();i++){
            if(administratorList.get(i).getNationalId()==nationalId){
                administratorList.remove(i);
                break;
            }
        }

    }

    public static Administrator getAdministrator(long nationalId){
        for (int i=0;i<administratorList.size();i++){
            if(administratorList.get(i).getNationalId()==nationalId){
               return administratorList.get(i);
            }
        }
        return null;
    }

    //worker
    private static ArrayList<Worker>workerList=new ArrayList<>();

    public static void displayworkerslist(){
        for(Worker i:workerList){
            System.out.println(i);
        }
    }

    public static ArrayList<Worker> getWorkerList(){
        return workerList;
    }

    public static void SearchWorker(long nationalId){
        boolean t=false;
        for(int i=0;i<workerList.size();i++){
            if(workerList.get(i).getNationalId()==nationalId){
                System.out.println(workerList.get(i));
                t=true;
                break;
            }
        }
        if(t==false) {
            System.out.println("worker not found");
        }
    }

    public static void addWorker(String Name, int Age, String PhoneNumber, long NationalId, double salary, String typeOfWork){
        workerList.add(new Worker(Name,Age,PhoneNumber,NationalId,salary,typeOfWork));
    }

    public static void deletWorker(long nationalId){
        for (int i=0;i<workerList.size();i++){
            if(workerList.get(i).getNationalId()==nationalId){
                workerList.remove(i);
                break;
            }
        }
    }

    public static Worker getWorker(long nationalId){
        for(int i=0;i<workerList.size();i++){
            if(workerList.get(i).getNationalId()==nationalId){
                return workerList.get(i);
            }
        }
        return null;    }

    //technician
    private static ArrayList<technician>techniciansList=new ArrayList<>();

    public static void displayTechnicianslist(){
        for(int i=0;i<techniciansList.size();i++){
            System.out.println(techniciansList.get(i));
        }
    }

    public static ArrayList<technician> getTechniciansList(){
        return techniciansList;
    }

    public static void searchTichnician(long nationalId){
        boolean t=false;
        for(int i=0;i<techniciansList.size();i++){
            if(techniciansList.get(i).getNationalId()==nationalId){
                System.out.println(techniciansList.get(i));
                t=true;
                break;
            }
        }
        if(t==false) {
            System.out.println("technician not found");
        }
    }

    public static void addTichnicians(String Name, int Age, String PhoneNumber, long NationalId, double salary, ArrayList<String> responsibleFor){
        techniciansList.add(new technician(Name,Age,PhoneNumber,NationalId,salary,responsibleFor));
    }

    public static void deletTichnicians(long nationalId){
        for(int i=0;i<techniciansList.size();i++){
            if(techniciansList.get(i).getNationalId()==nationalId){
                techniciansList.remove(i);
                break;
            }
        }
    }

    public static technician getechnician (long nationalId){
        for(int i=0;i<techniciansList.size();i++){
            if(techniciansList.get(i).getNationalId()==nationalId){
                return techniciansList.get(i);
            }
        }
        return null;
    }

    //to take a valid value
    private static int validInt(){
        Scanner in=new Scanner(System.in);
        boolean valid=false;
        int x=0;
        do{
            try {
                x=in.nextInt();
                valid=true;
            }catch (Exception e){
                in.nextLine();
                System.out.print("enter valid value:");
            }
        }while (!valid);
        return x;
    }
    private static double validDouble(){
        Scanner in=new Scanner(System.in);
        boolean valid=false;
        double x=0;
        do{
            try {
                x=in.nextDouble();
                valid=true;
            }catch (Exception e){
                in.nextLine();
                System.out.print("enter valid value:");
            }
        }while (!valid);
        return x;
    }
    private static long validLong(){
        Scanner in=new Scanner(System.in);
        boolean valid=false;
        long x=0;
        do{
            try {
                x=in.nextLong();
                valid=true;
            }catch (Exception e){
                in.nextLine();
                System.out.print("enter valid value:");
            }
        }while (!valid);
        return x;
    }
}






