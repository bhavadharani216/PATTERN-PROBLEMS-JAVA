import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Upper Half
        for(int i = 1; i <= n; i++)
        {
            // Spaces
            for(int sp = 1; sp <= n-i; sp++)
            {
                System.out.print(" ");
            }

            // Hollow Part
            for(int j = 1; j <= 2*i-1; j++)
            {
                if(j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower Half
        for(int i = n-1; i >= 1; i--)
        {
            // Spaces
            for(int sp = 1; sp <= n-i; sp++)
            {
                System.out.print(" ");
            }

            // Hollow Part
            for(int j = 1; j <= 2*i-1; j++)
            {
                if(j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
