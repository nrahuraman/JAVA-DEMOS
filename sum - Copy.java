import java.io.*;
import java.util.Scanner;


class One
{
  double bp;
  Scanner s=new Scanner(System.in);
  void inputs()
  {
    System.out.println("enter bp");
    bp=s.nextDouble();
  }
}

class Sum extends One
{
    void hey()
     {
    Sum obj=new Sum();
    obj.inputs();
    System.out.println("your bp is"+obj.bp);
  }
}

class Hey
{
  public static void main(String[] args) {
    Sum b=new Sum();
    b.hey();
  }
}
