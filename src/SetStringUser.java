import homework12.ColorString;

import java.util.Scanner;

public class SetStringUser extends ColorString {
    public static String getInput() {
        return new Scanner(System.in).nextLine();
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
