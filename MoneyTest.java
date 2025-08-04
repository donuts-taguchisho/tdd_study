package money;

import org.junit.jupiter.api.test;
import org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
	@Test
	public void testMultiplication(){
		Money five = Money.doller(5);
		assertEquals(Money.doller(10), five.times(2));
		assertEquals(Money.doller(15), five.times(3));		
	}
	@Test
	public void testEquality(){
		assertTrue(Money.doller(5).equals(Money.doller(5)));
		assertFalse(Money.doller(5).equals(Money.doller(6)));
		assertFalse(Money.franc(5).equals(Money.doller(5)));
	}
	@Test
	public void testCurrency(){
		assertEquals("USD", Money.doller(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	@Test
	public void testSimpleAddition(){
		Money five = Money.doller(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.doller(10), reduced);
	}
}