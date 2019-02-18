package transport_factory;


public class BoatFactory extends TransportFactory{
public static BoatFactory boatFactory = new BoatFactory();
	
	private BoatFactory() {}
	
	public static BoatFactory getBoatFactory() {
		if (boatFactory == null)
			boatFactory = new BoatFactory();
		return boatFactory;
	}
	
	public Transport createTransport() {
		return new Car();
	}
}
