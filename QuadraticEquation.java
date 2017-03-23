import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    double a,b,c;
    double d,r1,r2;
    
    //a,b ,c ko input krygy
    System.out.println("enter the value of a");
    a=sc.nextInt();
    System.out.println("enter the value of b");
    b=sc.nextInt();
    System.out.println("enter the value of c");
    c=sc.nextInt();
    
    //ab quadratic equation wala kam hoga
    //formula ko he open kia ha
    d=Math.pow(b,2)-(4*a*c);
    r1=((-1*b)+Math.sqrt(d))/(2*a);
    r2=((-1*b)-Math.sqrt(d))/(2*a);
    //output k lye 
    System.out.println("the answer of root1 is"+r1);
    System.out.println("the answer of root2 is"+r2);
    
    
        
    }
    
}
