package logos.jcore.test.cinema;

import java.util.regex.Pattern;

public class Validator {

    public static boolean validDate(String str) {
        Pattern p = Pattern.compile("^(0[1-9]|[12][0-9]|3[01]).(0[1-9]|1[012]).((19|2[0-9])[0-9]{2})$");
        return p.matcher(str).matches();
    }

    public static boolean validTime(String str) {
        Pattern t = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");
        return t.matcher(str).matches();
    }

}
