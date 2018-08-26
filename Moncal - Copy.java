import java.io.*;
import java.util.Scanner;


public  class Moncal
{
  public static void input()
  {
    int dy,apd,cr;
    System.out.println("ENTER THE NO OF DAYS YOU HAVE IN YOUR HAND TO SAVE MONEY");
    Scanner n=new Scanner(System.in);
    dy=n.nextInt();
    System.out.println("ENTER THE AMT THAT YOU SAVE DAILY");
    apd=n.nextInt();
    System.out.println("ENTER THE AMT THAT YOU CURRENTLY HAVE");
    cr=n.nextInt();
    calculator(dy,apd,cr);
  }
    public static void calculator(int dy,int apd,int cr)
  {
    int rs,amt;
    rs=apd*dy;
    amt=cr+rs;
    display(rs,amt,cr,dy);
  }
   public static void display(int rs,int amt,int cr,int dy)
  {
    System.out.println("\n \n ===========RESULTS============\n\n");
    System.out.println("AMOUNT YOU HAVE CURRENTLY:"+cr);
    System.out.println("AMOUNT YOU WILL HAVE SAVED AT THE END OF "+dy+"="+rs);
    System.out.println("THE TOTAL AMOUNT YOU WILL HAVE TOTALLY ="+amt);

  }
  public static void main(String[] args)
  {
    System.out.println("THIS PROGRAM IS A MONEY PREDICTOR");
    input();

  }
}
