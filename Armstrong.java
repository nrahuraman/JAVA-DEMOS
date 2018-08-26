import java.io.*;
import java.util.Scanner;

class Armstrong
{
  public static void main(String[] args)
  {
      int num,m,temp,r,p=0;
      double sum=0.0;
      Scanner n=new Scanner(System.in);
      System.out.println("ENTER A NUMBER ");
      num=n.nextInt();
      temp=num;
      while(temp>0)
       {
         p++;
         temp=temp/10;
       }
      while(temp>0)
      {
        r=temp%10;
        sum=sum+Math.pow(r,p);
        temp=temp/10;

      }
      if(sum==temp)
        System.out.println("THE GIVEN NUMBER IS ARMSTRONG");



  }
}
