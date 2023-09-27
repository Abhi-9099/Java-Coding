package first;
import java.util.Scanner;
public class palidone1 {

	public static void main(String args[]) {
		
		    int n,rem,sum=0,temp;
		    Scanner sc=new Scanner(System.in);
		     
		     System.out.println("Enter a number");
		     n=sc.nextInt();
		         temp=n;
		         while(n>0){
		            rem=n%10;
		            sum=(sum*10)+rem;
		            n=n/10;
		         }
		         if(temp==sum){
		        System.out.println("Palindron Number");
		         }
		         else{
		            System.out.println("Not Palindron");
		         }
		}
		}
	

