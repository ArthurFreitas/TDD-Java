package translator;

public class Translator {

    private String translation;

	public boolean isEmpty() {
		return translation == null;
	}

	public void addTranslation(String portugueseWord, String englishTranslation) {
        translation = englishTranslation;
	}

	public Object translate(String portugueseWord) {
		return translation;
	}
}
