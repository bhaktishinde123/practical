import java.util.Scanner;
public class program1 
{
 public static void main(String[] args)
  {
    short b1 ;
    short sh1;
    Scanner scin = new Scanner(System.in);
        System.out.println("enter the  byte range for byte from 0-255");
        b1 = scin.nextByte();
        System.out.println("enter the short value for range 0-65536");
        sh1 = scin.nextShort();
    b1 = b1++;
    sh1 = sh1--;
    b1 =  (short) (b1+sh1);
    sh1 = (byte) (b1 - sh1);
    b1 =  (short) (b1- sh1);
    System.out.println("byte variable ="+ b1);
    System.out.println("short varibale ="+ sh1);





  }   
}
