
class overloading {
    String name;
    int age;
    overloading(String s,int a)
    {
    name=s;
    age=a;
    
    }
    
    void add()
    {
    System.out.println(name);
    System.out.println(age);
    
    
    }
}
class O{
public static void main(String []args)
{
overloading obj=new overloading("hassan",5);
obj.add();



}
}