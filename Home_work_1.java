import java.util.Scanner;
public class kjho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner strin = new Scanner(System.strin);

        System.out.println("Yulya Maksymiv");

        System.out.println("Hello please enter the number");
        int b = in.nextInt();
        System.out.println (b);
        if (b < 10) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

       //----------------------------------------------
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String phrase1 = sc.nextLine();
        for (int i=0; i< phrase1.length(); i++)
                {
                    System.out.println(phrase1.charAt(i));
        }

        //----------------------------------------
        System.out.println("Enter your surname");
        Scanner scc = new Scanner(System.in);
        String phrase2 = scc.nextLine();
        int i=0;
       while (i< phrase2.length())
        {
            System.out.println(phrase2.charAt(i));
            i++;
        }
        //System.out.println(phrase1);
        //int[] nums = new int[100];
        //for(int i=0;i < nums.length; i++){
          //  nums[i]=myname.nextInt();
        //}

    }}
