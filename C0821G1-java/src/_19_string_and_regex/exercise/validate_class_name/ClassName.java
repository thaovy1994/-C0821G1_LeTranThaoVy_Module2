package _19_string_and_regex.exercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX_CLASS_NAME =   "^[CAP]+[0-9]{4}[GHIKLM]$";

    public ClassName() {
        pattern = Pattern.compile(REGEX_CLASS_NAME);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
