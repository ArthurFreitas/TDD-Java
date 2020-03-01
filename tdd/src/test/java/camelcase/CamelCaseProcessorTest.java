package camelcase;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class CamelCaseProcessorTest{
    @Test
    public void breakSimpleLowerCaseString(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("nome");
        assertEquals("nome", processedStrings.get(0));
    }

    @Test
    public void breakSimpleCapitalizedString(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("Nome");
        assertEquals("nome", processedStrings.get(0)); 
    }

    @Test
    public void breakSimpleCamelCaseString(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("nomeComposto");
        assertEquals("nome", processedStrings.get(0));
        assertEquals("composto", processedStrings.get(1)); 
    }
}