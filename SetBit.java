import java.util.*;
 public class SetBit
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int pos=1;
       
       System.out.println(a&(1<<pos));
    } 
 }
