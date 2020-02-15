package model;

public class PrimeNumber {

	private int number;
	
	public PrimeNumber(int number) {
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
	
	public boolean[] sieveOfEratosthenes(int theIndex) {
		
		boolean[] goodCollection = new boolean[theIndex+1];
		
        for(int i=0;i<theIndex;i++) {
        	goodCollection[i] = true; 
        }
        	
        for(int factor = 2; factor*factor <=theIndex; factor++){ 
         
            // 
            if(goodCollection[factor] == true) 
            { 
                // Update all multiples of p 
                for(int multiples = factor*2; multiples <=theIndex; multiples += factor) {
                	goodCollection[multiples] = false; 
                }
                
            } 
        } 
        
		return goodCollection; 
	}
	
} //end of class
