package loan.utils;

/**
 *
 * @author Villan
 */
public class MessageParser {

    private static String message =  ConnectionUtil.GetName();
    private int pointer = 0;

    public Character getNext() {
        message =ConnectionUtil.GetName();
        if (pointer >= message.length()) {
            return null;
        }
        Character entry = message.charAt(pointer);
        pointer += 1;
        return entry;
    }
}
