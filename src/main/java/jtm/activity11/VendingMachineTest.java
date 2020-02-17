package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	VendingMachine vM; 
	
	@Before
	public void setUp() {
		vM = new VendingMachine();
//		vM.addProducts("Snickers", 2.5);
		vM.addProducts("twix", 1.0);
		vM.addProducts("bounty", 5.34);
//		vM.depositCoins(5.00);
		
	}
	
//	@Test
//	public void addProductsTest() {
//		String product = "Snickers";
//		double price = 2.52;
//		vM.addProducts(product, price);
//		assertEquals("Product and price should be the same",  )
//	}
	
	@Test
	public void depositCoinsPositiveMoneyTest()  {
		double value = 5;
		String expected = "5.00$";
		vM.depositCoins(value);
		String actual = vM.balance();

		assertEquals("Should be 5.00", expected, actual);
	}
	
	@Test
	public void depositCoinsNegativeTest() {
		vM.ejectCoinsBack();
		String expected = "0.00$";
		double value = -10;
		vM.depositCoins(value);
		String actual = vM.balance();
		assertEquals("Uncorrect coins are deposited", expected, actual);
	}
	
	@Test
	public void depositCoinsManyZerosTest() {
		vM.ejectCoinsBack();
		String expected = "6.67$";
		double value = 6.6666;
		vM.depositCoins(value);
		String actual = vM.balance();
		assertEquals("Uncorrect coins are deposited", expected, actual);
	}
	
//	@Test
//	public void balanceTest() {
//		vM.ejectCoinsBack();
//		String expected = "10.5";
//		String product = "Twix";
//		vM.depositCoins(10.5);
//		vM.chooseProduct(product);
//		String actual = vM.balance();
//		assertEquals("Uncorrect coins are deposited", expected, actual);
//		
//	}

	@Test 
	public void chooseCorrectProduct() {
		String expected= "Snickers";
		vM.addProducts(expected, 3.0);
		vM.depositCoins(5.0);
		String actual = vM.chooseProduct(expected);
		assertEquals("Should be Snickers", expected, actual);
		
	}
	
	@Test
	public void chooseCaseSensitiveProduct() {
		vM.ejectCoinsBack();
		String expected= "snickers";
		vM.addProducts(expected, 3.0);
		vM.depositCoins(5.0);
		String actual = vM.chooseProduct(expected);
		assertEquals("Should be Snickers", expected, actual);
}
	@Test
	public void chooseUncorrectProduct() {
		vM.ejectCoinsBack();
		String expected= "No such product";
		vM.depositCoins(5.0);
		String actual = vM.chooseProduct("ololo");
		assertEquals("Should be null", expected, actual);
}
	@Test
	public void chooseProductNoBalance() {
		vM.ejectCoinsBack();
		vM.addProducts("Snickers", 2.5);
		String expected= "Balance not enough";
		vM.depositCoins(1.0);
		String actual = vM.chooseProduct("snickers");
		assertEquals("no money", expected, actual);
		
	}
	
//	@SuppressWarnings("deprecation")
//	@Test 
//	public void ejectCoinsBack() {
//		double money = 5.0;
//		vM.depositCoins(money);
//		vM.chooseProduct("Snickers");
//		double actual = vM.ejectCoinsBack();
//		double expected = 2.5;
//		assertEquals("Should be Snickers", expected, actual);
//	}
}
