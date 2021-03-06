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
    private Translator t;

    @Before
    public void setup(){
        this.t = new Translator();
    }

    @Test
    public void translateNoWords(){
        assertFalse(t.hasTranslations());
    }

    @Test
    public void translateOneWord(){        
        t.addTranslation("bom", "good");

        assertTrue(t.hasTranslations());
        assertEquals("good", t.translate("bom"));
    }

    @Test
    public void translateTwoWords(){
        t.addTranslation("bom", "good");
        t.addTranslation("mau", "bad");

        assertEquals("good", t.translate("bom"));
        assertEquals("bad", t.translate("mau"));
    }

    @Test
    public void TwoTranslationsSameWord(){
        t.addTranslation("bom", "good");
        t.addTranslation("bom", "nice");

        assertEquals("good, nice", t.translate("bom"));
    }

    @Test
    public void translatePhrase(){
        t.addTranslation("bom", "good");
        t.addTranslation("e", "and");
        t.addTranslation("mau", "bad");

        assertEquals("good and bad", t.translatePhrase("bom e mau"));
    }

    @Test
    public void translatePhraseWithTwoTranslationsForSameWord(){
        t.addTranslation("bom", "good");
        t.addTranslation("bom", "nice");
        t.addTranslation("e", "and");
        t.addTranslation("mau", "bad");

        assertEquals("good and bad", t.translatePhrase("bom e mau"));
    }
}