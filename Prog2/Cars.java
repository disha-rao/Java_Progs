package cars;

public class Cars 
{
	// instance members
    private String brand;   // brand
    private String model; // model
    private double price;  // price
    private double mileage;  // mileage
    private String ownerName; // ownerName
    
    // static members
    private static int totalcars;          // totalCars
    private static String showroomName = "United Motors" ;

    // constructor 1
    public Cars(String b, String m, double p, double mil) {
      brand =b ; // initialize brand
      model=m  ; // initialize model
      price=p ; // initialize price
      mileage=mil; // initialize mileage
      ownerName = "Not Assigned";
      totalcars++;
    }
    // constructor 2 (overloaded)
    public Cars(String b, String m, double p, double mil, String owner) {
    	brand =b ; // initialize brand
        model=m  ; // initialize model
        price=p ; // initialize price
        mileage=mil; // initialize mileage
        this.ownerName = owner;
       totalcars++;
    }
    // getter & setter for ownerName
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String owner) {
    	ownerName = owner;
    }
      
    // instance method
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Mileage:" + mileage);
        System.out.println("Owner: " + ownerName);
    }
    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    // static methods
    public static void showTotalCars() {
        System.out.println("Total Cars: " + totalcars);
    }

    public static void showShowroomName() {
        System.out.println("Showroom: " + showroomName);
    }
}
	

	


