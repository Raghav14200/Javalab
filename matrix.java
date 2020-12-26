import java.util.*;
class matrix{
	public static void main(String args[]){
		System.out.println("Enter no of rows in first matrix");
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		System.out.println("Enter no of columns in first matrix");
		int c1=sc.nextInt();
		System.out.println("Enter no of columns in second matrix");
		int c2=sc.nextInt();
		matrix2 one=new matrix2(r1,c1);
		matrix2 two=new matrix2(c1,c2);
		one.getdata();
		two.getdata();
		one.multiply(two);
}
}

class matrix2{
private int a[][];
private int row;
private int column;

matrix2(int r,int c){
this.row=r;
this.column=c;
this.a=new int[r][c]; 
}

void getdata(){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter elements of matrix");
	for(int i=0;i<this.row;i++){
		for(int j=0;j<this.column;j++){
			this.a[i][j]=s.nextInt();
}
}
}

void multiply(matrix2 c){
	int b[][]=new int[this.row][c.column];
	for(int i=0;i<this.row;i++){
		for(int j=0;j<c.column;j++){
			b[i][j]=0;
			for(int k=0;k<this.column;k++){
				b[i][j]+=this.a[i][k]*c.a[k][j];
}
		}
}
	System.out.println("The resultant Matrix is");
		for(int i=0;i<this.row;i++){
		for(int j=0;j<c.column;j++){
			System.out.print(b[i][j]+"  ");

}
	System.out.print("\n");
}
}

}
