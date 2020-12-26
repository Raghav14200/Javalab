import java.util.*;
class fibonnacii_recursion{
	public static void main(String args[]){
		System.out.println("Enter The value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=1;i<=n;i++){
		System.out.println(fibonnacii_recursion.fibon(i));		
}		
}
static int fibon(int n){
if(n>0){
	if(n==1||n==2){
		return n-1;	
	}
	return fibon(n-1)+fibon(n-2);
}
return -1;
}
}
