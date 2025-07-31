package money;

class Doller {
	private int amount;
	Doller(int amount){
		this.amount = amount;
	}
	void times(int multiplier){
		return new Doller(amount * multiplier);
	}
	public boolean equals(Object object){
		Doller doller = (Doller) object;
		return amount == doller.amount;
	}
}