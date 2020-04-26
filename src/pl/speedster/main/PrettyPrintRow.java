package pl.speedster.main;

import pl.speedster.main.Color;
import pl.speedster.main.PrintableRow;
import pl.speedster.main.Row;

import java.util.HashMap;
import java.util.Map;

public class PrettyPrintRow {

    private static final Map<Color, Character> letteringMapping = new HashMap<>();
    private static final String letters = "RGBYWb";
    private static int counter = 0;

    private static char colorToChar(Color color){
        if (!letteringMapping.containsKey(color)){
            letteringMapping.put(color,letters.charAt(counter));
            counter++;
        }
        return  letteringMapping.get(color);
    }

    public static String pprint (Row row){
        var string = "";
        final var pRow = new PrintableRow(row);
        for (int i = 0; i < pRow.nrOfColumns(); i++){
            string += colorToChar(pRow.position(i));
        }
        string += " ";
        string += pRow.matchedPositions();
        string += "/";
        string += pRow.matchedColors();
        return string;
    }
}
