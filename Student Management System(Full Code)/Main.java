import java.util.Scanner;

class Student {
    public String stuID,stuName,stuAddress,stuDOB,stuSex,stuTel;
    public int stuAge;
    public double GPA;
    public Courses course1,course2;

    public Student(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2) {
        this.stuID=stuID;
        this.stuName=stuName;
        this.stuAddress=stuAddress;
        this.stuDOB=stuDOB;
        this.stuSex=stuSex;
        this.stuTel=stuTel;
        this.stuAge=stuAge;
        this.GPA=GPA;
        this.course1=obj1;
        this.course2=obj2;
    }

    public void update_StudentInfo(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2) {
        this.stuID=stuID;
        this.stuName=stuName;
        this.stuAddress=stuAddress;
        this.stuDOB=stuDOB;
        this.stuSex=stuSex;
        this.stuTel=stuTel;
        this.stuAge=stuAge;
        this.GPA=GPA;
        this.course1=obj1;
        this.course2=obj2;
    }

    public void update_StudentInfo(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA) {
        this.stuID=stuID;
        this.stuName=stuName;
        this.stuAddress=stuAddress;
        this.stuDOB=stuDOB;
        this.stuSex=stuSex;
        this.stuTel=stuTel;
        this.stuAge=stuAge;
        this.GPA=GPA;
    }

    public void set_courseObj1(Courses obj) {
        this.course1=obj;
    }

    public void set_courseObj2(Courses obj) {
        this.course2=obj;
    }

    public static Student get_StudentObj(Student obj) {
        return obj;
    }

    public void set_GPA(double newGPA) {
        this.GPA = newGPA;
    }
}

class Parent {
    public String parName,parTel,parDesig;

    public Parent(String parName,String parTel,String parDesig) {
        this.parName=parName;
        this.parTel=parTel;
        this.parDesig=parDesig;
    }

    public void parentData() {
        System.out.println("Parent Name: "+parName);
        System.out.println("Parent Telephone: "+parTel);
        System.out.println("Parent Designation: "+parDesig);
        System.out.println("\n");
    }

    //This is Copy Constructor
    public Parent(Parent Obj) {
        this.parName=Obj.parName;
        this.parTel=Obj.parTel;
        this.parDesig=Obj.parDesig;
    }

    public Parent() {
        this.parName="NULL";
        this.parTel="NULL";
        this.parDesig="NULL";
    }
}

class Batch_Refree {
    private String refID,refName,refYear,refBatch;

    public Batch_Refree(String refID,String refName,String refYear,String refBatch) {
        this.refID=refID;
        this.refName=refName;
        this.refYear=refYear;
        this.refBatch=refBatch;
    }

    public void display_BatchRefree() {
        System.out.println("     Refree ID: "+refID);
        System.out.println("     Refree Name: "+refName);
        System.out.println("     Refree Year: "+refYear);
        System.out.println("     Refree Batch: "+refBatch);
        System.out.println("\n");
    }
}

class Junior_Student extends Student {
    private Parent Parent1,Parent2;

    public Junior_Student(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2,String parName1,String parTel1,String parDesig1,String parName2,String parTel2,String parDesig2) {
        super(stuID,stuName,stuAddress,stuDOB,stuSex,stuTel,stuAge,GPA,obj1,obj2);
        this.Parent1=new Parent(parName1, parTel1, parDesig1);
        this.Parent2=new Parent(parName2, parTel2, parDesig2);
    }

    public Junior_Student(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2,String parName1,String parTel1,String parDesig1,Parent Obj) {
        super(stuID,stuName,stuAddress,stuDOB,stuSex,stuTel,stuAge,GPA,obj1,obj2);
        this.Parent1=new Parent(parName1, parTel1, parDesig1);
        this.Parent2=new Parent(Obj);
    }

    public Junior_Student(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2,String parName1,String parTel1,String parDesig1) {
        super(stuID,stuName,stuAddress,stuDOB,stuSex,stuTel,stuAge,GPA,obj1,obj2);
        this.Parent1=new Parent(parName1, parTel1, parDesig1);
        this.Parent2=new Parent();
    }

    public Parent get_parentObj1() {
        return Parent1;
    }

    public Parent get_parentObj2() {
        return Parent2;
    }

    public void update_StudentInfo(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2,String parName1,String parTel1,String parDesig1,String parName2,String parTel2,String parDesig2) {
        this.stuID=stuID;
        this.stuName=stuName;
        this.stuAddress=stuAddress;
        this.stuDOB=stuDOB;
        this.stuSex=stuSex;
        this.stuTel=stuTel;
        this.stuAge=stuAge;
        this.GPA=GPA;
        this.course1=obj1;
        this.course2=obj2;
        get_parentObj1().parName=parName1;
        get_parentObj1().parTel=parTel1;
        get_parentObj1().parDesig=parDesig1;
        get_parentObj2().parName=parName2;
        get_parentObj2().parTel=parTel2;
        get_parentObj2().parDesig=parDesig2;
    }

