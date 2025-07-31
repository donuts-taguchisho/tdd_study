package money;

class Franc {
	private int amount;
	Franc(int amount){
		this.amount = amount;
	}
	void times(int multiplier){
		return new Franc(amount * multiplier);
	}
	public boolean equals(Object object){
		Franc franc = (Franc) object;
		return amount == franc.amount;
	}
}