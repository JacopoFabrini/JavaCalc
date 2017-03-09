package pervasive.sample.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.*;
import pervasive.sample.IMoney;
import pervasive.sample.Money;
import pervasive.sample.MoneyBag;

public class MoneyTest {

	private Money m12CHF;
	private Money m14CHF;
	private Money m7USD;
	private Money m21USD;
	private MoneyBag MB1;
	private MoneyBag MB2;

	@Before // ricrea ad ogni test
	public void setup() {
		m12CHF = new Money(12, "CHF");
		m14CHF = new Money(14, "CHF");
		m7USD = new Money(7, "USD");
		m21USD = new Money(21, "USD");
		MB1= new MoneyBag(m12CHF, m7USD);
		MB2= new MoneyBag(m14CHF, m21USD);
	}

	@Test
	public void testEquals() {
		assertFalse(m12CHF.equals(null));
		assertEquals(m12CHF, m12CHF);
		assertEquals(m12CHF, new Money(12, "CHF"));
		assertTrue(!m12CHF.equals(m14CHF));
	}

	@Test
	public void testAdd() {
		Money expected = new Money(26, "CHF");

		Money result = (Money) m12CHF.add(m14CHF);

		assertTrue(expected.equals(result));
	}
	
	@Test
	public void testBagEquals() {
		assertTrue(!MB1.equals(null));
		assertEquals(MB1, MB1);
		assertTrue(!MB1.equals(m12CHF));
		assertTrue(!m12CHF.equals(MB1));
		assertTrue(!MB1.equals(MB2));
	}
	
	@Test
	public void testMixedSimpleAdd() {
		Money bag[] = {m12CHF, m7USD};
		MoneyBag expected = new MoneyBag(bag);
		assertEquals(expected, m12CHF.add(m7USD));
	}
	
}