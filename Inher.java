import java.io.*;
import java.util.Scanner;

class Animal
{
static  void eat()
  {
    System.out.println("THIS IS A ANIMAL");
  }
}

class Dog extends Animal
{
  static  void bark()
    {
      System.out.println("THIS IS DOG WHICH BARKS!");
    }
}

class Inher extends Dog
{
  public static void main(String[] args) {

    Inher.bark();
    Inher.eat();

  }
}
