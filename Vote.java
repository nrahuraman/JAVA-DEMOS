import java.io.*;
import java.util.Scanner;

public class Vote
{
  static int c=0,m=0,e=0,v,nt=0,op=0;
  static Scanner n=new Scanner(System.in);
  public static void candidates()
  {

    System.out.println("===========PARTICIPATING CANDIDATES==========");
    System.out.println("1.CSE \n 2.MECH \n 3.ECE \n 4.NOTA");
    System.out.println("ENTER YOUR OPTION");
    Scanner n=new Scanner(System.in);
    v=n.nextInt();
    switch(v)
    {
      case 1:
        c++;
        break;
      case 2:
        m++;
        break;
      case 3:
        e++;
        break;
      case 4:
        nt++;
        break;
      default:
        System.out.println("PRESS NONE OPTION");
        candidates();
        break;
    }
    nxt();
  }
   public static void nxt()
    {  int op;
    System.out.println("NEXT PERSON \n======PRESS OPTION======\n 1.YES \t 2.NO");
    op=n.nextInt();
    if(op==1)
    {
      System.out.println("\n\n");
      id();
    }
    else
        result(c,m,e,nt);

  }
  public static void result(int c,int m,int e,int nt)
  {
    System.out.println("\n \n\n=============RESULTS============\n\n");
    System.out.println("CSE="+c);
    System.out.println("MECH="+m);
    System.out.println("ECE="+e);
    System.out.println("NOTA="+nt+"\n");
    if(((c>m)&&(c>e))&&(c>nt))
      System.out.println("CSE IS THE WINNER WITH "+c+" VOTES");
    else if((m>e)&&(m>nt))
      System.out.println("MECH IS THE WINNER WITH "+m+" VOTES");
    else if(e>nt)
      System.out.println("ECE IS THE WINNER WITH "+e+" VOTES");
    else
      System.out.println("NONE OF THE CANDIDATES WON THE ELECTON");
  }

  public static void id()
  {
    Scanner s=new Scanner(System.in);
    int vid,age;
    System.out.println("ENTER YOUR AGE");
    age=s.nextInt();
    if(age>18)
    {
    System.out.println("ENTER YOU VOTER ID NO FOR VOTING");
    vid=s.nextInt();
    if((vid>00032)&&(vid<99989))
        candidates();
    else
        System.out.println("ENTER A VALID VOTER ID NO");
    }
    else
    {
      System.out.println("YOUR ARE A KID NOT ELIGIBLE FOR VOTING ");
          nxt();

    }
  }

  public static void main(String[] args)
  {
    System.out.println("============PANIMALAR ELECTION COMMITEE============");
    id();

  }
}
