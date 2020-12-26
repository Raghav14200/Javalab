import java.util.Scanner;

abstract class Vehicle {

  int year_of_manufacture;

  Vehicle(int a) {
    this.year_of_manufacture = a;
  }

  abstract int getData();

  abstract void putData(int a);
}

class TwoWheeler extends Vehicle {

  TwoWheeler(int a) {
    super(a);
  }

  int getData() {
    return this.year_of_manufacture;
  }

  void putData(int a) {
    this.year_of_manufacture = a;
  }
}

final class FourWheeler extends Vehicle {

  FourWheeler(int a) {
    super(a);
  }

  int getData() {
    return this.year_of_manufacture;
  }

  void putData(int a) {
    this.year_of_manufacture = a;
  }
}

class MyTwoWheeler extends TwoWheeler {

  MyTwoWheeler(int a) {
    super(a);
  }

  void putData(int a) {
    super.putData(a);
  }
}

public class inherit{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MyTwoWheeler mtw = new MyTwoWheeler(0);
    System.out.print("Enter the year of manufacture of your two wheeler:\n");
    int a = sc.nextInt();
    mtw.putData(a);
    System.out.println(
      "The year of manufacture of my two wheeler is:" + mtw.getData()
    );
    System.out.println("");
    System.out.print("Enter the year of manufacture of the four wheeler:\n");
    int b = sc.nextInt();
    FourWheeler fw = new FourWheeler(b);
    System.out.println(
      "The year of manufacture of the four wheeler is: " + fw.getData()
    );
  }
}