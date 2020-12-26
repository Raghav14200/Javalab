import java.util.*;
class bubblesort{
	public static void main(String args[]){
	System.out.println("Enter the size of array and their values");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
}
	int t=n;
	for(int i=0;i<t;t--){
		for(int j=0;j<t-1;j++){
			if(a[j]>a[j+1]){
				int tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
}
}
}
for(int i=0;i<n;i++){
	System.out.println(a[i]);
}
}
}
