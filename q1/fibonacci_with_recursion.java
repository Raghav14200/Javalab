import java.util.*;

public class fibonacci_with_recursion{
      public static void main(String args[]){
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of n");
         n=sc.nextInt();
         for(int i=1;i<=n;i++)
         System.out.println(fibonacci(i));
      }
      static int fibonacci(int a){
         if(a>0){
            if(a==1 || a==2){
                  return a-1;
            }else{
               return fibonacci(a-1)+fibonacci(a-2);
            }
         }
         return -1;
      }
}