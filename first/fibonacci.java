package first;
import java.util.Scanner;
public class fibonacci {
    public static void main(String arg[]){
    int n,a=0,b=1,c;
    System.out.println("Enter the Number");
    Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(int i=0;i<=n;i++){
        System.out.print(a+ " ");
        c=a+b;
        a=b;
        b=c;
     }
    }
    
}
