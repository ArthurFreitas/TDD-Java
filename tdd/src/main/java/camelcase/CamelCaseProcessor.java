package camelcase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class CamelCaseProcessor {
    private static final String lookBehindUpperCaseRegex = "(?<!(^|[A-Z0-9]))(?=[A-Z0-9])|(?<!^)(?=[A-Z0-9][a-z])";
    private static final String moreThanOneUpperCaseRegex = "[A-Z]{2,}";
    
    public static List<String> breakCamelCaseString(String source){
        List<String> brokenStrings = 
                Arrays.asList(source.split(lookBehindUpperCaseRegex));
        brokenStrings = brokenStrings.stream()
            .map(s -> prepareStringResponse(s))
            .collect(Collectors.toList());

        return brokenStrings;
    }

    private static String prepareStringResponse(String s){
        if(hasMoreThanOneUpperCaseChar(s))
            return s;
        else
            return s.toLowerCase();
    }

    private static Boolean hasMoreThanOneUpperCaseChar(String s){
        return s.matches(moreThanOneUpperCaseRegex);
    }
}