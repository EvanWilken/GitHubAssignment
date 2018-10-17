
public class MobilePhone {

	private String Manufacturer;
	private String Model;
	private String Price;
	private String Carrier;
	
	public MobilePhone(String manufacturer, String model, String price, String carrier)
	{
		
		Manufacturer = manufacturer;
		Model = model;
		Price = price;
		Carrier = carrier;
	}
	public String call(String number)
	{
		return "I am calling " + number;
	}
	public String message(String words)
	{
		return words;
	}

	public String toString() 
	{
		return "Manufacturer= " + Manufacturer + ",\nModel= " + Model + ",\nPrice= " + Price + ",\nCarrier= "
				+ Carrier;
	}
	
	
}
