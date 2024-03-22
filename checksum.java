import java.util.Scanner;
public class checksum
 {
    
    public static void main(String[] args) 
    {
        byte firstvalue,secondvalue,sum;
        Scanner scin = new Scanner (System.in);

        System.out.println("enter the firstvalue");
        firstvalue = scin.nextByte();

        System.out.println("enter the second value");
        secondvalue = scin.nextByte();

        sum = 0;


        while(firstvalue <=secondvalue)
        {
            sum = (byte) (sum + firstvalue);
            firstvalue++;

        }

        System.out.println("the sum of number is"+ sum);



    }
    
}
