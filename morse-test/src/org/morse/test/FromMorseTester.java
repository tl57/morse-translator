package org.morse.test;

import org.morse.translator.providers.FromMorseServiceProvider;
import org.morse.translator.services.IFromMorseService;

public class FromMorseTester {

	public static void main(String[] args) {
		IFromMorseService fromMorseProvider = FromMorseServiceProvider.getProvider();
		fromMorseProvider.loadDictionary();
	}

}
