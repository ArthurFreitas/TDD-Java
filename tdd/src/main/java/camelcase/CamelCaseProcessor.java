package camelcase;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseProcessor {
    public static List<String> breakCamelCaseString(String source){
        List<String> brokenStrings = new ArrayList<>();
        brokenStrings.add(source.toLowerCase());
        return brokenStrings;
    }
}