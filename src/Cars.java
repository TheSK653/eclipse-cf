package src;

public class Cars {
	int price;
	int speed;
	String color;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	public String toString() {
		return "P "+ price+" S "+ speed+" C "+color;
	
	}

}
