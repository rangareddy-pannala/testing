package billing;

import java.util.ArrayList;
import java.util.List;

public enum Items {
		Apple,
		Orange,
		Melon,
		Banana;
		
	List<String> itemsList = new ArrayList<String>();
	
	public List<String> getItemsList() {
		for(Items item:Items.values()){
			itemsList.add(item.toString());
		}
		return itemsList;
	}
}