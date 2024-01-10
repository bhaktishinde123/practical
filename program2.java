import java.util.Scanner;
public class program2 
{
 public static void main(String[] args)
  {
    byte b1;
    Scanner scin = new Scanner(System.in);
        System.out.println("enter the  byte range for byte from 0-255");
        b1 = scin.nextByte();
        if (b1<0)
        {
            System.out.println("the value is not a whole number");
        }
        else
        {
            System.out.println("the number i s a whole number");

        }

  }
}