package com.testejava.anagramas;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public List<String> createAnagrama(String input){
		List<String> anagramas = new ArrayList<>();
		alterna("", input ,anagramas);
		return anagramas;
	}

	private void alterna(String prefixo, String str, List<String> anagramas) {
		int n = str.length();
		if(n==0) {
			anagramas.add(prefixo);
		}else {
			for (int i = 0; i< n ; i++) {
				alterna(prefixo + str.charAt(i), str.substring(0,i)+str.substring(i + 1), anagramas);
			}
		}
		
	}
}
