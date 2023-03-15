import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestDice{

    @Test
    public void testDiceRoll() {
        Dice die = new Dice(2);
        // Given
        int expected = 9; // change to

        // When
        int actual = die.rollDice();

        // Then
        Assert.assertEquals(expected, actual);
    }
}