package com.testejava.designpatterns;

public class App {

	public static void main(String[] args) {

		DataService dataService =  new ThirdPartyServiceAdapter();
		dataService.fecthData();
	}

}
