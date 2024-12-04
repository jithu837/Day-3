import java.util.*;
 public class Faculty
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int paperpublished=sc.nextInt();
        int yearofexperience=sc.nextInt();
        int currentsalary=sc.nextInt();
        int salary=currentsalary;
        if(paperpublished >= 5 && yearofexperience >= 10)
        { 
          salary+=(salary*0.10);
        }
        else if(paperpublished>=3 && paperpublished<5 && yearofexperience>=5 && yearofexperience<10)
        {
            salary+=(salary*0.08);
        }
        else if(paperpublished>=1 && paperpublished<3 && yearofexperience>=1 && yearofexperience<5)
        {
           salary+=(salary*0.06);
        }
          else 
        {
            System.out.println("you are not eligible for increment");
            
        }
         System.out.println("Faculty Name:"+s);
         System.out.println("Salary:"+salary);
    } 
 }
