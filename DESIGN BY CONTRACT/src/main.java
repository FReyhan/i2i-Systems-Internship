

public class main {
    public static void main(String[] args){
       student student1=new student(16,06,3.7,23);

        assert student1.id >40 : "Group A";
        assert student1.id <=40 && student1.id<80: "Group B";
        assert student1.departmentId==11 : "This student is not a computer engineering student.";
        assert student1.GPA<3.5  : "Can do double major.";
        assert student1.credit<20:"Can take lessons from upper class.";


    }
}
