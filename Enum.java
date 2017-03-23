
public class Enum {
   enum FLAVOR{CORNATO,DUNHIL,SWEETY,STOBERY,CHOKBAR}
   //enum choti abc m r FLAVOR bri m likhna ha
    //public static void main ayga
    public static void main(String[]args)
    {
        //FLAVOOR k agy veriable lygy apni mrzi sy
     FLAVOR cone1,cone2;
     cone1=FLAVOR.CHOKBAR;
    cone2=FLAVOR.CORNATO;
    
    //array k index wala kam hoga 0 sy start hoga
    System.out.println("the name of this cone\t"+cone1);
    System.out.println("the ordinal number is\t"+cone1.ordinal());
    System.out.println("the name of cone is\t"+cone1.name());
    
    System.out.println();
    
        System.out.println("the name of this cone\t"+cone2);
        System.out.println("the ordinal number is\t"+cone2.ordinal());
        System.out.println("the name of cone is\t"+cone2.name());
    
    
    
    
    }
    
    
    
    
    }
    
    
}
