import java.util.*;
class account{
private int accno;
		private String name;
		private int phone_no;
		private float balance_amt;

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		account one=new account();
		one.getinput();
		System.out.println("");
		one.printoutput();
		System.out.println("");
		int x;
		do{
		System.out.println("1:deposit  2:withdraw 	3:account information	 4:exit");
		x=sc.nextInt();
		switch(x){
		case 1:System.out.println("Enter the amount to be deposited");
			int y=sc.nextInt();
			one.deposit(y);
			break;
		case 2:System.out.println("Enter the amount to be withdraw");
			y=sc.nextInt();
			one.withdraw(y);
			break;
		case 3:one.printoutput();
			break;
		case 4:System.exit(0);
}
	}while(x!=4);
	}
		
	public void getinput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter your accno");
		accno=sc.nextInt();
		System.out.println("Enter your phone no");
		phone_no=sc.nextInt();
		System.out.println("Enter your balance");
		balance_amt=sc.nextFloat();
}
	public void deposit(int n){
		if(n>0){
		this.balance_amt=this.balance_amt+n;
}
}
	public void withdraw(int n){
		if(n>0 && n<=this.balance_amt){
		this.balance_amt=this.balance_amt-n;
	}
}
	public void printoutput(){
	System.out.println("name: " +this.name);
	System.out.println("accno: " +this.accno);
	System.out.println("phone no: "+ this.phone_no);
	System.out.println("balance amount: "+ this.balance_amt);
}
}
	
