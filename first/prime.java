package first;
import java.util.Scanner;
public class prime {
 int n,count=0;
void fun(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
public static void main(String arg[]){
    prime obj=new prime();
   
    obj.fun();
}
    
}
