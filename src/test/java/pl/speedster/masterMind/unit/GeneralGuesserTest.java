package pl.speedster.masterMind.unit;

import org.junit.Assert;
import org.junit.Test;
import pl.speedster.main.ColorManager;
import pl.speedster.main.GeneralGuesser;
import pl.speedster.main.Guesser;
import pl.speedster.main.Table;

public class GeneralGuesserTest {
    static final int NR_COLORS = 6;
    static final int NR_COLUMNS = 4;

    @Test
    public void generateAllGuesses() {
        int numberOfGuesses = 0;
        ColorManager manager = new ColorManager(NR_COLORS);
        Table table = new Table(NR_COLUMNS,manager);
        Guesser guesser = new GeneralGuesser(table);
        while (guesser.nextGuess() != Guesser.none) {
            numberOfGuesses++;
        }
        Assert.assertEquals(6*6*6*6,numberOfGuesses);
    }
}
