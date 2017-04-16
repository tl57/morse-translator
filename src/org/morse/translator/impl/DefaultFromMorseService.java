package org.morse.translator.impl;

import java.util.Map;
import java.util.TreeMap;

import org.morse.translator.api.IFromMorseService;

public class DefaultFromMorseService implements IFromMorseService {
	
	protected static Map<String, String> dictionary = new TreeMap<String, String>();

	@Override
	public String translate(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadDictionary() {
		// TODO Auto-generated method stub
		
	}

}
