
public class InstanceV {
    int height;
    int width;
    int a;
    int b ;
    InstanceV(int h,int w)
    {
    height=h;
    width=w;
    
    }
  public int getdata()
          
  {
 
  int res=height*width;
  //System.out.println(res);
  return res;
  }


public static void main(String []args)
{
InstanceV i=new InstanceV (5,10);

System.out.println(i.getdata());

}


}
