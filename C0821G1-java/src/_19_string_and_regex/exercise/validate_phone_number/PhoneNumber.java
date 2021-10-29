package _19_string_and_regex.exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX_PHONE_NUMBER =   "^\\d+\\d+[-]+[0]+[0-9]{9}$";

    public PhoneNumber() {
        pattern = Pattern.compile(REGEX_PHONE_NUMBER);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
