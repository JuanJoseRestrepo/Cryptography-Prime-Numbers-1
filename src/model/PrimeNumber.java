package model;

import java.util.Arrays;

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
		
		boolean prime = false;
		
		for(int i = 1; i <= number && !prime;i++) {
			if((number % i) == 0 && i == number) {
				prime = true;
			}
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
        goodCollection[1]=false;
		return goodCollection; 
	}
	
	
	public boolean[] bitwiseSieve(int theIndex){ 
		 boolean[] finalArray = new boolean[theIndex+1];  
		
		if (theIndex ==1) {
			finalArray = new boolean[2];
			finalArray[1]=false;
		} else {
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
	      

	        finalArray[1]=false;
	        finalArray[2]=true;
	        
	        for (int i = 3; i < finalArray.length; i += 2){
	        	if (primeArray[i / 2] == false){
	        		finalArray[i]=true;
	        	}
	                
	        } 
		}
         		
		
           
		return finalArray; 
    }
	
	
	public  boolean[] primesByCapY (int n) {
		
		int x = 1;
		boolean[] res = new boolean[n+2];
		Arrays.fill(res, false);
		
		res[2] = true;
		
		for(int i = 1; x < n; i++) {
			x=(2*i)+1;
			int count = 0;
			boolean stop = true;
			for (int j = x; j>0 && stop; j-=2) {
				if(x%j == 0) 
					count++;
				if(count>2) 
					stop= false;
			}
			if (count == 2)
				res[x] = true;
				
		}
		
		return res;
	}
	
	
	
} //end of class
