package com.testejava.sobrescrita;

public class Carro {
	private int id;
	private String modelo;
	
	public Carro (int id, String modelo) {
		this.modelo = modelo;
		this.id = id;	
	}
	
	@Override
	 public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Carro that = (Carro) obj;
		return id == that.id && modelo.equals(that.modelo);
	}
	
	@Override
    public int hashCode() {
        return modelo.hashCode() + id;
    }
}
