import java.util.Random;

public class Dice {

    private Random trow;

    public Dice (){
        this.trow = new Random();
    }

    public int trowDice(){
        return trow.nextInt(6)+1;
    }
}
