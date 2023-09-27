package first;
import java.util.Scanner;
public class factorial {
int fact=1;
int fun(){
	System.out.println("Enter the number");
	Scanner Sc = new Scanner(System.in);
	int n=Sc.nextInt();
	
	for(int i=1;i<=n;i++){
fact*=i;
}
return fact; 
}
	public static void main(String[] args) {
		factorial obj=new factorial();
		System.out.println(obj.fun());
		obj.fun();
	}

}
