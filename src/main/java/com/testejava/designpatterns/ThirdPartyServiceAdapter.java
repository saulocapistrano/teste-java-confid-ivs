package com.testejava.designpatterns;

public class ThirdPartyServiceAdapter implements DataService {

	private ThirdPartyLibraryService adapter;
	
	public ThirdPartyServiceAdapter() {
		this.adapter = new ThirdPartyLibraryService();
	}
	
	@Override
	public void fecthData() {
		adapter.getData();
	}
}
