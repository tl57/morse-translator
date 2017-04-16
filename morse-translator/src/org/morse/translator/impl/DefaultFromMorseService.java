package org.morse.translator.impl;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import org.morse.translator.api.IFromMorseService;

public class DefaultFromMorseService implements IFromMorseService {
	
	protected static final String DICTIONARY_LOCATION = "DefaultFromMorseService.properties";
	protected static Map<String, String> dictionary = new TreeMap<String, String>();

	@Override
	public String translate(String message) {
		if (dictionary.isEmpty())
			return null; // or exception?
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadDictionary() {
		if (!dictionary.isEmpty())
			dictionary.clear();
		
		Properties properties = new Properties();
		try {
			properties.load(this.getClass().getResourceAsStream(DICTIONARY_LOCATION));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
