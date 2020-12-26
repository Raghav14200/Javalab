import java.util.*;
import java.io.*; 
import java.lang.*; 
class personal{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of Employees");
	int n=sc.nextInt();
	personal2 b[]=new personal2[n];
	for(int i=0;i<n;i++){
	System.out.println("Enter the name of Employee ");
	sc.nextLine();	
	String name=sc.nextLine();
	System.out.println("Enter the age of Employee ");
	int age=sc.nextInt();
	System.out.println("Enter the salary of Employee ");
	int salary=sc.nextInt();			
	System.out.println("Enter the years_of_experience of Employee ");
	int years_of_experience=sc.nextInt();
	System.out.println("Enter the education of Employee ");
	sc.nextLine();
	String education=sc.nextLine();
	System.out.println("Enter the no of loans taken by Employee ");
	int no_of_loans=sc.nextInt();			
	System.out.println("Enter the loan amount required by Employee ");
	int loan_amount=sc.nextInt();
	b[i]=new personal2(age,salary,name,years_of_experience,no_of_loans,loan_amount,education);			
}
System.out.print("\n");
for(int i=0;i<n;i++){
	b[i].display();
}
}
}
class personal2{
	
	private int age;
	private String name;
	private int salary;
	private int years_of_experience;
	private int no_of_loans;
	private int loan_amount;
	private String education;
        public int x=1;

	public personal2(int age,int salary,String name,int years_of_experience,int no_of_loans,int loan_amount,String education){
	this.age=age;
	this.salary=salary;
	this.name=name;
	this.years_of_experience=years_of_experience;
	this.no_of_loans=no_of_loans;
	this.loan_amount=loan_amount;
	this.education=education;
	}
	
	public void isEligible(){
		if(this.no_of_loans<3 && this.loan_amount<500000){
			System.out.println(name+" is eligible for loan");		
		}else{
			System.out.println(name+" is not eligible for loan");
		}
	}
	
	public void taxpay(){
		if(this.salary>100000){
		System.out.println(name+" should pay tax of rupees "+0.3*this.salary);
	}else{
		System.out.println(name+" should pay tax of rupees 0");
	}
}
	
	public void isEligiblePromotion(){
	if(this.years_of_experience>5){
		System.out.println(name+" is eligible for promotion");	
	}else{
		System.out.println(name+" is not eligible for promotion");
	}
        }

	void display(){
	System.out.println("Name of Employee "+" is "+this.name);
	System.out.println("Age of Employee "+" is "+this.age);
	System.out.println("Salary of Employee "+" is "+this.salary);			
	System.out.println("Years_of_experience of Employee "+" is "+this.years_of_experience);
	System.out.println("Education of Employee "+" is "+this.education);
	System.out.println("No of loans taken by Employee "+" is "+this.no_of_loans);
	System.out.println("loan amount required by Employee "+" is "+this.loan_amount);
	this.isEligible();
	this.taxpay();
	this.isEligiblePromotion();
	System.out.print("\n");
}
}

