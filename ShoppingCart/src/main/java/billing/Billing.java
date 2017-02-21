package billing;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import billing.ItemInTheCart;
import billing.ItemRates;

public class Billing {

	public static Map<Integer, String> itemIndex = new HashMap<Integer, String>();

	public Billing() {
		indexTheItems();
	}

	public void printListOfItemsAdded(ArrayList<ItemInTheCart> cartItems) {
		System.out.println("List of items added to the cart:\n");
		int index = 0;
		System.out.print("[");
		for (ItemInTheCart cartItem : cartItems) {
			++index;
			if (index == 1) {
				System.out.print(cartItem.getProduct());
			} else {
				System.out.print("," + cartItem.getProduct());
			}
		}
		System.out.println("]");
	}

	public static double calculateTotalCost(ArrayList<ItemInTheCart> cartItems) {
		double total = 0.00;
		for (ItemInTheCart cartItemAdded : cartItems) {
			total = total + cartItemAdded.getPrice();
		}
		return total;
	}

	public static double calculateTotalCostWithBananaOffer(
			ArrayList<ItemInTheCart> cartItems) {
		double total = 0.00;
		ArrayList<String> itemNameList = new ArrayList<String>();
		for (ItemInTheCart cartItem : cartItems) {
			itemNameList.add(cartItem.getProduct());
		}
		int numberOfApples = Collections.frequency(itemNameList, "Apple");
		int numberOfOranges = Collections.frequency(itemNameList, "Orange");
		int numberOfMelons = Collections.frequency(itemNameList, "Melon");
		int numberOfBananas = Collections.frequency(itemNameList, "Banana");

		double totalForBananasWithAppleOffer = 0.0;

		// Banana & Apples
		if (numberOfBananas < numberOfApples) {
			int countOfApplesRemaining = numberOfApples - numberOfBananas;
			numberOfApples = countOfApplesRemaining;
			totalForBananasWithAppleOffer = numberOfBananas * 0.6;
			numberOfBananas = 0;
		} else if (numberOfBananas > numberOfApples) {
			int countOfBananasRemaining = numberOfBananas - numberOfApples;
			totalForBananasWithAppleOffer = numberOfApples * 0.6;
			numberOfApples = 0;
			numberOfBananas = countOfBananasRemaining;
		} else {
			totalForBananasWithAppleOffer = numberOfApples * 0.6;
			numberOfApples = 0;
			numberOfBananas = 0;
		}

		// Remaining bananas calculation
		if (numberOfBananas % 2 == 0) {
			numberOfBananas = numberOfBananas / 2;
		} else {
			numberOfBananas = (numberOfBananas + 1) / 2;
		}

		totalForBananasWithAppleOffer = totalForBananasWithAppleOffer
				+ (numberOfBananas * 0.2);

		// Remaining apples calculation
		if (numberOfApples % 2 == 0) {
			numberOfApples = numberOfApples / 2;
		} else {
			numberOfApples = (numberOfApples + 1) / 2;
		}

		// Oranges
		if ((numberOfOranges + 1) % 3 == 0) {
			numberOfOranges = ((numberOfOranges + 1) / 3) * 2;
		}

		else if ((numberOfOranges + 2) % 3 == 0) {
			numberOfOranges = (((numberOfOranges + 2) / 3) * 2) - 1;
		} else if (numberOfOranges % 3 == 0) {
			numberOfOranges = (numberOfOranges / 3) * 2;
		}

		// Melons
		if ((numberOfMelons + 1) % 3 == 0) {
			numberOfMelons = ((numberOfMelons + 1) / 3) * 2;
		}

		else if ((numberOfMelons + 2) % 3 == 0) {
			numberOfMelons = (((numberOfMelons + 2) / 3) * 2) - 1;
		} else if (numberOfMelons % 3 == 0) {
			numberOfMelons = (numberOfMelons / 3) * 2;
		}

		double totalForMelons = numberOfMelons * 1.0;
		double totalForApples = numberOfApples * 0.6;
		double totalForOranges = numberOfOranges * 0.25;
		total = totalForApples + totalForOranges + totalForMelons
				+ totalForBananasWithAppleOffer;
		return total;
	}

