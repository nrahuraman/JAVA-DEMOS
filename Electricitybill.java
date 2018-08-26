//JAVA PROGRAM FOR ELECTRICITY BILL

import java.io.*;
import java.util.Scanner;


public class Electricitybill
{
    public static void main(String[] args)
  {
    inputs();

  }
  public  static void inputs()
    {
	     System.out.println("ENTER YOU CONSUMER NO: ");
       int cn,cmr,lmr,typ=0;
	     Scanner s=new Scanner(System.in);
          cn=s.nextInt();
	     System.out.println("ENTER YOUR NAME:");
	     String cnam=s.next();
      System.out.println("ENTER YOUR LAST MONTH READINGS");
          lmr=s.nextInt();
      System.out.println("ENTER YOUR CURRENT MONTH READINGS");
          cmr=s.nextInt();
      System.out.println("ENTER THE TYPE OF CONNECTION \n 0-DOMESTIC \n 1-OTHER");
          typ=s.nextInt();
      System.out.println("=================THE BILL AMOUNT================");

      calculate(cnam,cn,lmr,cmr,typ);
      }
public static void calculate(String cnam,int cn,int lmr,int cmr,int typ)
{
      int units;
      double bill=0.0;

      units=cmr-lmr;

      if (typ==0)
      {
        if ((units>=0)&&(units<=100))
          bill+=units*1;
        else if ((units>100)&&(units<=200))
          bill+=100+((units-100)*2.5);
        else if((units>200)&&(units<=500))
          bill+=350+(units-200)*4;
        else
          bill+=1550+(units-500)*6;
      }
      else
      {
        if((units>=0)&&(units<=100))
          bill+=units*2;
        else if ((units>100)&&(units<=200))
          bill+=200+(units-100)*4.5;
        else if((units>200)&&(units<=500))
          bill+=650+(units-200)*6;
        else
          bill+=2450+(units-500)*7;

      }
      display(cnam,cn,units,bill);

  }
  public static void display(String cnam,int cn,int units,double bill)
  {
    System.out.println("=>NAME:"+cnam);
    System.out.println("=>CONSUMER NO:"+cn);
    System.out.println("=>UNITS CONUSMED:"+units);
    System.out.println("=>AMT="+bill);
  }
}
