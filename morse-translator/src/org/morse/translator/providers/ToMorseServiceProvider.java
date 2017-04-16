package org.morse.translator.providers;

import org.morse.translator.services.IToMorseService;
import org.morse.translator.services.impl.DefaultToMorseService;

public class ToMorseServiceProvider {
	
	static private IToMorseService _instance = new DefaultToMorseService();
	
	static public IToMorseService getProvider() {
		return _instance;
	}
	
	static public void setProvider(IToMorseService instance) {
		_instance = instance;
	}
}
