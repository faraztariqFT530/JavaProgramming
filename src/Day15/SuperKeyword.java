package Day15;
class Game {
    String cod = "Modern warfare";
    void executable(){
        System.out.println("Playing game");
    }
}
class COD extends Game {
    String cod = "BlackOps";
    void playingGame(){
        System.out.println(super.cod);
    }
    void executable(){
        //System.out.println("Playing Call of duty game");
        super.executable();
    }
}
public class SuperKeyword {

}
