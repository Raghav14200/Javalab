import java.util.*;
class fibonnacii{
	public static void main(String args[]){
		System.out.println("Enter the n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1 || n==2){
			System.out.println(n-1);
	}else{
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++){
			a[i]=a[i-1]+a[i-2];
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}

}
}
}
