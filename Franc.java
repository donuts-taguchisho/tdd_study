package money;

class Franc extends Money {
	Franc(int amount){
		this.amount = amount;
	}
	void times(int multiplier){
		return new Franc(amount * multiplier);
	}
}