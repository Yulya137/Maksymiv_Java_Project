public class Animal {
    int number_of_paws;
    String  say;
    String name;

    int paws ()
    {
        System.out.println("Number of paws is "+number_of_paws);
       return number_of_paws;

    }

    String Name ()
    {
        System.out.println("Name is "+name);
        return name;

    }

    String Say ()
    {
        System.out.println("This animal says "+say);
        return say;

    }

    public static void main(String []args) {

        Animal Dog = new Animal();

       Dog.number_of_paws = 4;
       Dog.name = "Tuzik";
       Dog.say = "gaf";
       Dog.Name();
       Dog.paws();
       Dog.Say();




    }
    }


