package translator;

import org.junit.*;
import static org.junit.Assert.*;

// Cenários
// Tradutor sem palavras
// Tradução
// 2 Traduções
// 2 Traduções, mesma palavra
// Traduzir Frase

public class TranslatorTest{
    @Test
    public void translateNoWords(){
        Translator t = new Translator();
        assertTrue(t.isEmpty());
    }

    @Test
    public void translateOneWord(){
        Translator t = new Translator();
        t.addTranslation("bom", "good");
        assertFalse(t.isEmpty());
        assertEquals("good", t.translate("bom"));
    }
}