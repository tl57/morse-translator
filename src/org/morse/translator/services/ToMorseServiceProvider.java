package org.morse.translator.services;

import org.morse.translator.api.IToMorseService;
import org.morse.translator.impl.DefaultToMorseService;

public class ToMorseServiceProvider {
	
	static private IToMorseService _instance = new DefaultToMorseService();
	
	static public IToMorseService getProvider() {
		return _instance;
	}
	
	static public void setProvider(IToMorseService instance) {
		_instance = instance;
	}
}
