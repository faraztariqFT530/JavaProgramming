package Day15;

class FIFAO{
   final int players = 100;
}


public class FinalKeyword {
    public static void main(String[] args) {
        FIFAO f1 = new FIFAO();
        //f1.players=99;          //incorrect because players is the final keyword
    }
}
