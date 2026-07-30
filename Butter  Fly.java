
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int sp=1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        for(int i=n-1;i>=1;i--){
            //space
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int sp=1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
