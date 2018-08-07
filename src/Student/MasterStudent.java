package Student;

/**
 * Created by Yulya.Maksymiv_qa on 07.08.2018.
 */
public class MasterStudent extends Student {
    public MasterStudent(String name) {
        super(name);
    }
    public String toString() {
        return "I`m master student " + getName() + " Appled courses " + getCourses();
    }
}
