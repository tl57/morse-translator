package org.morse.translator.services.impl;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import org.javatools.providers.ExceptionLoggerServiceProvider;
import org.javatools.utils.PropertiesUtils;
import org.morse.translator.services.IFromMorseService;

public class DefaultFromMorseService implements IFromMorseService {
	
	protected static final String DICTIONARY_LOCATION = "DefaultFromMorseService.properties";
	protected static Map<String, String> dictionary = new TreeMap<String, String>();
	
	private static final String DOT = "."; 
	private static final String LINE = "-";; 
	private static final String CHAR_SPACE = " ";
	private static final String WORD_SPACE = "/";

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
		
		Properties properties = null;
		try {
			InputStream fis = this.getClass().getResourceAsStream(DICTIONARY_LOCATION);
			
			properties = PropertiesUtils.readProperties(fis);
		} catch (Exception e) {
			ExceptionLoggerServiceProvider.getProvider().log(e);
		}
		for (Object obj : properties.keySet()) {
			String key = String.valueOf(obj);
			String val = String.valueOf(properties.get(key));
			dictionary.put(key, val);
		}
	}

}
