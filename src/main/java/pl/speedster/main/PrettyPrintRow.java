package pl.speedster.main;

import pl.speedster.main.Color;
import pl.speedster.main.PrintableRow;
import pl.speedster.main.Row;

public class PrettyPrintRow {

    public static String pprint(Row row) {
        var string = "";
        var pRow = new PrintableRow(row);
        for (int i = 0; i < pRow.nrOfColumns(); i++) {
            string += pRow.pos(i);
        }
        string += " ";
        string += pRow.full();
        string += "/";
        string += pRow.partial();
        return string;
    }
}
