package billing;

import billing.Items;
public class ClassToTest {

	public String getItemsListIndexed() {
		String itemsListIndexed="";
		int index=0;
		for(Items item:Items.values()){
			itemsListIndexed = itemsListIndexed+"\n"+ ++index +"."+item.toString()+"\n";
		}
		return itemsListIndexed;
	}

}
