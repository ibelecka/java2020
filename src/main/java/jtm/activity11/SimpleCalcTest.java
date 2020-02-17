package jtm.activity11;
import jtm.activity08;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
		sc = new SimpleCalc();
		
	}

	@Test
	public void testAddInRange() {
		// TODO test addition for case where both numbers and result is in allowed range
		int a = 2;
		int b = -8;
		int expected = -6;
		int actual = SimpleCalc.add(a, b);
		assertEquals("2 + (-8) should be -6", expected, actual);
		
	}

	@Test
	public void testAddOutOfRange() {
		// TODO test addition for cases where both numbers and result is out of allowed
		// range
		int a = -15;
		int b = 23;
		Integer actual = SimpleCalc.add(a, b);
		assertNull("Value is not in range", actual);
	}

	@Test
	public void testSubtractInRange() {
		// TODO
		int a = 3;
		int b = 5;
		int expected = -2;
		int actual = SimpleCalc.subtract(a, b);
		assertEquals("should be -2", expected, actual);
	}

	@Test
	public void testSubtractOutOfRange() {
		// TODO
		int a = 20;
		int b = -33;
		Integer actual = SimpleCalc.subtract(a, b);
		assertNull("Should be null", actual);
	}

	@Test
	public void testMultiplyInRange() {
		// TODO
		int a = 2;
		int b = 1;
		int expected = 2;
		int actual = SimpleCalc.multiply(a, b);
		assertEquals("should be 2", expected, actual);
	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO
		int a = 11;
		int b = -2;
		Integer actual = SimpleCalc.multiply(a, b);
		assertNull("Should be null", actual);
	}

	@Test
	public void testDivideInRange() {
		// TODO
		int a = 6;
		int b = 2;
		int expected = 3;
		int actual = SimpleCalc.divide(a, b);
		assertEquals("should be 3", expected, actual);
		
	}

	@Test
	public void testDivideOutOfRange() {
		// TODO
		int a = 15;
		int b = 3;
		Integer actual = SimpleCalc.divide(a, b);
		assertNull("Should be null", actual);
	}

}
