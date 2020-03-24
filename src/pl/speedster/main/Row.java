package pl.speedster.main;

import java.util.Arrays;

public class Row {

    final Color[] positions;
    protected int matchedPositions;
    protected int matchedColors;

    public static final Row none = new Row(Guesser.none);

    public Row(Color[] positions) {
        this.positions = Arrays.copyOf(positions, positions.length);
    }

}
