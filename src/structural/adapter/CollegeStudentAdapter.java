package structural.adapter;

public class CollegeStudentAdapter implements Student{
   private CollegeStudent collegeStudent;

    public CollegeStudentAdapter(CollegeStudent collegeStudent) {
        this.collegeStudent = collegeStudent;
    }

    @Override
    public String getName() {
        return this.collegeStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return this.collegeStudent.getLastName();
    }
}
