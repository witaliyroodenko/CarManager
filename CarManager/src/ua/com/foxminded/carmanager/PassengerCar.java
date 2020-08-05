package ua.com.foxminded.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weihgt, Color color) {
		super(name, yearOfProduction, price, weihgt, color);
		// TODO Auto-generated constructor stub
	}
    @Override
	public boolean isEngineServiseNeeded() {
		if(distanceOnService<10000) {
			return true;
		}
		return false;
}
}