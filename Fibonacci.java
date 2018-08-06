import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter how many Fibonacci numbers you want to get");
        Scanner n = new Scanner(System.in);
        int num = Integer.parseInt(n.nextLine());
        int fib=1;
        int g=0; // i-1 number
        int j=0; // i-2 number
        System.out.println("The Fibonacci sequence is as follows:");
        System.out.print(fib);
        for(int i=0; i<num-2; i++)
        {
            g = j;
            j = fib;
            fib = fib + g;
            System.out.print(fib);
        }
    }
}
