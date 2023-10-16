

public class pizza {
	
	private int price;
	private Boolean veg;
	private int extraCheesePrice = 120;
	private int extraToppingsPrice = 180;
	private int bagpack = 40;
	private int originalPizzaPrice;
	private Boolean ExtraCheesAdded = false;
	private Boolean ExtraToppingAdded = false;
	private Boolean fortakeaway = false;
	
	public  pizza(Boolean veg) {
		this.veg = veg;
		if (this.veg){
			this.price = 300;
		}
		else
		{
			this.price = 400;
		}
		originalPizzaPrice= this.price;
	}
	
	public  void addextraCheese()
	{
		ExtraCheesAdded= true;
		this.price+=extraCheesePrice;
		
	}
	
	public void addextraToppings()
	{
		ExtraToppingAdded = true;
		this.price+=extraToppingsPrice;
	}
	public void takeAway()
	{
		fortakeaway = true;
		this.price+=bagpack;
		
	}
	
	public void getbill()
	{
		
		String bill = "";
		System.out.println("Pizza:" + originalPizzaPrice);
		if(ExtraCheesAdded)
		{
			bill += "Extra Cheese Added:" + extraCheesePrice + "\n";
		}
		if(ExtraToppingAdded)
		{
			bill += "Extra Toppings Added : " + extraToppingsPrice + "\n";
		}
		if(fortakeaway)
		{
			bill +="Take Away :" + bagpack  + "\n";
		}
		
		bill += "Total Amount :" + this.price + "\n";
		System.out.println(bill);
	}
	
}
