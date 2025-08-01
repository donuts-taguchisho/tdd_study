package money;

class Doller extends Money {
	Doller(int amount, String currency){
		super(amount, currency);
	}	
	Money times(int multiplier){
		return Money.doller(amount * multiplier);
	}
}