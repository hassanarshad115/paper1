//Quick review: a class is like a complex variable

public class New
{
 private int diameter;
 private double area;
 private double volume;
 

 public New(int dia)
 
 {
  diameter = dia;
 
 }
 
 

 public void setSphereDiameter(int diameter)
 {
  this.diameter = diameter;
 }
 
 public int getSphereDiameter()
 {
  return diameter;
 }
 public void setSphereVolume()
 {

  volume = Math.PI * (4.0/3.0) * Math.pow((double)diameter/2.0,3);
 }
public double getSphereVolume()
 {
  return volume;
 }
 
 public double getSphereArea()
 {
  return area;
 }
 public void setSphereArea()
 {
  area = Math.PI * 4.0 * Math.pow((double) diameter/2.0,2);
 }
 

 public String toString()
 {
 
  String info1 = Integer.toString(diameter);
  String info2 = Double.toString(area);
  String info3 = Double.toString(volume);
  
  return "Diameter: " + info1 + "\t" + "Area: " + info2 + "\t" +"Volume: " + info3 + "\t";
 }
 //starting main class

 
 public static void main (String[] args)
 {
  
  New sphere1 = new New(1);
  New sphere2 = new New(1);
  New sphere3 = new New(1);
  
  //Time to play around with the methods
  sphere1.setSphereDiameter(1);
  sphere1.setSphereVolume();
  sphere1.setSphereArea();
  //......................
   sphere2.setSphereDiameter(1);
  sphere2.setSphereVolume();
  sphere2.setSphereArea();
  //........................
   sphere3.setSphereDiameter(1);
  sphere3.setSphereVolume();
  sphere3.setSphereArea();
  //........................................
  System.out.println(sphere1.getSphereVolume());
  System.out.println(sphere1.getSphereArea());
  System.out.println(sphere1.getSphereDiameter());

  System.out.println(sphere1);
  
  System.out.println();
  
  System.out.println(sphere2.getSphereVolume());
  System.out.println(sphere2.getSphereArea());
  System.out.println(sphere2.getSphereDiameter());

  System.out.println(sphere2);
  System.out.println();
  System.out.println(sphere3.getSphereVolume());
  System.out.println(sphere3.getSphereArea());
  System.out.println(sphere3.getSphereDiameter());
  System.out.println(sphere3);


 }
}
   