	public static double calculateTotalCostWithOffer(
			ArrayList<ItemInTheCart> cartItems) {
		double total = 0.00;
		ArrayList<String> itemNameList = new ArrayList<String>();
		for (ItemInTheCart cartItem : cartItems) {
			itemNameList.add(cartItem.getProduct());
		}
		int numberOfApples = Collections.frequency(itemNameList, "Apple");
		int numberOfOranges = Collections.frequency(itemNameList, "Orange");
		int numberOfMelons = Collections.frequency(itemNameList, "Melon");
		int numberOfBananas = Collections.frequency(itemNameList, "Banana");

		// Banana
		if (numberOfBananas == numberOfApples) {

		}

		// Apples
		if (numberOfApples % 2 == 0) {
			numberOfApples = numberOfApples / 2;
		} else {
			numberOfApples = (numberOfApples + 1) / 2;
		}

		// Oranges
		if ((numberOfOranges + 1) % 3 == 0) {
			numberOfOranges = ((numberOfOranges + 1) / 3) * 2;
		}

		else if ((numberOfOranges + 2) % 3 == 0) {
			numberOfOranges = (((numberOfOranges + 2) / 3) * 2) - 1;
		} else if (numberOfOranges % 3 == 0) {
			numberOfOranges = (numberOfOranges / 3) * 2;
		}

		// Melons
		if ((numberOfMelons + 1) % 3 == 0) {
			numberOfMelons = ((numberOfMelons + 1) / 3) * 2;
		}

		else if ((numberOfMelons + 2) % 3 == 0) {
			numberOfMelons = (((numberOfMelons + 2) / 3) * 2) - 1;
		} else if (numberOfMelons % 3 == 0) {
			numberOfMelons = (numberOfMelons / 3) * 2;
		}

		double totalForMelons = numberOfMelons * 1.0;
		double totalForApples = numberOfApples * 0.6;
		double totalForOranges = numberOfOranges * 0.25;
		total = totalForApples + totalForOranges + totalForMelons;
		// total = (double)Math.round (total);
		return total;
	}

	public static void indexTheItems() {
		int index = 0;
		for (Items item : Items.values()) {
			itemIndex.put(++index, item.toString());
		}
	}

	public String getItemsListIndexedString() {
		String itemsListIndexed = "";
		int index = 0;
		for (Items item : Items.values()) {
			itemsListIndexed = itemsListIndexed + " " + ++index + "."
					+ item.toString() + " ";
		}
		return itemsListIndexed;
	}

	/**
	 * Offer a menu of options: 
	 * 1 add item to your cart 
	 * 2 view the items in your cart 
	 * 3 end shopping and view total 
	 * 4 exit the program Use the
	 * Scanner class to collect input
	 */
	public static void main(String[] args) {
		Billing billing = new Billing();
		ItemRates itemRates = new ItemRates();
		Map<String, Double> itemRate = new HashMap<String, Double>();
		itemRate = itemRates.getRates();
		ArrayList<ItemInTheCart> cartItems = new ArrayList<ItemInTheCart>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;
		int choice = 0;
		int input = 0;
		int index = 0;
		double total = 0;
		Integer item;

		while (keepGoing) {
			System.out.println("\nSelect one of following operations");
			System.out.println("1 Add item");
			System.out.println("2 View the items in your cart");
			System.out.println("3 End shopping and view total ");
			System.out.println("4 Exit");
			System.out.println("Select a menu option");
			choice = scan.nextInt();
			if (choice < 1 || choice > 4) {
				System.out.println("Enter a value between 1 and 4:");
			} else {
				switch (choice) {
				case 1:
					// add an integer
					System.out.println("Select an item:");
					System.out.println(billing.getItemsListIndexedString());
					input = scan.nextInt();
					String itemName = itemIndex.get(input);
					ItemInTheCart cartItem = new ItemInTheCart(itemName,
							itemRate.get(itemName));
					cartItems.add(cartItem);
					total = calculateTotalCostWithBananaOffer(cartItems);
					System.out.println("Total:" + total);
					break;
				case 2:
					// view the items in your cart
					billing.printListOfItemsAdded(cartItems);
					break;
				case 3:
					total = calculateTotalCostWithBananaOffer(cartItems);
					System.out.println("Total is " + total);
					System.out.println("Exiting");
					keepGoing = false;
					break;
				case 4:
					// exit
					keepGoing = false;
					System.out.println("Exiting");
					break;

				}
			}
		}
	}
}
