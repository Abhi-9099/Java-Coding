package first;
public class factorials {
    int fun(){
    int n=5;
    int fact=1;
    for(int i=1;i<=n;i++){
fact*=i;
    }
     return fact;
}
    public static void main(String arg[]){
    factorials obj=new factorials();
     System.out.println("Factorial Number is");
    System.out.println(obj.fun());
    obj.fun();
    }
    
}
