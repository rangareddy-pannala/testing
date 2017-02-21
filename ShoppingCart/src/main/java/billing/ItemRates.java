package billing;

import java.util.HashMap;
import java.util.Map;
import billing.Items;

public class ItemRates { 
	public Map<String, Double> itemValue = new HashMap<String, Double>();
	
	public ItemRates(){
		itemValue.put(Items.Apple.toString(),0.60);
		itemValue.put(Items.Orange.toString(),0.25);
		itemValue.put(Items.Melon.toString(),1.00);
		itemValue.put(Items.Banana.toString(),0.20);
	}
	
	public Map<String, Double> getRates(){
		return itemValue;
	}
}
