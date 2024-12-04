import java.util.*;
 public class GreatestOf3Numbers
 {
    public static void main(String args[])
    {
        int a=16;
        int b=7;
        int c=18;
        if((a>b)&&(a>c))
        {
            System.out.println("a is big");

        }else if((b>a)&&(b>c))
        {
            System.out.println("b is big"); 
        }else if((c>a)&&(c>b))
        {
            System.out.println("c is big"); 
        }
    } 
 }
