import java.util.regex.*;
public class Solution {

  public static boolean validatePin(String pin) {
    // Your code here...
    return Pattern.matches("^(\\d{4}|\\d{6})$",pin) ? true : false;
  }

}
