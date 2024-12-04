import java.util.*;
 public class SetBit1
 {
    public static void main(String args[])
    {
        int a=10;
        int pos=1;
        if((a&(1<<pos))!=0)
        {
            System.out.println("Set Bit");

        }else
        {
            System.out.println("Not Set Bit");
        }
    }
 }