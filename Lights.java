 class Bulb {

private boolean On ; 
public Bulb (boolean b) 
{ 
On =b; 
}
/*
public void setStatus(boolean b)
 { 
On = b; 
} 
public boolean getStatus() { 
return On; 
}
*/
public String toString(){
    //jo veriable iniatialize krwaty ha whe return krwaty ha
return "Bulb Status \t" +On;
}
}



public class Lights {
public static void main(String[] args) { 
Bulb b1 = new Bulb(false); 
//Bulb b2 = new Bulb(true); 
//Bulb b3 = new Bulb(true);
/*
b1.setStatus (true);
b2.setStatus (true);
b3.setStatus (true);
*/
System.out.println(b1);
//System.out.println(b2);
//System.out.println(b3);
}
}
