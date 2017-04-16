package org.morse.translator.services;

import org.morse.translator.api.IFromMorseService;
import org.morse.translator.impl.DefaultFromMorseService;

public class FromMorseServiceProvider {
	
	static private IFromMorseService _instance = new DefaultFromMorseService();
	
	static public IFromMorseService getProvider() {
		return _instance;
	}
	
	static public void setProvider(IFromMorseService instance) {
		_instance = instance;
	}
}
