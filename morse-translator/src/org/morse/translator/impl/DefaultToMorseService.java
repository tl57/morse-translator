package org.morse.translator.impl;

import java.util.Map;
import java.util.TreeMap;

import org.morse.translator.api.IToMorseService;

public class DefaultToMorseService implements IToMorseService {
	
	protected static Map<String, String> dictionary = new TreeMap<String, String>();

	@Override
	public String translate(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadDictionary() {
		if (!dictionary.isEmpty())
			dictionary.clear();
		
	}

}
