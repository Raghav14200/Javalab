import java.util.Scanner;
class bubble_sort{
   public static void main(String args[]){
      int n;
      System.out.println("Enter total no of elements in array");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter  elements in array");
      for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
      }
      int t=n;
      for(int i=0;i<t;t--){
         for(int j=0;j<t-1;j++){
            if(a[j]>a[j+1]){
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
            }
         }
      }
      System.out.println("The sorted array is");
      for(int i=0;i<n;i++){
         System.out.println(a[i]);
      }
   }
}