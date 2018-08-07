package Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yulya.Maksymiv_qa on 07.08.2018.
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
        this.Courses = new ArrayList<>();
    }

    public List<String> getCourses() {
        return Courses;
    }

    private List<String> Courses;


    public void applyCourse(String courseName) {
        Courses.add(courseName);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "I`m student " + this.name + "Appled courses " + Courses;
    }
}
