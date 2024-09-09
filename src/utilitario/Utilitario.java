package utilitario;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Victor Emmanuel
 */

public class Utilitario {
    static NumberFormat numberFormat =
            new DecimalFormat(s:"R$ #,##0.00", new DecimalFormatSymbols(new Locale(s:"pt", s1:"BR")));

    public static String doubleToString(Double value) {
        return numberFormat.format(value);

    }
}
