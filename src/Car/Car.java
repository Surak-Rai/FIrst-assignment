package Car;

public class Car {
private String nameOfCar;
private boolean brakeApplied;
private int speed;
// Default construction;
public Car() {
}


	// Overloading Construction;
	public Car(String nameOfCar, boolean brakeApplied) {
		this.nameOfCar=nameOfCar;
		this.brakeApplied=brakeApplied;
		this.speed=0;
	}
	public Car(String nameOfCar, int speed) {
		this.nameOfCar=nameOfCar;
		this.brakeApplied=false;
		this.speed=speed;
	}
	public String getNameOfCar() {
		return nameOfCar;
	}
	public void setNameOFCar(String nameOfCar) {
		this.nameOfCar=nameOfCar;
	}
	public boolean getBreaksApplied() {
		return brakeApplied;
	}
		
	public void setbreakApplied(boolean brake) {
		this. brakeApplied=brake;
		// if we have applied brake , the car should stop.
		if(brakeApplied) {
			this.speed=0;
		}
		}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(brakeApplied) {
			System.out.println("Breaks are applied,Cannot run the car when brakes are on");
		}
		else {
			this.speed=speed;
			}
		}


	@Override
	public String toString() {
		return "Car [nameOfCar=" + nameOfCar + ", brakeApplied=" + brakeApplied + ", speed=" + speed + "]";
	}
		
			
}


