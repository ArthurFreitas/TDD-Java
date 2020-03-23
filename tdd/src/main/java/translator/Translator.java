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

	public void addTranslation(String word, String translation) {
		if(this.translations.containsKey(word))
			translation = this.translations.get(word) + ", " + translation; 
		this.translations.put(word, translation);
	}

	public String translate(String word) {
		return this.translations.get(word);
	}
}
