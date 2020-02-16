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
		
        for(int i=0;i<= theIndex;i++) {
        	goodCollection[i] = true; 
        }
        	
        for(int factor = 2; factor*factor <=theIndex; factor++){ 
         
             
            if(goodCollection[factor] == true) 
            { 
                
                for(int multiples = factor*2; multiples <=theIndex; multiples += factor) {
                	goodCollection[multiples] = false; 
                }
                
            } 
        } 
        
		return goodCollection; 
	}
	
	public boolean[] bitwiseSieve(int theIndex){ 
         		
		boolean[] primeArray = new boolean[(theIndex / 2) + 1]; 
        
        for(int i=0; i<primeArray.length ;i++){
        	primeArray[i] = false; 
        }
        
        for (int composite = 3 ; composite * composite <= theIndex; composite += 2){ 
            
            if (primeArray[composite / 2] == false) 
                for (int multiple = composite * composite; multiple <= theIndex; multiple += composite * 2) { 
                    primeArray[multiple / 2] = true;
                }
        }  
      
        boolean[] finalArray = new boolean[theIndex+1]; 
        finalArray[1]=true;
        finalArray[2]=true;
        
        for (int i = 3; i < finalArray.length; i += 2){
        	if (primeArray[i / 2] == false){
        		System.out.println(i);
        		
        		finalArray[i]=true;
        	}
                
        } 
           
		return finalArray; 
    }
	
	
	
} //end of class
