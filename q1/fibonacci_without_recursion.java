import java.util.Scanner;
class fibonacci_without_recursion{
   public static void main(String args[]){
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      if(n>0){
      int a[]=new int[n];
      if(n==1){
        a[0]=0;
      }else{
         a[0]=0;
         a[1]=1;
         for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
         }
      }
      for(int i=0;i<n;i++){
         System.out.println(a[i]);
      }
      }
}
}