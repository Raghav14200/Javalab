import  java.util.Scanner;
import java.lang.Math.*;
class primeno{
   public static void main(String args[]){
      int n;
      System.out.println("Enter the element to be checked");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n<2){
         System.out.println("Not a Prime no");
         return;
      }
      for(int i=2;i<=Math.sqrt(n);i++){
         if((n%i)==0){
            System.out.println("Not a Prime no");
            return;
         }
      }
      System.out.println("It is  a Prime no");
   }
}