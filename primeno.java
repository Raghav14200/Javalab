import java.util.*;
import java.lang.Math.*;
class primeno{
	public static void main(String args[]){
	System.out.println("Enter the no n");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=2;i<=Math.sqrt(n);i++){
		if(n%i==0){
			System.out.println("It is not a Prime no");
			return;
}
}
System.out.println("It is a prime no");
}
}
