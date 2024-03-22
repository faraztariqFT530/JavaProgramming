package Day15;
 final class FIFA{
    int players = 100;
     final void m(){
        System.out.println("This is fifa parent class method");
    }
}

//class FIFA24 extends FIFA{   // can't extend, because FIFA is the final class
  //  void m(){          //can't extend, because method m is the final method
 //       System.out.println("This is fifa 24 child class method");
 //   }

//}
public class FinalKeyword2 {
    public static void main(String[] args) {
        FIFA f1 = new FIFA();

    }
}
