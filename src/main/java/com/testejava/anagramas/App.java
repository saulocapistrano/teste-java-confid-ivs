package com.testejava.anagramas;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Anagrama anagrama = new Anagrama();
		List<String> anagramas = anagrama.createAnagrama("abc");
		System.out.println("Anagramas de abc: ");
		for (String anagram : anagramas) {
			System.out.println(anagram);
		}
	}

}
