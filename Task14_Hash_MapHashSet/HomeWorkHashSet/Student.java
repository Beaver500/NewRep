package Task14_Hash_MapHashSet.HomeWorkHashSet;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentId;


//    private HashSet<Student> studentSet = new HashSet<>();


    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "   - " + name + ", " + group + ", " + studentId;
    }

 /*   public void addStudent(Student student) {
        if (studentSet.contains(student)) {
            System.out.println("Такой студент уже есть в списке! Повторите ввод!");
        } else {
            studentSet.add(student);

//            check
            System.out.println("Количество записей: "+studentSet.size());
        }
    }*/


   /* public void printStudents() {
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }*/


}
