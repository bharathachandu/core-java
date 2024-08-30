import java.util.Arrays;
class BlinkIt
{
	 static String[] itemNames = new String[]{null, null, null, null, null, null, null, null, null, null};
    static int index;

	BlinkIt()
	{
	}
	
	public static boolean addItemName(String item) {
        System.out.println("The add Item method Started");
        boolean isAdded = false;
        if (index < itemNames.length) 
		{
            if (item != null) {
                itemNames[index] = item;
                ++index;
                isAdded = true;
            } 
			else
			{
                System.out.println("The Item is null");
            }
        } 
		else
		{
            System.out.println("The cart is Already Full");
        }

        System.out.println("The add item method Ended");
        return isAdded;
    }
	
	
	public static void getItemNames() {
        System.out.println("The Available Items Are");
		System.out.println();
        String[] item = itemNames;
        int total = item.length;

        for(int i = 0; i < total; ++i) {
            String name = item[i];
            System.out.println(name);
        }

    }
	
		public static boolean updateItemName(String oldItem, String newItem) {
        System.out.println("Update method Started");
        boolean isUpdated = false;

        for(int i = 0; i < itemNames.length; ++i) 
		{
            if (oldItem == itemNames[i]) 
			{
                itemNames[i] = newItem;
                isUpdated = true;
				System.out.println("The updated element is "+newItem);
            }
        }

        if (!isUpdated) {
            System.out.println(oldItem + "Not Found");
        }

        System.out.println("Update method Ended");
        return isUpdated;
		}
		
		public static boolean deleteItemNames(String itemToBeDeleted) {
        System.out.println("The DeleteItem method Started");
        boolean isDeleted = false;
        int oldIndex,newIndex;
		 for(oldIndex = 0,newIndex =0 ;oldIndex < itemNames.length;oldIndex++){
			 if(itemNames[oldIndex]!=itemToBeDeleted){
				 itemNames[newIndex]=itemNames[oldIndex];
				 newIndex++;
			 }
		 }

        itemNames = (String[])Arrays.copyOf(itemNames,newIndex);
        if (itemNames != null) {
            isDeleted = true;
			System.out.println("The deleted element is "+itemToBeDeleted);
        }

        if (!isDeleted) {
            System.out.println("not found" + itemToBeDeleted);
        }

        System.out.println("The DeleteItem Method Started");
        return isDeleted;
    }

	 
	
}
