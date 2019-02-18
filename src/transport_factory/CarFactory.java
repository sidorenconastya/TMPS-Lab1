package transport_factory;


public class CarFactory extends TransportFactory{
	private static CarFactory carFactory = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getCarFactory() {
		if (carFactory == null)
			carFactory = new CarFactory();
		return carFactory;
	}
	public Transport createTransport() {
		return new Car();
	}
	
}
