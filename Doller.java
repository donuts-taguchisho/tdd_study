package money;

class Doller extends Money {
	Doller(int amount){
		this.amount = amount;
	}	
	void times(int multiplier){
		return new Doller(amount * multiplier);
	}
}