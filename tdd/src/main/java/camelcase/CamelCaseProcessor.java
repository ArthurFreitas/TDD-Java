package camelcase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class CamelCaseProcessor {
    
    private static final String lookBehindUpperCaseRegex = "(?=[A-Z])";
    
    public static List<String> breakCamelCaseString(String source){
        List<String> brokenStrings = 
                Arrays.asList(source.split(lookBehindUpperCaseRegex));

        brokenStrings = brokenStrings.stream()
            .map(s -> s.toLowerCase())
            .collect(Collectors.toList());

        return brokenStrings;
    }
}