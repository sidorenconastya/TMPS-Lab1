package transport_factory;


public class Boat extends Transport{
	private String boatMotor;
	private int height;
	
	public String getBoatMotor() {
		return boatMotor;
	}

	public int getHeight() {
		return height;
	}
	
	public static class BoatBuilder{
		private Boat newBoat;
		
		public BoatBuilder() {
			newBoat = new Boat();
		}
		
		public BoatBuilder withName(String name) {
			newBoat.name = name;
			return this;
		}
		
		public BoatBuilder withHeight(int height) {
			newBoat.height = height;
			return this;
		}
		
		public BoatBuilder withBoatMotor(String boatMotor) {
			newBoat.boatMotor = boatMotor;
			return this;
		}

		public Boat build(){
			return newBoat;
		}
	}

}
