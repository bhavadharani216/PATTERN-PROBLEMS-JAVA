package 23;
import java.util.Scanner;
 
public class Solution {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            
            for(int j=i;j>=1;j--){
                char ch=(char)('A'+j-1);
                System.out.print(ch);
                
            }
            System.out.println();
        }
}
    
}
