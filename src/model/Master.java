package model;

public class Master {
	
	private PrimeNumber primeNumber;
	
	
	
	public Master() {
		super();
		primeNumber = new PrimeNumber(0);
	}

	public PrimeNumber getPrimeNumber() {
		return primeNumber;
	}
	
	public void setPrimeNumber(PrimeNumber primeNumber) {
		this.primeNumber = primeNumber;
	}



	public String sizeOfMatrix(int number){
		
		String size = "";
		
		double sqr = Math.sqrt(number);
		int perfect = (int) sqr;
		int c = (int) sqr;

		if((sqr - perfect) != 0) {
		
			do {
				if (perfect>=c) {
					++c;
				}else {
					++perfect;
				}
			}while((perfect*c) < number);
			
		}
		
		size = perfect + "," + c;
		
		return size; 
	}
	
	public boolean[] getBitwiseSieve(int number) {
		boolean[] goodCollection = primeNumber.bitwiseSieve(number);
		
		return goodCollection;
	}
	
	public boolean[] getEratosthenesSieve(int number) {
		boolean[] goodCollection = primeNumber.sieveOfEratosthenes(number);
		
		return goodCollection;
	}


} //end of class