    public void display_Student() {
        System.out.println("\nStudent ID: "+stuID);
        System.out.println("Student Name: "+stuName);
        System.out.println("Student Address: "+stuAddress);
        System.out.println("Student DOB: "+stuDOB);
        System.out.println("Student Sex: "+stuSex);
        System.out.println("Student Telephone: "+stuTel);
        System.out.println("Student Age: "+stuAge);
        System.out.println("Student GPA: "+GPA);
        System.out.println("\nStudent Course 1:\n     ID: "+course1.get_CourseID());
        System.out.println("     Name: "+course1.get_CourseDesc());
        System.out.println("     Period: "+course1.get_CoursePeriod());
        System.out.println("\nStudent Course 2:\n     ID: "+course2.get_CourseID());
        System.out.println("     Name: "+course2.get_CourseDesc());
        System.out.println("     Period: "+course2.get_CoursePeriod());
        System.out.println("\nParent 1 Details:\n     Name: "+get_parentObj1().parName);
        System.out.println("     Telephone: "+get_parentObj1().parTel);
        System.out.println("     Designation: "+get_parentObj1().parDesig);
        System.out.println("\nParent 2 Details:\n     Name: "+get_parentObj2().parName);
        System.out.println("     Telephone: "+get_parentObj2().parTel);
        System.out.println("     Designation: "+get_parentObj2().parDesig);
        System.out.println("\nData Retrieved Successfully !");
    }
}

class Senior_Student extends Student {
    private Batch_Refree Refree;

    public Senior_Student(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2,Batch_Refree refree) {
        super(stuID,stuName,stuAddress,stuDOB,stuSex,stuTel,stuAge,GPA,obj1,obj2);
        this.Refree=refree;
    }

    public void update_StudentInfo(String stuID,String stuName,String stuAddress,String stuDOB,String stuSex,String stuTel,int stuAge,double GPA,Courses obj1,Courses obj2,Batch_Refree refree) {
        this.stuID=stuID;
        this.stuName=stuName;
        this.stuAddress=stuAddress;
        this.stuDOB=stuDOB;
        this.stuSex=stuSex;
        this.stuTel=stuTel;
        this.stuAge=stuAge;
        this.GPA=GPA;
        this.course1=obj1;
        this.course2=obj2;
        this.Refree=refree;
    }

    public void display_Student() {
        System.out.println("\nStudent ID: "+stuID);
        System.out.println("Student Name: "+stuName);
        System.out.println("Student Address: "+stuAddress);
        System.out.println("Student DOB: "+stuDOB);
        System.out.println("Student Sex: "+stuSex);
        System.out.println("Student Telephone: "+stuTel);
        System.out.println("Student Age: "+stuAge);
        System.out.println("Student GPA: "+GPA);
        System.out.println("\nStudent Course 1:\n     ID: "+course1.get_CourseID());
        System.out.println("     Name: "+course1.get_CourseDesc());
        System.out.println("     Period: "+course1.get_CoursePeriod());
        System.out.println("\nStudent Course 2:\n     ID: "+course2.get_CourseID());
        System.out.println("     Name: "+course2.get_CourseDesc());
        System.out.println("     Period: "+course2.get_CoursePeriod());
        System.out.println("\nRefree Details: \n");
        Refree.display_BatchRefree();
    }
}

class Lecture {
    protected String lecID,lecName,lecSpec;
    protected double lecSal,basicAllowance;

    public Lecture(String lecID,String lecName,String lecSpec,double lecSal,double basicAllowance) {
        this.lecID=lecID;
        this.lecName=lecName;
        this.lecSpec=lecSpec;
        this.lecSal=lecSal;
        this.basicAllowance=basicAllowance;
    }

    public double get_lecSal() {
        return lecSal;
    }

    public double get_basicAllowance() {
        return basicAllowance;
    }

    public String get_lecName() {
        return lecName;
    }

    public void TotSalary() {
        double totsal=lecSal+basicAllowance;
        System.out.println("Total Salary is: "+totsal);
    }

    public void displayData() {
        System.out.println("\n");
        System.out.println("Lecturer ID: "+lecID);
        System.out.println("Lecturer Name: "+lecName);
        System.out.println("Lecturer Speciality: "+lecSpec);
        System.out.println("Lecturer Basic Salary: "+lecSal);
        System.out.println("Lecturer Basic Allowance: "+basicAllowance);
        System.out.println("\n");
    }

    public void update_Salary(double x,double y) {
        this.lecSal=x;
        this.basicAllowance=y;
    }
}

class Dean extends Lecture {
    private String faculty;
    private double deanAllowance;
    private int yearsOfExperience;

    public Dean(String lecID,String lecName,String lecSpec,double lecSal,double basicAllowance,String faculty,double deanAllowance,int yearsOfExperience) {
        super(lecID,lecName,lecSpec,lecSal,basicAllowance);
        this.faculty=faculty;
        this.deanAllowance=deanAllowance;
        this.yearsOfExperience=yearsOfExperience;
    }

    public void TotSalary() {
        double totsal=lecSal+basicAllowance+deanAllowance;
        System.out.println("Total Salary is: "+totsal);
    }

    public void displayData() {
        System.out.println("\n");
        System.out.println("Dean ID: "+lecID);
        System.out.println("Dean Name: "+lecName);
        System.out.println("Dean Speciality: "+lecSpec);
        System.out.println("Dean Faculty: "+faculty);
        System.out.println("Dean Years Of Experience: "+yearsOfExperience);
        System.out.println("Dean Basic Salary: "+lecSal);
        System.out.println("Dean Basic Allowance: "+basicAllowance);
        System.out.println("Dean Allowance: "+deanAllowance);
        System.out.println("\n");
    }

