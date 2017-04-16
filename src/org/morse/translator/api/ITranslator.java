package org.morse.translator.api;

public interface ITranslator {

	public String translate(String message);
	abstract void loadDictionary();
}
