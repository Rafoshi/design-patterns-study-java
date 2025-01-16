package structural.adapter;

public class CollegeStudent {
    private String name;
    private String surname;

    public CollegeStudent(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getFirstName() {
        return this.name;
    }

    public String getLastName() {
        return this.surname;
    }
}
