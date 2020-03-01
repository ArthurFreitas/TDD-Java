package br.com.tdd.camelcase;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseProcessor {
    public static List<String> breakCamelCaseString(String source){
        List<String> brokenStrings = new ArrayList<>();
        brokenStrings.add(source);
        return brokenStrings;
    }
}