package structural.adapter;

public class SchoolStudent implements Student{
    private String name;
    private String surname;

    public SchoolStudent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }
}
