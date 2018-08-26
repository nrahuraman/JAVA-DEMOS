import java.io.*;
import java.util.Scanner;

abstract class Shape
{
  Scanner s=new Scanner(System.in);
  int l1,l2;
  abstract void printarea();
}


class Rectangle extends Shape
{
  int a;
  void printarea()
  {
    Rectangle obj=new Rectangle();

    a=obj.l1*obj.l2;
    System.out.println("area="+a);
  }
}
class Circle extends Shape
{
  double a;
  void printarea()
  {
    Circle obj=new Circle();

    a=3.14*obj.l1;
    System.out.println("area="+a);
  }
}
class Triangle extends Shape
{
  double a;
  void  printarea()
  {
    Triangle obj3=new Triangle();
    obj3.l1=s.nextInt();
    obj3.l2=s.nextInt();

    a=0.5*obj3.l1*obj3.l2;
System.out.println("area="+a);
  }
}

class Area
{
public static void main(String[] args)
{
  int n;
  System.out.println("ENTER YOUR OPTION AREA FOR \n1.TRIANGLE\n2.CIRCLE\n3.RECTANGLE");
  Scanner m=new Scanner(System.in);
  n=m.nextInt();
  Shape obj2=new Circle();

  switch(n)
  {
    case 1:
      Rectangle obj1=new Rectangle();
      System.out.println("ENTER THE LENGTH AND BREATH VALUES");
      obj1.l1=m.nextInt();
      obj1.l2=m.nextInt();
      break;
    case 2:
      System.out.println("ENTER THE RADIUS OF THE CIRCLE");
      obj2.l1=m.nextInt();
      break;
    case 3:
      Shape obj3=new Triangle();
      System.out.println("ENTER THE HEIGHT AND BREATH OF THE TRIANGLE");
      obj3.printarea();
      break;

}
}

}
