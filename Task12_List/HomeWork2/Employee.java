package Task12_List.HomeWork2;

public class Employee {


    private String surname;
    private String name;
    private String age;
    private String gender;
    private String education;
    private String position;
    private String theDepartment;

    public Employee(String surname, String name, String age, String gender, String education, String position, String theDepartment) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.position = position;
        this.theDepartment = theDepartment;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTheDepartment() {
        return theDepartment;
    }

    public void setTheDepartment(String theDepartment) {
        this.theDepartment = theDepartment;
    }

    @Override
    public String toString() {
        return String.format("%5s%9s%6s%13s%11s%21s%12s", surname, name, age, gender, education, position, theDepartment);// остановился на  education -%12s

    }
}
