
package Item;

public class Item {
	
	String itemid;
	String name;
	int cost;
	Item(String itemid,String name,int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
		public void disp()
		{
			System.out.println("itemid = "+itemid+" "+"name = "+name+" "+"cost = "+cost);
		}

public static void main(String[] args) {
	Item ref=new Item("007","Sugar",40);
	ref.disp();
}
}
