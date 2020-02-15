package model;

public class PrimeNumbers {

	private int number;
	
	public PrimeNumbers(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public boolean isThatPrime(int number) {
		
		int contador = 0;
		boolean prime = false;
		for(int i = 1; i <= number;i++) {
			if((number % i) == 0) {
				contador++;
			}
		}
		if(contador <= 2) {
			prime = true;
		}
		
		return prime;
		
	}
}
