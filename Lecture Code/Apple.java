package classses;

public class Apple extends Fruit {

	private Integer acidity;

	public Apple(String color, Integer acidity) {
		super(color);
		this.acidity = acidity;
	}

	public Integer getAcidity() {
		return acidity;
	}

	public void setAcidity(Integer acidity) {
		this.acidity = acidity;
	}
	
	
}
