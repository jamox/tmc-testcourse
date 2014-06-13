
import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        // tee koodi tanne

        // STUB: return -1;

        // BEGIN SOLUTION
        if ( n==0 ) return 0;

        int[] t = new int[n+1];
        t[0] = 0;
        t[1] = 1;
        for ( int i=2; i<n+1; i++)
            t[i] = t[i-1]+t[i-2];

        return t[n];
        // END SOLUTION

    }
    

    public static Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n: ");
        int n = lukija.nextInt();
        System.out.println("F(n): " + fibonacci(n) );
    }
}
