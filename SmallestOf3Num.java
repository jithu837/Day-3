import java.util.*;
 public class SmallestOf3Num
 {
    public static void main(String args[])
    {
        int a=16;
        int b=7;
        int c=18;
        if((a<b)&&(a<c))
        {
            System.out.println("a is small");

        }else if((b<a)&&(b<c))
        {
            System.out.println("b is small"); 
        }else if((c<a)&&(c<b))
        {
            System.out.println("c is small"); 
        }
    } 
 }
