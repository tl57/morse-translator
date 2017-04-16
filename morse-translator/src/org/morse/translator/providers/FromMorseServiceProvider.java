package org.morse.translator.providers;

import org.morse.translator.services.IFromMorseService;
import org.morse.translator.services.impl.DefaultFromMorseService;

public class FromMorseServiceProvider {
	
	static private IFromMorseService _instance = new DefaultFromMorseService();
	
	static public IFromMorseService getProvider() {
		return _instance;
	}
	
	static public void setProvider(IFromMorseService instance) {
		_instance = instance;
	}
}
