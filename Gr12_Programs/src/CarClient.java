public class CarClient 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		Car newCar = new Car();
		Car charger = new Car("Charger", "Dodge", "Grey", 69, 56000, 2, true);
		Car civic = new Car("White", 3, false);
		System.out.println(newCar);
		System.out.println(charger);
		System.out.println(civic);
		civic.brake();
		charger.drive();
		charger.setForSale(false);
		System.out.println(charger);
		civic.getAge();
	}//end main()
}//end class
