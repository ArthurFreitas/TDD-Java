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

    @Test
    public void breakTwoWordsOneFullyUpperCase(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("numeroCPF");
        assertEquals("numero", processedStrings.get(0));
        assertEquals("CPF", processedStrings.get(1));
    }

    @Test
    public void breakThreeDistinctCasedWords(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("numeroCPFContribuinte");
        assertEquals("numero", processedStrings.get(0));
        assertEquals("CPF", processedStrings.get(1));
        assertEquals("contribuinte", processedStrings.get(2));
    }

    @Test
    public void breakCamelCasedWordsWithNumbers(){
        List<String> processedStrings = CamelCaseProcessor.breakCamelCaseString("recupera10Primeiros");
        assertEquals("recupera", processedStrings.get(0));
        assertEquals("10", processedStrings.get(1));
        assertEquals("primeiros", processedStrings.get(2));
    }

    @Test(expected = StringStartsWithANumberException.class)
    public void breakStringStartingWithNumbers(){
        CamelCaseProcessor.breakCamelCaseString("10Primeiros");
    }

    @Test(expected = StringHasInvalidCharacterException.class)
    public void breakStringWithSpecialCharacters(){
        CamelCaseProcessor.breakCamelCaseString("nome#Composto");
    }
}