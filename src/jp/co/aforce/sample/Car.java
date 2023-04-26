package jp.co.aforce.sample;

public class Car {
	private int speed = 0;
	
	protected int getMaxSpeed() {
		return 180;
	}
	
	public void speedUp() {
		this.speed += 10;
		if(this.speed > getMaxSpeed()) {
			this.speed = getMaxSpeed();
		}
	}
	
	public void speedDown() {
		this.speed -= 10;
		if(this.speed < 0) {
			this.speed = 0;
		}
	}
}
