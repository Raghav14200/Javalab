import java.util.Scanner;

class stack2{
   int size;
   int top;
   int a[];
   stack2(int size){
      this.size=size;
      a=new int[size];
      this.top=-1;
   }
   public void push(int ele){
      if(top==this.size-1){
         System.out.println("Stack is Full");
      }else{
         this.top=this.top+1;
         this.a[this.top]=ele;
         System.out.println("Element is inserted into stack");
      }
   }
   public void pop(){
      if(top==-1){
         System.out.println("Stack is Empty");
         return;
      }
      int ele=this.a[this.top];
      this.top=this.top-1;
      System.out.println("The element popped is"+ele);
   } 

   public void display(){
      if(top==-1){
         System.out.println("Stack is empty");
         return;
      }
      for(int i=this.top;i>=0;i--){
         System.out.print(this.a[i]+" ");
      }
      System.out.println("");
   }
}

class stack{
   public static void main(String args[]){
      stack2 b=new stack2(7);
      Scanner sc=new Scanner(System.in);
      while(true){
         int n;
         System.out.println("1.Push    2.Pop    3.display    4.exit ");
         n=sc.nextInt();
         switch(n){
            case 1:System.out.println("Enter the element to be pushed");
                      int k;
                      k=sc.nextInt();
                      b.push(k);
                      break;
            case 2:b.pop();
                     break;
            case 3:b.display();
                     break;
            default:System.exit(0);
                     break;
         }
      }
   }

}