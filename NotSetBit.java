import java.util.*;
 public class NotSetBit
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int pos=0;
       
       System.out.println((a&(1<<pos))!=0);
    } 
 }