    public void update_Salary(double x,double y,double z) {
        this.lecSal=x;
        this.basicAllowance=y;
        this.deanAllowance=z;
    }
}

class Student_Registration{
    private String regNo,regDate,regBatch;
    private Student student;

    public Student_Registration(String regNo,String regDate,String regBatch,Student student){
        this.regNo=regNo;
        this.regDate=regDate;
        this.regBatch=regBatch;
        this.student=student;
    }

    public void display_Registration_Details() {
        System.out.println("Registration No: "+regNo);
        System.out.println("Registration Date: "+regDate);
        System.out.println("Registration Batch: "+regBatch);
        System.out.println("Student Details:\n     ID: "+student.stuID);
        System.out.println("     Name: "+student.stuName);
    }
}

class Courses{
    private String courseID,courseDesc;
    private int coursePeriod;

    public Courses(String courseID,String courseDesc,int coursePeriod) {
        this.courseID=courseID;
        this.courseDesc=courseDesc;
        this.coursePeriod=coursePeriod;
    }

    public Courses() {
        this.courseID="NULL";
        this.courseDesc="NULL";
        this.coursePeriod=0;
    }

    public String get_CourseID() {
        return courseID;
    }

    public String get_CourseDesc() {
        return courseDesc;
    }

    public int get_CoursePeriod() {
        return coursePeriod;
    }

    public Courses get_CourseObj(Courses obj) {
        return obj;
    }

    public void display_CourseData() {
        System.out.println("Course ID: "+courseID);
        System.out.println("Course Description: "+courseDesc);
        System.out.println("Course Period: "+coursePeriod);
        System.out.println("\n");
    }
}

class Reports{
    private String reportID,reportGrade;
    private Student student;

    public Reports(String reportID,String reportGrade,Student student) {
        this.reportID=reportID;
        this.reportGrade=reportGrade;
        this.student=student;
    }

    public Reports(Student student) {
        reportID="N/A";
        reportGrade="N/A";
        this.student=student;
    }

    public void update_Reports(String repID,String repGrade) {
        reportID=repID;
        reportGrade=repGrade;
    }

    public void set_repGrade(String repGrade) {
        reportGrade=repGrade;
    }

    public void display_Reports() {
        System.out.println("Report ID: "+reportID);
        System.out.println("Report Grade: "+reportGrade);
        System.out.println("Student Details:\n     ID: "+student.stuID);
        System.out.println("     Name: "+student.stuName);
        System.out.println("\n");
    }
}

class Projects{
    private String projectID,projectCat;
    private Student member1,member2,member3,member4;

    public Projects(String projectID,String projectCat,Student mem1,Student mem2,Student member3,Student mem4) {
        this.projectID=projectID;
        this.projectCat=projectCat;
        this.member1=mem1;
        this.member2=mem2;
        this.member3=member3;
        this.member4=mem4;
    }

    public Projects(String projectID,String projectCat) {
        this.projectID=projectID;
        this.projectCat=projectCat;
    }

    public void display_Projects() {
        System.out.println("Project ID: "+projectID);
        System.out.println("Project Category: "+projectCat);
        System.out.println("Members:\n     Student 01: "+member1.stuName);
        System.out.println("     Student 02: "+member2.stuName);
        System.out.println("     Student 03: "+member3.stuName);
        System.out.println("     Student 04: "+member4.stuName);
        System.out.println("\n");
    }

    public void display_BasicProject() {
        System.out.println("Project ID: "+projectID);
        System.out.println("Project Category: "+projectCat);
        System.out.println("\n");
    }

    public void update_Members(Student mem1,Student mem2,Student mem3,Student mem4) {
        this.member1=mem1;
        this.member2=mem2;
        this.member3=mem3;
        this.member4=mem4;
    }
}

