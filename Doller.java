package money;

class Doller {
	int amount;
	Doller(int amount){
		this.amount = amount;
	}
	void times(int multiplier){
		return new Doller(amount * multiplier);
	}
}