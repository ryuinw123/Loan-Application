package loan.utils;

import java.util.ArrayList;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Checking {

    public static boolean isNumeric(ArrayList<String> name) {
        for (String strNum : name) {
            if (strNum == null) {
                return false;
            }
        }
        for (int i = name.size() - 1; i >= 0; i--) try {
            int d = Integer.parseInt(name.get(i));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNull(ArrayList<String> Str) {
        for (String a : Str) {
            if (a.trim().isEmpty()) {
                System.out.println("B");
                return true;
            }
        }
        return false;
    }

    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }
}
