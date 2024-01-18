public class Car 
{
	private String model;
	private String brand;
	private String colour;
	private int horsepower;
	private double price;
	private int age;
	private boolean forSale;
	public Car()
	{
		model = "Unknown";
		brand = "Honda";
		colour = "Unknown";
		horsepower = 0;
		price = 0;
		age = 0;
		forSale = false;
	}//end Default Constructor
	public Car(String model, String brand, String colour, int horsepower, double price, int age, boolean forSale)
	{
		this.model = model;
		this.brand = brand;
		this.colour = colour;
		this.horsepower = horsepower;
		this.price = price;
		this.age = age;
		this.forSale = forSale;
	}//end Regular Constructor
	public Car(String colour, int age, boolean forSale)
	{
		model = "Civic";
		brand = "Honda";
		this.colour = colour;
		price = 1999.99;
		this.age = age;
		this.forSale = forSale;
	}//end Regular Constructor 2
	public void setModel(String model)
	{
		this.model=model;
	}//end setModel
	public void setBrand(String brand)
	{
		this.brand=brand;
	}//end setBrand()
	public void setColour(String colour)
	{
		this.colour=colour;
	}//end setColour()
	public void setHorsepower(int horsepower)
	{
		this.horsepower=horsepower;
	}//end setHorsepower()
	public void setPrice(double price)
	{
		this.price=price;
	}//end setPrice()
	public void setAge(int age)
	{
		this.age = age;
	}//end setAge()
	public void setForSale(boolean forSale)
	{
		this.forSale = forSale;
	}//end setForSale()
	public String getModel()
	{
		return model;
	}//end getModel()
	public String getBrand()
	{
		return brand;
	}//end getBrand()
	public String getColour()
	{
		return colour;
	}//end getColour()
	public int getHorsepower()
	{
		return horsepower;
	}//end getHorsepower()
	public double getPrice()
	{
		return price;
	}//end getPrice()
	public int getAge()
	{
		return age;
	}//end getAge()
	public boolean getForSale()
	{
		return forSale;
	}//end getForSale()
	public void drive()
	{
		System.out.println("The " + brand + " " + model + " drives away.");
	}//end drive()
	public void brake()
	{
		System.out.println("The " + brand + " " + model + " hits the brakes.");
	}//end brake()
	public String toString()
	{
		return "Model: " + model +
			   "\nBrand: " + brand +
			   "\nColour: " + colour +
			   "\nHorsepower: " + horsepower +
			   "\nPrice: " + price +
			   "\nAge: " + age +
			   "\n" + (forSale==true?"Car is for sale.":"Car is not for sale.") + "\n";
	}//end toString()
}//end class