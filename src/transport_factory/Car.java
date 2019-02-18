package transport_factory;


public class Car extends Transport {
	private String salon;
	private int doorNumber;
	
	public String getSalon() {
		return salon;
	}

	public int getDoorNumber() {
		return doorNumber;
	}
	
	public static class CarBuilder{
		private Car newCar;
		
		public CarBuilder() {
			newCar = new Car();
		}
		
		public CarBuilder withName(String name) {
			newCar.name = name;
			return this;
		}
		
		public CarBuilder withDoorNumber(int doorNumber) {
			newCar.doorNumber = doorNumber;
			return this;
		}
		
		public CarBuilder withSalon(String salon) {
			newCar.salon = salon;
			return this;
		}

		public Car build(){
			return newCar;
		}
	}
}
