
 class Overloading1 {
    public void a1(int a)
    {
    System.out.println("class a");
    
    }
    class  Overloading2 extends  Overloading1
    {
       public void a1(int a,int b)
    {
    
        System.out.println("class a2");

    }
    }
    
}
public class  Overloading
{

public static void main(String[]args)
{

 Overloading1 o=new  Overloading1();
 
  o.a1(4);
  




}



}