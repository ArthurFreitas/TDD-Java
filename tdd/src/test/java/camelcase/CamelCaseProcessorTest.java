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
}