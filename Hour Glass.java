import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Upper Half (Inverted Pyramid)
        for(int i = 1; i <= n; i++)
        {
            // Spaces
            for(int sp = 1; sp <= i - 1; sp++)
            {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= 2 * (n - i) + 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half (Pyramid)
        for(int i = 2; i <= n; i++)
        {
            // Spaces
            for(int sp = 1; sp <= n - i; sp++)
            {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
