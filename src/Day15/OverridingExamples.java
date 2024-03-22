package Day15;

class Bank{
    double roi(){
        return 0;
    }
}

class Askari extends Bank{
    double roi(){
        return 10.5;
    }
}

class MCB extends Bank{
    double roi(){
        return 16.5;
    }
}

public class OverridingExamples {
    public static void main(String[] args) {
        Askari ask = new Askari();
        System.out.println(ask.roi());

        MCB mcb = new MCB();
        System.out.println(mcb.roi());

    }
}
