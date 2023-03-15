
import java.util.Random;

public class Dice {
    int numDice;
    Random rand = new Random(1);


    public Dice(int numDice){
        this.numDice = numDice;
    }
    public int rollDice(){
        int diceThrow = 0;

        for (int i = 0; i < numDice; i++) {
            int intRoll = rand.nextInt(6) + 1;
            diceThrow += intRoll;
        }
        return diceThrow;
    }
}
