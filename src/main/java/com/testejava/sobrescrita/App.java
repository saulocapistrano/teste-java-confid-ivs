package com.testejava.sobrescrita;

public class App {

	public static void main(String[] args) {

		Carro obj1 =  new Carro(1, "Civic");
		Carro obj2 = new Carro(1, "Civic");
		System.out.println("obj1 é igual a obj2?\n" + obj1.equals(obj2) + " \nobj1 é igual a obj2? ");
		System.out.print(obj1 == obj2);
	}

}
