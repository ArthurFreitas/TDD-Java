package translator;

public class Translator {

    private String translation;

	public boolean hasTranslations() {
		return translation != null;
	}

	public void addTranslation(String portugueseWord, String englishTranslation) {
        this.translation = englishTranslation;
	}

	public Object translate(String portugueseWord) {
		return translation;
	}
}
