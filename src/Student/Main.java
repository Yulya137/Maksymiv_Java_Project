package Student;

/**
 * Created by Yulya.Maksymiv_qa on 07.08.2018.
 */
public class Main {


    public static void main(String[] args) {
        Student Yulya = new Student("Yulya");
        System.out.println(Yulya.getName());

        Yulya.applyCourse("Math");
        Yulya.applyCourse("Phisyc");
        Yulya.applyCourse("Java");
        System.out.println(Yulya.toString());

        MasterStudent Yullia = new MasterStudent("Yliia");
        Yullia.applyCourse("OOP");
        Yullia.applyCourse("Analitic Math");
        System.out.println(Yullia.toString());


    }
}