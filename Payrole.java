import java.io.*;
import java.util.Scanner;

class Employee
{
  int n,emid;long emno;
  String emeid,emnam;
  Scanner s=new Scanner(System.in);
void inputs()
  {

    System.out.println("ENTER EMPLOYEE NAME:");
    emnam=s.next();
    System.out.println("ENTER EMPLOYEE ID");
    emid=s.nextInt();
    System.out.println("ENTER EMPLOYEE EMAIL ID");
    emeid=s.next();
    System.out.println("ENTER EMPLOYEE MOBILE NO");
    emno=s.nextLong();

  }
}

class Programmer extends Employee
{
  double bp,da,hra,pf,cbfn;


  void calculate()
  {
    Programmer obj=new Programmer();
    Programmer.inputs();
    System.out.println("ENTER YOUR BASIC PAY Mr."+obj.emid);
    bp=s.nextDouble();
    da=bp*0.97;
    hra=bp*0.10;
    pf=bp*0.12;
    cbfn=bp*0.01;
    display();
  }
  void display()
  {
    System.out.println("THIS IS ");
    System.out.println("DA"+da);
    System.out.println("HRA"+hra);
    System.out.println("PF"+pf);
    System.out.println("CLUB FUND"+cbfn);

  }

}
class Assistantprofessor extends Employee
{

}
class Associateprofessor extends Employee
{

}
class Professor extends Employee
{

}
class Start extends Employee
{
  void in()
  {
    int n;
      System.out.println("ENTER THE DESIGNATION\n1.PROGRAMMER\t2.ASSOCIATE PROFESSOR\t3.ASSISTANT PROFESSOR\t4.PROFESSOR");
      n=s.nextInt();
     switch(n)
      {
        case 1:
           System.out.println("thisis ");
           Programmer d1=new Programmer();
           d1.calculate();
           break;
      /*  case 2:
          Associateprofessor d2=new Associateprofessor();
          d2.calculate();
          break;
        case 3:
          Assistantprofessor d3=new Assistantprofessor();
          d3.calculate();
          break;
        case 4:
          Professor d4=new Professor();
          d4.calculate();
          break;*/
        default :
           System.out.println("INVALID OPTION");


      }
  }

}

class Payrole extends Employee
{
  public static void main(String[] args)
  {
    Start b=new Start();
    b.in();
  }
}
