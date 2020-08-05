package ua.com.foxminded.carmanager;

public class Bus extends Car {

	/**
	 * @param name
	 * @param yearOfProduction
	 * @param price
	 * @param weihgt
	 * @param color
	 */
	public Bus(String name, int yearOfProduction, int price, int weihgt, Color color) {
		super(name, yearOfProduction, price, weihgt, color);
		// TODO Auto-generated constructor stub
	}
	@Override
  public boolean isEngineServiseNeeded() {
		if(distanceOnService<100000) {
			return true;
		}
		return false;

}
}