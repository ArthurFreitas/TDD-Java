package translator;

import java.util.HashMap;
import java.util.Map;

public class Translator {

	private Map<String,String> translations;
	
	public Translator() {
		translations = new HashMap<>();
	}

	public boolean hasTranslations() {
		return !this.translations.isEmpty();
	}

	public void addTranslation(String portugueseWord, String englishTranslation) {
        this.translations.put(portugueseWord, englishTranslation);
	}

	public String translate(String portugueseWord) {
		return this.translations.get(portugueseWord);
	}
}
