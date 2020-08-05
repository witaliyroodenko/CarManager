package ua.com.foxminded.carmanager;

public abstract  class Car implements Servisable {
String name;
int yearOfProduction;
int price;
int weihgt;
Color color;
private int distanceOnSelling = 0;
int distanceOnService;

public Car(String name, int yearOfProduction, int price, int weihgt, Color color) {
	super();
	this.name = name;
	this.yearOfProduction = yearOfProduction;
	this.price = price;
	this.weihgt = weihgt;
	this.color = color;
}

public void addDistance (int newDistance) {
	distanceOnSelling+=newDistance;
}

public void distanceOnService (int newDistance) {
	distanceOnService += newDistance;
}


public int getDistance() {
	return distanceOnSelling;
}

public int getDistanceOnService() {
	return distanceOnService;
}

@Override
public String toString() {
	return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weihgt=" + weihgt
			+ ", color=" + color + ", distanceOnSelling=" + distanceOnSelling + ", distanceOnService="
			+ distanceOnService + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + price;
	result = prime * result + weihgt;
	result = prime * result + yearOfProduction;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	if (color != other.color)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (price != other.price)
		return false;
	if (weihgt != other.weihgt)
		return false;
	if (yearOfProduction != other.yearOfProduction)
		return false;
	return true;
}


}

