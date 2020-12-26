import java.util.*;
public class Complex
{
    double a1, b1, a2, b2;
    Scanner sc = new Scanner(System.in);
    Complex()
    {
        a1=a2=b1=b2=0.0;
    }
    void input()
    {
        System.out.println("Complex numbers of the form a+ib('a' is real part and 'b' is imaginary part)");
        System.out.print("Enter real part for first complex number: ");
        a1 = sc.nextDouble();
        System.out.print("Enter imaginary part for first complex number: ");
        b1 = sc.nextDouble();
        System.out.print("Enter real part for second complex number: ");
        a2 = sc.nextDouble();
        System.out.print("Enter imaginary part for second complex number: ");
        b2 = sc.nextDouble();
    }
    void sum()
    {
        System.out.println("Sum = "+ (a1+a2)+" + i("+(b1+b2)+")");
    }
    void diff()
    {
        System.out.println("Difference = "+ (a1-a2)+" + i("+(b1-b2)+")");
    }
    void product()
    {
        System.out.println("Product = "+ (a1*a2-b1*b2)+" + i("+(a2*b1+a1*b2)+")");
    }
    public static void main(String args[])
    {
        Complex obj = new Complex();
        obj.input();
        obj.sum();
        obj.diff();
        obj.product();
    }
}