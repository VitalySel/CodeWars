package January2021;

//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//If the function is passed a valid PIN string, return true, else return false.
public class ValidatePin {
    //my
    public static boolean validatePin(String pin) {
        if ((pin.length() == 4) || (pin.length() == 6)) {
            char[] sym = pin.toCharArray();
            for (char c : sym) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //best
    public static boolean validatePinBest(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

}
