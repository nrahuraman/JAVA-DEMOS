import java.io.*;
import java.util.Scanner;

class Stuinfo
{
  public static void main(String[] args)
  {
    int no,i,rn[],cl[],ph[];
    String nam[],dob[];
    Scanner n=new Scanner(System.in);
    rn=new int[10];
    ph=new int[10];
    cl=new int[10];
    nam=new String[10];
    dob=new String[10];
    System.out.println("ENTER THE NO OF STUDENT");
    no=n.nextInt();
    for(i=0;i<no;i++)
    {
      System.out.println("ENTER THE STUDENT NAME");
      nam[i]=n.next();
      System.out.println("ENTER THE STUDENT'S DOB");
      dob[i]=n.next();
      System.out.println("ENTER THE CLASS");
      cl[i]=n.nextInt();
      System.out.println("ENTER THE ROLLNO");
      rn[i]=n.nextInt();
      System.out.println("ENTER YOU PHONE NO");
      ph[i]=n.nextInt();
      System.out.println("\n\n\n\n=========NEXT STUDENT=========");
    }
    for(i=0;i<no;i++)
    {
      System.out.println("\n\n\t =================STUDENT "+(i+1)+" DETAILS=============");
      System.out.println("=>STUDENT NAME:"+nam[i]);
      System.out.println("=>STUDENT DOB:"+dob[i]);
      System.out.println("=>STUDENT CLASS"+cl[i]);
      System.out.println("=>STUDENT ROLLNO"+rn[i]);
      System.out.println("=>STUDENT PHONE NO:"+ph[i]);
    }
  }
}
