package ab1at2;

public class University {
    int FndYear;
    String UnName;
    Student[] students;



    University(String UnName,int FndYear,Student[] students) {
        this.FndYear = FndYear;
        this.UnName = UnName;
        this.students = students;
    }
}