public class Main {
    public static void main(String[] args) {

        //Creating Objects
        Courses Course1 = new Courses("C001","DSE",12);
        Courses Course2 = new Courses("C002", "HND", 9);
        Courses Course3 = new Courses("C003", "CCS", 4);
        Courses Course4 = new Courses("C004", "ENGLISH", 9);
        Courses NullCourse = new Courses();

        Batch_Refree BR1 = new Batch_Refree("REF001","Hirusha Perera","2023","23.1");
        Batch_Refree BR2 = new Batch_Refree("REF002","Moksha Prasad","2021","21.2");
        Batch_Refree BR3 = new Batch_Refree("REF003","Lahiru Dilshan","2022","22.1");
        Batch_Refree BR4 = new Batch_Refree("REF004","Hirusha Perera","2022","22.3");

        Junior_Student JS1 = new Junior_Student("JS0001", "Dilshan Sathsara", "Elpitiya", "20031031", "Male", "0769477675", 20, 3.8, Course1, NullCourse, "Sujeewa", "0761231234", "Null", "Sarath", "Null", "Null");
        Junior_Student JS2 = new Junior_Student("JS0002", "Kavindu Kalhara", "Mathugama", "20021121", "Male", "0707656980", 21, 3.4, Course2, Course3, "Nirosha", "0786956456", "Null", "Susantha", "Null", "Null");
        Junior_Student JS3 = new Junior_Student("JS0003", "Pasindu Chamod", "Kaluthara", "20051215", "Male", "0754678999", 18, 3.6, Course1, Course3, "Kanthi", "0705434234", "Null", "perera", "Null", "Null");
        Junior_Student JS4 = new Junior_Student("JS0004", "Madhushani Nanayakkara", "Aluthgama", "20021019", "Female", "0705595234", 21, 3.7, Course2, Course3, "Priyanka", "0712365897", "Null", "Kumara", "Null", "Null");

        Senior_Student SS1 = new Senior_Student("SS001","Sandun Priyankara", "Mathara", "19991019", "Male", "0767897234", 24, 3.7, Course1, Course3,BR4);
        Senior_Student SS2 = new Senior_Student("SS002","Kusal Perera", "Ambalngoda", "19981019", "Male", "0782003234", 25, 3.5, Course1, Course2,BR3);
        Senior_Student SS3 = new Senior_Student("SS003","Janith Chandupa", "Hikkaduwa", "20001019", "Male", "0787689234", 23, 3.6, Course2, Course3,BR1);
        Senior_Student SS4 = new Senior_Student("SS004","Kavish Isuranga", "Batapola", "19961119", "Male", "0757795234", 27, 3.8, Course2, Course3,BR2);

        Lecture L1 = new Lecture("L001","P.K.S.Asanga","DSE",90000,30000);
        Lecture L2 = new Lecture("L002","Sandaruwani Pathirage","DSE",100000,40000);
        Lecture L3 = new Lecture("L003","M.K.T.W. Dharmasena","DSE",80000,20000);
        Lecture L4 = new Lecture("L004","A. Kodituwakku"," ENGLISH",85000,10000);

        Dean D1 = new Dean ("D001","Shamali Kurukulasuriya","Software Engineering",120000,40000,"Galle",30000,4);

        Student_Registration SR1 = new Student_Registration("REG001","2022.10.03","22.3",SS1);
        Student_Registration SR2 = new Student_Registration("REG002","2022.10.06","22.3",SS2);
        Student_Registration SR3 = new Student_Registration("REG003","2022.10.08","22.3",SS3);
        Student_Registration SR4 = new Student_Registration("REG004","2022.10.11","22.3",SS4);
        Student_Registration SR5 = new Student_Registration("REG005","2023.02.03","23.1",JS1);
        Student_Registration SR6 = new Student_Registration("REG006","2023.02.07","23.1",JS2);
        Student_Registration SR7 = new Student_Registration("REG007","2023.02.13","23.1",JS3);
        Student_Registration SR8 = new Student_Registration("REG008","2023.02.20","23.1",JS4);

        Reports R1 = new Reports("R001","B",SS1);
        Reports R2 = new Reports("R002","A",SS2);
        Reports R3 = new Reports("R003","B",SS3);
        Reports R4 = new Reports("R004","C",SS4);
        Reports R5 = new Reports("R005","A",JS1);
        Reports R6 = new Reports("R006","B",JS2);
        Reports R7 = new Reports("R007","C",JS3);
        Reports R8 = new Reports(JS4);

        Projects P1 = new Projects("P001","PF",SS1,SS2,SS3,SS4);
        Projects P2 = new Projects("P002","OOP",JS1,JS2,JS3,JS4);
        Projects P3 = new Projects("P003", "DBMS");

        //Outputs in Systematic View
        int option = -1;
        int StuFunc,ParFunc,BRFunc,JRSFunc,SRSFunc,LnDFunc,StRegFunc,CourFunc,RepFunc,ProjFunc;
        Scanner scanner = new Scanner(System.in);
        while(option!=11) {
            int selStu;
            System.out.println("Enter Any Option: ");
            System.out.println("1.Student Functions\n2.Parent Functions\n3.Batch Referee Functions\n4.Junior Student Functions\n5.Senior Student Functions\n6.Lecturer & Dean Functions\n7.Student Registration Functions\n8.Courses Functions\n9.Reports Functions\n10.Projects Functions\n11.Exit");
            //Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                option = scanner.nextInt();
                //scanner.close();
                switch (option) {
                    case 1:
                        System.out.println("Please Select the Function !");
                        System.out.println("1.Display Students\n2.Set GPA Only\n3.Update Students");
                        StuFunc = scanner.nextInt();
                        int setStu, updStu;
                        if (StuFunc == 1) {
                            System.out.println("Please Select Student Number !");
                            System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                            selStu = scanner.nextInt();
                            if (selStu == 1) {
                                JS1.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                                //System.out.println("\033[H\033[2J");
                            } else if (selStu == 2) {
                                JS2.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selStu == 3) {
                                JS3.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selStu == 4) {
                                JS4.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selStu == 5) {
                                SS1.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selStu == 6) {
                                SS2.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selStu == 7) {
                                SS3.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selStu == 8) {
                                SS4.display_Student();
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else {
                                System.out.println("Invalid Student Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (StuFunc == 2) {
                            System.out.println("Enter Student ID: ");
                            System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                            setStu = scanner.nextInt();
                            double setvalue;
                            if (setStu == 1) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                JS1.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (setStu == 2) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                JS2.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (setStu == 3) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                JS3.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (setStu == 4) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                JS4.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (setStu == 5) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                SS1.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (setStu == 6) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                SS2.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (setStu == 7) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                SS3.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (setStu == 8) {
                                System.out.println("Enter New GPA Value: ");
                                setvalue = scanner.nextDouble();
                                SS4.set_GPA(setvalue);
                                System.out.println("\nNew GPA Value Assigned Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else {
                                System.out.println("Invalid Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (StuFunc == 3) {
                            System.out.println("Enter Student ID: ");
                            System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                            updStu = scanner.nextInt();
                            scanner.nextLine();
                            String stuid, stuname, stuaddress, studob, stusex, stutel;
                            int stuage;
                            double stugpa;
                            if (updStu == 1) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS1.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    JS1.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    JS1.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    JS1.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: ");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS1.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    JS1.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    JS1.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    JS1.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    JS1.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                JS1.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (updStu == 2) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS2.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    JS2.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    JS2.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    JS2.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: \n");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS2.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    JS2.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    JS2.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    JS2.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    JS2.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                JS2.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (updStu == 3) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS3.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    JS3.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    JS3.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    JS3.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: ");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS3.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    JS3.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    JS3.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    JS3.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    JS3.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                JS3.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (updStu == 4) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS4.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    JS4.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    JS4.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    JS4.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: ");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    JS4.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    JS4.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    JS4.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    JS4.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    JS4.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                JS4.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (updStu == 5) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS1.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    SS1.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    SS1.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    SS1.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: ");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS1.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    SS1.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    SS1.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    SS1.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    SS1.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                SS1.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (updStu == 6) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS2.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    SS2.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    SS2.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    SS2.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: ");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS2.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    SS2.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    SS2.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    SS2.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    SS2.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                SS2.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (updStu == 7) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS3.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    SS3.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    SS3.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    SS3.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: ");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS3.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    SS3.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    SS3.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    SS3.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    SS3.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                SS3.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (updStu == 8) {
                                System.out.println("Enter Student Details:");
                                System.out.println("Student ID: ");
                                stuid = scanner.nextLine();
                                System.out.println("Student Name: ");
                                stuname = scanner.nextLine();
                                System.out.println("Student Address: ");
                                stuaddress = scanner.nextLine();
                                System.out.println("Student Date Of Birth (Format Ex:'20231110'):");
                                studob = scanner.nextLine();
                                System.out.println("Student Sex:");
                                stusex = scanner.nextLine();
                                System.out.println("Student Telephone: ");
                                stutel = scanner.nextLine();
                                System.out.println("Student Age: ");
                                stuage = scanner.nextInt();
                                System.out.println("Student GPA: ");
                                stugpa = scanner.nextDouble();
                                int courseNo;
                                System.out.println("Enter Course 1:");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS4.set_courseObj1(Course1);
                                } else if (courseNo == 2) {
                                    SS4.set_courseObj1(Course2);
                                } else if (courseNo == 3) {
                                    SS4.set_courseObj1(Course3);
                                } else if (courseNo == 4) {
                                    SS4.set_courseObj1(Course4);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                System.out.println("Enter Course 2: ");
                                System.out.println("1.DSE\n2.HND\n3.CCS\n4.English\n5.Null");
                                courseNo = scanner.nextInt();
                                if (courseNo == 1) {
                                    SS4.set_courseObj2(Course1);
                                } else if (courseNo == 2) {
                                    SS4.set_courseObj2(Course2);
                                } else if (courseNo == 3) {
                                    SS4.set_courseObj2(Course3);
                                } else if (courseNo == 4) {
                                    SS4.set_courseObj2(Course4);
                                } else if (courseNo == 5) {
                                    SS4.set_courseObj2(NullCourse);
                                } else {
                                    System.out.println("Invalid Course Number !");
                                }
                                SS4.update_StudentInfo(stuid, stuname, stuaddress, studob, stusex, stutel, stuage, stugpa);
                                System.out.println("\nStudent Information Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else {
                                System.out.println("Invalid Student Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                            }
                        } else if (StuFunc >= 4) {
                            System.out.println("Invalid Function !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 2:
                        System.out.println("Select Student: ");
                        System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004");
                        ParFunc = scanner.nextInt();
                        if (ParFunc == 1) {
                            JS1.get_parentObj1().parentData();
                            JS1.get_parentObj2().parentData();
                            System.out.println("Parents Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (ParFunc == 2) {
                            JS2.get_parentObj1().parentData();
                            JS2.get_parentObj2().parentData();
                            System.out.println("Parents Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (ParFunc == 3) {
                            JS3.get_parentObj1().parentData();
                            JS3.get_parentObj2().parentData();
                            System.out.println("Parents Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (ParFunc == 4) {
                            JS4.get_parentObj1().parentData();
                            JS4.get_parentObj2().parentData();
                            System.out.println("Parents Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else {
                            System.out.println("Invalid Student !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 3:
                        System.out.println("Enter Referee No(1-4): ");
                        BRFunc = scanner.nextInt();
                        if (BRFunc == 1) {
                            BR1.display_BatchRefree();
                            System.out.println("Referee Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (BRFunc == 2) {
                            BR2.display_BatchRefree();
                            System.out.println("Referee Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (BRFunc == 3) {
                            BR3.display_BatchRefree();
                            System.out.println("Referee Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (BRFunc == 4) {
                            BR4.display_BatchRefree();
                            System.out.println("Referee Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else {
                            System.out.println("Invalid Referee No: ");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 4:
                        System.out.println("Enter Junior Student No: ");
                        System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004");
                        JRSFunc = scanner.nextInt();
                        if (JRSFunc == 1) {
                            JS1.display_Student();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (JRSFunc == 2) {
                            JS2.display_Student();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (JRSFunc == 3) {
                            JS3.display_Student();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (JRSFunc == 4) {
                            JS4.display_Student();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else {
                            System.out.println("Invalid Junior Student Number !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 5:
                        System.out.println("Enter Senior Student No: ");
                        System.out.println("1.SS001\n2.SS002\n3.SS003\n4.SS004");
                        SRSFunc = scanner.nextInt();
                        if (SRSFunc == 1) {
                            SS1.display_Student();
                            System.out.println("Senior Student Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (SRSFunc == 2) {
                            SS2.display_Student();
                            System.out.println("Senior Student Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (SRSFunc == 3) {
                            SS3.display_Student();
                            System.out.println("Senior Student Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (SRSFunc == 4) {
                            SS4.display_Student();
                            System.out.println("Senior Student Data Retrieved Successfully !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else {
                            System.out.println("Invalid Senior Student Number !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 6:
                        System.out.println("Please Select the Function !");
                        System.out.println("1.Generate Total Salary\n2.Update Lecturer Salary\n3.Display Details");
                        LnDFunc = scanner.nextInt();
                        int selLec;
                        if (LnDFunc == 1) {
                            System.out.println("Select Lecturer:");
                            System.out.println("1.L001\n2.L002\n3.L003\n4.L004\n5.D001");
                            selLec = scanner.nextInt();
                            if (selLec == 1) {
                                L1.TotSalary();
                                System.out.println("Salary Generated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selLec == 2) {
                                L2.TotSalary();
                                System.out.println("Salary Generated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selLec == 3) {
                                L3.TotSalary();
                                System.out.println("Salary Generated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selLec == 4) {
                                L4.TotSalary();
                                System.out.println("Salary Generated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else if (selLec == 5) {
                                D1.TotSalary();
                                System.out.println("Salary Generated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else {
                                System.out.println("Invalid Lecturer !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (LnDFunc == 2) {
                            System.out.println("Select Lecturer: ");
                            System.out.println("1.L001\n2.L002\n3.L003\n4.L004\n5.D001");
                            selLec = scanner.nextInt();
                            double lecbs, lecallo, dallow;
                            if (selLec == 1) {
                                System.out.println("Enter New Basic Salary: ");
                                lecbs = scanner.nextDouble();
                                System.out.println("Enter New Basic Allowance: ");
                                lecallo = scanner.nextDouble();
                                L1.update_Salary(lecbs, lecallo);
                                System.out.println("Salary Updated !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 2) {
                                System.out.println("Enter New Basic Salary: ");
                                lecbs = scanner.nextDouble();
                                System.out.println("Enter New Basic Allowance: ");
                                lecallo = scanner.nextDouble();
                                L2.update_Salary(lecbs, lecallo);
                                System.out.println("Salary Updated !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 3) {
                                System.out.println("Enter New Basic Salary: ");
                                lecbs = scanner.nextDouble();
                                System.out.println("Enter New Basic Allowance: ");
                                lecallo = scanner.nextDouble();
                                L3.update_Salary(lecbs, lecallo);
                                System.out.println("Salary Updated !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 4) {
                                System.out.println("Enter New Basic Salary: ");
                                lecbs = scanner.nextDouble();
                                System.out.println("Enter New Basic Allowance: ");
                                lecallo = scanner.nextDouble();
                                L4.update_Salary(lecbs, lecallo);
                                System.out.println("Salary Updated !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 5) {
                                System.out.println("Enter New Basic Salary: ");
                                lecbs = scanner.nextDouble();
                                System.out.println("Enter New Basic Allowance: ");
                                lecallo = scanner.nextDouble();
                                System.out.println("Enter New Dean Allowance: ");
                                dallow = scanner.nextDouble();
                                D1.update_Salary(lecbs, lecallo, dallow);
                                System.out.println("Salary Updated !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            } else {
                                System.out.println("Invalid Lecturer !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (LnDFunc == 3) {
                            System.out.println("Select Lecturer: ");
                            System.out.println("1.L001\n2.L002\n3.L003\n4.L004\n5.D001");
                            selLec = scanner.nextInt();
                            if (selLec == 1) {
                                L1.displayData();
                                System.out.println("Lecture Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 2) {
                                L2.displayData();
                                System.out.println("Lecture Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 3) {
                                L3.displayData();
                                System.out.println("Lecture Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 4) {
                                L4.displayData();
                                System.out.println("Lecture Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selLec == 5) {
                                D1.displayData();
                                System.out.println("Dean Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Lecturer !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (LnDFunc >= 4) {
                            System.out.println("Invalid Function !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 7:
                        System.out.println("Select Function: ");
                        System.out.println("1.Display Registration Details\n2.Delete Student");
                        StRegFunc = scanner.nextInt();
                        if (StRegFunc == 1) {
                            System.out.println("Enter Student Register Number: ");
                            System.out.println("1.REG001\n2.REG002\n3.REG003\n4.REG004\n5.REG005\n6.REG006\n7.REG007\n8.REG008");
                            selStu = scanner.nextInt();
                            if (selStu == 1) {
                                if(SR1==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else{
                                    SR1.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else if (selStu == 2) {
                                if(SR2==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else {
                                    SR2.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else if (selStu == 3) {
                                if(SR3==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else {
                                    SR3.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else if (selStu == 4) {
                                if(SR4==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else {
                                    SR4.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else if (selStu == 5) {
                                if(SR5==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else {
                                    SR5.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else if (selStu == 6) {
                                if(SR6==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else {
                                    SR6.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else if (selStu == 7) {
                                if(SR7==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else {
                                    SR7.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else if (selStu == 8) {
                                if(SR8==null) {
                                    System.out.println("Selected Student Details have already been deleted !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }
                                else {
                                    SR8.display_Registration_Details();
                                    System.out.println("\nData Retrieved Successfully !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Press any key to continue...");
                                    scanner.nextLine();
                                    scanner.nextLine();
                                }

                            } else {
                                System.out.println("Invalid Student Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (StRegFunc == 2) {
                            System.out.println("Select Student: ");
                            System.out.println("1.REG001\n2.REG002\n3.REG003\n4.REG004\n5.REG005\n6.REG006\n7.REG007\n8.REG008");
                            selStu = scanner.nextInt();
                            if (selStu == 1) {
                                SR1 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 2) {
                                SR2 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 3) {
                                SR3 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 4) {
                                SR4 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 5) {
                                SR5 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 6) {
                                SR6 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 7) {
                                SR7 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 8) {
                                SR8 = null;
                                System.out.println("Student Data Removed Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Student Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else {
                            System.out.println("Invalid Function !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 8:
                        System.out.println("Enter Course ID: ");
                        System.out.println("1.C001\n2.C002\n3.C003\n4.C004\n5.Null Course");
                        CourFunc = scanner.nextInt();
                        if (CourFunc == 1) {
                            Course1.display_CourseData();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (CourFunc == 2) {
                            Course2.display_CourseData();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (CourFunc == 3) {
                            Course3.display_CourseData();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (CourFunc == 4) {
                            Course4.display_CourseData();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else if (CourFunc == 5) {
                            NullCourse.display_CourseData();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        } else {
                            System.out.println("Invalid Course Number !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 9:
                        System.out.println("Select Function: ");
                        System.out.println("1.Display Reports\n2.Update Reports\n3.Update Report(Grade Only)");
                        RepFunc = scanner.nextInt();
                        if (RepFunc == 1) {
                            System.out.println("Select Student: ");
                            System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                            selStu = scanner.nextInt();
                            if (selStu == 1) {
                                R5.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 2) {
                                R6.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 3) {
                                R7.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 4) {
                                R8.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 5) {
                                R1.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 6) {
                                R2.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 7) {
                                R3.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selStu == 8) {
                                R4.display_Reports();
                                System.out.println("Report Printed !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Student Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (RepFunc == 2) {
                            System.out.println("Select Student: ");
                            System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                            selStu = scanner.nextInt();
                            scanner.nextLine();
                            String repid, repgrade;
                            if (selStu == 1) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R5.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 2) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R6.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 3) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R7.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 4) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R8.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 5) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R1.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 6) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R2.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 7) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R3.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 8) {
                                System.out.println("Enter New Report ID: ");
                                repid = scanner.nextLine();
                                System.out.println("Enter New Report Grade: ");
                                repgrade = scanner.nextLine();
                                R4.update_Reports(repid, repgrade);
                                System.out.println("Report Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Student Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                            }
                        } else if (RepFunc == 3) {
                            System.out.println("Select Student: ");
                            System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                            selStu = scanner.nextInt();
                            scanner.nextLine();
                            String reportgrade;
                            if (selStu == 1) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R5.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 2) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R6.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 3) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R7.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 4) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R8.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 5) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R1.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 6) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R2.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 7) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R3.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else if (selStu == 8) {
                                System.out.println("Enter New Report Grade: ");
                                reportgrade = scanner.nextLine();
                                R4.set_repGrade(reportgrade);
                                System.out.println("Grade Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Student Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                            }
                        } else {
                            System.out.println("Invalid Function !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                        }
                        break;

                    case 10:
                        System.out.println("Select Function !");
                        System.out.println("1.Display Projects(Without Members)\n2.Display Projects(With Members)\n3.Update Members");
                        ProjFunc = scanner.nextInt();
                        int selProj;
                        if (ProjFunc == 1) {
                            System.out.println("Select Project: ");
                            System.out.println("1.P001\n2.P002\n3.P003");
                            selProj = scanner.nextInt();
                            if (selProj == 1) {
                                P1.display_BasicProject();
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selProj == 2) {
                                P2.display_BasicProject();
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selProj == 3) {
                                P3.display_BasicProject();
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Project Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (ProjFunc == 2) {
                            System.out.println("Select Project: ");
                            System.out.println("1.P001\n2.P002\n3.P003");
                            selProj = scanner.nextInt();
                            if (selProj == 1) {
                                P1.display_Projects();
                                System.out.println("Project Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selProj == 2) {
                                P2.display_Projects();
                                System.out.println("Project Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selProj == 3) {
                                P3.display_Projects();
                                System.out.println("Project Data Retrieved Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Project Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else if (ProjFunc == 3) {
                            System.out.println("Select Project: ");
                            System.out.println("1.P001\n2.P002\n3.P003");
                            selProj = scanner.nextInt();
                            int selStud;
                            Student student1, student2, student3, student4;
                            if (selProj == 1) {
                                System.out.println("Select Member 1:");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student1 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student1 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student1 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student1 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student1 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student1 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student1 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student1 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 2: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student2 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student2 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student2 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student2 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student2 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student2 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student2 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student2 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 3: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student3 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student3 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student3 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student3 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student3 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student3 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student3 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student3 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 4: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student4 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student4 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student4 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student4 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student4 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student4 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student4 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student4 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                P1.update_Members(student1, student2, student3, student4);
                                System.out.println("Project Members Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selProj == 2) {
                                System.out.println("Select Member 1:");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student1 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student1 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student1 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student1 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student1 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student1 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student1 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student1 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 2: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student2 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student2 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student2 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student2 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student2 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student2 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student2 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student2 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 3: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student3 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student3 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student3 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student3 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student3 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student3 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student3 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student3 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 4: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student4 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student4 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student4 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student4 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student4 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student4 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student4 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student4 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                P2.update_Members(student1, student2, student3, student4);
                                System.out.println("Project Members Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else if (selProj == 3) {
                                System.out.println("Select Member 1:");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student1 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student1 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student1 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student1 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student1 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student1 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student1 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student1 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 2: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student2 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student2 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student2 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student2 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student2 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student2 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student2 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student2 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 3: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student3 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student3 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student3 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student3 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student3 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student3 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student3 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student3 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                System.out.println("Select Member 4: ");
                                System.out.println("1.JS001\n2.JS002\n3.JS003\n4.JS004\n5.SS001\n6.SS002\n7.SS003\n8.SS004");
                                selStud = scanner.nextInt();
                                if (selStud == 1) {
                                    student4 = Student.get_StudentObj(JS1);
                                } else if (selStud == 2) {
                                    student4 = Student.get_StudentObj(JS2);
                                } else if (selStud == 3) {
                                    student4 = Student.get_StudentObj(JS3);
                                } else if (selStud == 4) {
                                    student4 = Student.get_StudentObj(JS4);
                                } else if (selStud == 5) {
                                    student4 = Student.get_StudentObj(SS1);
                                } else if (selStud == 6) {
                                    student4 = Student.get_StudentObj(SS2);
                                } else if (selStud == 7) {
                                    student4 = Student.get_StudentObj(SS3);
                                } else if (selStud == 8) {
                                    student4 = Student.get_StudentObj(SS4);
                                } else {
                                    System.out.println("Invalid Student Number !");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                                P3.update_Members(student1, student2, student3, student4);
                                System.out.println("Project Members Updated Successfully !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();

                            } else {
                                System.out.println("Invalid Project Number !");
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press any key to continue...");
                                scanner.nextLine();
                                scanner.nextLine();
                            }
                        } else {
                            System.out.println("Invalid Function !");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Press any key to continue...");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        break;

                    case 11:
                        System.out.println("Good Bye !!!");
                        break;

                    default:
                        System.out.println("Invalid Option ! Retry in 2 Sec...");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("\n");
                        break;
                }
            }
            else {
                System.out.println("Invalid Input ! Please Enter a Number...");
                scanner.nextLine();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\n");
            }
        }
        scanner.close();

        //Outputs in Simplified view
        //Student Class

        JS1.display_Student();
        SS1.display_Student();
        JS1.set_GPA(4.0);
        JS1.display_Student();
        JS1.update_StudentInfo(null, null, null, null, null, null, 0, 0, Course3, Course4, null, null, null, null, null, null);
        SS1.update_StudentInfo(null, null, null, null, null, null, 0, 0, Course3, Course4);


        //Parent Class

        JS1.get_parentObj1().parentData();
        JS1.get_parentObj2().parentData();


        //Batch_Refree Class

        BR1.display_BatchRefree();
        BR3.display_BatchRefree();

        //Junior_Student Class

        JS3.display_Student();
        JS2.update_StudentInfo(null, null, null, null, null, null, 0, 0, Course4, NullCourse, null, null, null, null, null, null);

        //Senior_Student Class

        SS3.update_StudentInfo(null, null, null, null, null, null, 0, 0, Course4, NullCourse);
        SS4.display_Student();

        //Lecturer Class

        L2.TotSalary();
        D1.TotSalary();
        System.out.println("\n");

        L2.displayData();
        D1.displayData();

        L2.update_Salary(80000, 50000);
        D1.update_Salary(100000, 50000, 35000);
        L2.TotSalary();
        D1.TotSalary();

        double lecSalPerYear=(L2.get_lecSal()+L2.get_basicAllowance())*12;
        System.out.println("Lecture "+L2.get_lecName()+"'s Salary Per Year is: "+lecSalPerYear);

        //Student_Registration Class

        SR1 = null;
        SR2.display_Registration_Details();
        SR1.display_Registration_Details();

        //Courses Class

        Course1.display_CourseData();
        NullCourse.display_CourseData();

        //Reports Class

        R1.display_Reports();
        R8.display_Reports();
        R8.update_Reports("R008", "F");
        R8.display_Reports();
        R8.set_repGrade("C");
        R8.display_Reports();

        //Projects Class

        P1.display_Projects();
        P3.display_BasicProject();
        P3.update_Members(JS1, SS2, JS3, SS4);
        P3.display_Projects();

    }
}
