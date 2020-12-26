import java.util.*;
class stack{
public static void main(String args[]){
stack2 one=new stack2();
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("1:Push 	2:Pop	 3:display	4:Exit");
int k=sc.nextInt();
switch(k){
case 1:System.out.println("Enter the element to be inserted");
	int j=sc.nextInt();
	one.push(j);
	break;
case 2:one.pop();
	break;
case 3:one.display();
	break;
case 4:System.exit(0);
}

}
}

}

class stack2{
int top=-1;
int a[]=new int[100];

void push(int n){
if(this.top==99){
	System.out.println("Stack is full");
}else{
	this.top=this.top+1;
	a[this.top]=n;
	System.out.println("Push is successful");
}
}

void pop(){
	if(this.top==-1){
	System.out.println("Stack is Empty");
}else{
	int tmp=a[this.top];
	this.top=this.top-1;
	System.out.println("the remove element is "+tmp);
}
}

void display(){
	for(int i=0;i<=this.top;i++){
		System.out.println(a[i]);
	}
	
}
}
