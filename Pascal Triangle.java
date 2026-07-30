import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            // Spaces
            for(int sp = 1; sp <= n - i; sp++)
            {
                System.out.print(" ");
            }

            int num = 1;

            // Numbers
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");

                num = num * (i - j) / j;
            }

            System.out.println();
        }
    }
}
