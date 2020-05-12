package pl.speedster.masterMind.unit;

import org.junit.Assert;
import org.junit.Test;
import pl.speedster.main.*;

public class GeneralGuesserTest {
    static final int NR_COLORS = 6;
    static final int NR_COLUMNS = 4;

    @Test
    public void generateAllGuesses() {
        int numberOfGuesses = 0;
        final var manager = new ColorManager(NR_COLORS, Color::new);
        final var table = new Table(NR_COLUMNS, manager);
        final var guesser = new GeneralGuesser(table);
        while (guesser.nextGuess() != Guess.none) {
            numberOfGuesses++;
        }
        Assert.assertEquals(6 * 6 * 6 * 6, numberOfGuesses);
    }
}
