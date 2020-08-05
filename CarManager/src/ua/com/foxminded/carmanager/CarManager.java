package ua.com.foxminded.carmanager;

public class CarManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Car Toyota = new PassengerCar ("Toyota Priys", 2008, 15000,1200, Color.BLUE);
Car Audi = new PassengerCar ("Toyota Priys", 2008, 15000,1200, Color.BLUE);
Car Renault = new Bus ("Laguna", 2006, 12000,1800, Color.RER );



Audi.addDistance(300);
Audi.distanceOnService(5000);
System.out.println(Audi.getDistance() + " killometers");
System.out.println(Audi.isEngineServiseNeeded());
System.out.println(Toyota);
System.out.println(Renault);
System.out.println(Audi);


//System.out.println(Renault.equals(Audi));
//System.out.println(Renault.equals(Toyota));


	}
	
	

}
