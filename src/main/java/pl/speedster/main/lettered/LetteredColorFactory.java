package pl.speedster.main.lettered;

import pl.speedster.main.Color;
import pl.speedster.main.ColorFactory;

public class LetteredColorFactory implements ColorFactory {
    private static final String letters = "0123456789ABCDEFGHIJKLMNOPQRSTVWXYZabcdefghijklmnopqrstvwxyz";
    private int counter = 0;

    @Override
    public Color newColor() {
        Color color = new LetteredColor(letters.substring(counter, counter + 1));
        counter++;
        return color;
    }
}
