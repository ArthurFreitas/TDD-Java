package camelcase;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class CamelCaseProcessorTest{
    @Test
    public void breakALowerCaseWord(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("nome");
        assertEquals("nome", processedStrings.get(0));
    }

    @Test
    public void breakACapitalizedWord(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("Nome");
        assertEquals("nome", processedStrings.get(0)); 
    }

    @Test
    public void breakACamelCasedWord(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("nomeComposto");
        assertEquals("nome", processedStrings.get(0));
        assertEquals("composto", processedStrings.get(1)); 
    }

    @Test
    public void breakTwoCamelCasedWords(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("NomeComposto");
        assertEquals("nome", processedStrings.get(0));
        assertEquals("composto", processedStrings.get(1)); 
    }

    @Test
    public void breakAFullyUpperCaseWord(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("CPF");
        assertEquals("CPF", processedStrings.get(0));
    }


}