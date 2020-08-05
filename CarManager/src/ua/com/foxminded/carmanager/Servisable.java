package ua.com.foxminded.carmanager;

public interface Servisable {
	
	public  abstract boolean isEngineServiseNeeded();
	
	public void addDistance (int newDistance);
	
	public void distanceOnService (int newDistance);
	
	public int getDistanceOnService();
	
	
	

}
