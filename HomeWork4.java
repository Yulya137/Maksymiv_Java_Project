import java.util.Scanner;


    abstract class  Human {

        private String name;
        public void sleep()
        {
            System.out.print("I sleep");
        }


         }

    class Men extends Human implements iTalk
    {
        @Override
        public void talk()
        {
            System.out.print("I talk");
        }
    }
    public interface iTalk
    {
        public void talk();

    }


    public static void main(String[] args) {
       Men aragorn = new Men();
        aragorn.talk();
        aragorn.sleep();
    }
