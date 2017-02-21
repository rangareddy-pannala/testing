package billing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import billing.*;

public class BillingTest {
	
	@Test
	public void checkIfCalculatedTotalCostIsCorrect1(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem2 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem3 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		ItemInTheCart cartItem4 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		cartItems.add(cartItem1);
		cartItems.add(cartItem2);
		cartItems.add(cartItem3);
		cartItems.add(cartItem4);
		double total = billing.calculateTotalCost(cartItems);
		if(total == 2.05) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedTotalCostIsCorrect2(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		cartItems.add(cartItem1);
		double total = billing.calculateTotalCost(cartItems);
		if(total == 0.60) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedTotalCostIsCorrect3(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		cartItems.add(cartItem1);
		double total = billing.calculateTotalCost(cartItems);
		if(total == 0.25) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedCostIsCorrectInOfferTime(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem2 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem3 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		cartItems.add(cartItem1);
		cartItems.add(cartItem2);
		cartItems.add(cartItem3);
		double total = billing.calculateTotalCostWithOffer(cartItems);
		if(total == 0.85) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedCostIsCorrectInOfferTime2(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		ItemInTheCart cartItem2 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		ItemInTheCart cartItem3 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		cartItems.add(cartItem1);
		cartItems.add(cartItem2);
		cartItems.add(cartItem3);
		double total = billing.calculateTotalCostWithOffer(cartItems);
		if(total == 0.50) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedCostIsCorrectInOfferTime3(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Melon.toString(),itemValue.get(Items.Melon.toString()));
		ItemInTheCart cartItem2 = new ItemInTheCart(Items.Melon.toString(),itemValue.get(Items.Melon.toString()));
		ItemInTheCart cartItem3 = new ItemInTheCart(Items.Melon.toString(),itemValue.get(Items.Melon.toString()));
		cartItems.add(cartItem1);
		cartItems.add(cartItem2);
		cartItems.add(cartItem3);
		double total = billing.calculateTotalCostWithOffer(cartItems);
		if(total == 2.00) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedCostIsCorrectInOfferTimeWithBanana(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem2 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem3 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		ItemInTheCart cartItem4 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem5 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem6 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		cartItems.add(cartItem1);
		cartItems.add(cartItem2);
		cartItems.add(cartItem3);
		cartItems.add(cartItem4);
		cartItems.add(cartItem5);
		cartItems.add(cartItem6);
		double total = billing.calculateTotalCostWithBananaOffer(cartItems);
		if(total == 1.70) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedCostIsCorrectInOfferTimeWithBanana2(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem2 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem3 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		ItemInTheCart cartItem4 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem5 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem6 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem7 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		cartItems.add(cartItem1);
		cartItems.add(cartItem2);
		cartItems.add(cartItem3);
		cartItems.add(cartItem4);
		cartItems.add(cartItem5);
		cartItems.add(cartItem6);
		cartItems.add(cartItem7);
		double total = billing.calculateTotalCostWithBananaOffer(cartItems);
		if(total == 1.65) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void checkIfCalculatedCostIsCorrectInOfferTimeWithBanana3(){
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		Map<String, Double> itemValue = new HashMap<String, Double>();
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		itemValue=itemRates.getRates();
		ItemInTheCart cartItem1 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem2 = new ItemInTheCart(Items.Apple.toString(),itemValue.get(Items.Apple.toString()));
		ItemInTheCart cartItem3 = new ItemInTheCart(Items.Orange.toString(),itemValue.get(Items.Orange.toString()));
		ItemInTheCart cartItem4 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem5 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem6 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem7 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem8 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem9 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		ItemInTheCart cartItem10 = new ItemInTheCart(Items.Banana.toString(),itemValue.get(Items.Banana.toString()));
		cartItems.add(cartItem1);
		cartItems.add(cartItem2);
		cartItems.add(cartItem3);
		cartItems.add(cartItem4);
		cartItems.add(cartItem5);
		cartItems.add(cartItem6);
		cartItems.add(cartItem7);
		cartItems.add(cartItem8);
		cartItems.add(cartItem9);
		cartItems.add(cartItem10);
		double total = billing.calculateTotalCostWithBananaOffer(cartItems);
		if(total == 2.05) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
}