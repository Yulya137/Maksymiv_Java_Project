import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Yulya.Maksymiv_qa on 31.07.2018.
 */

public class TestException {
    public static void main(String[] args) {
        List<Integer> listValue = new ArrayList<>();
        listValue.add(1);
       if (listValue.size()>0)
           System.out.println(listValue);
       else
           throw new RuntimeException("List is empty");
       //double t = Math.sqrt(val);

    }
}