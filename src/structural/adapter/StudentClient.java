package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentsList(){
        List<Student> students = new ArrayList<Student>();

        CollegeStudent collegeStudent = new CollegeStudent("a", "b");
        SchoolStudent schoolStudent = new SchoolStudent("c", "d");

        students.add(schoolStudent);
        students.add(new CollegeStudentAdapter(collegeStudent));

        return students;
    }
}
