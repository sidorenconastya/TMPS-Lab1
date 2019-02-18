import transport_factory.BoatFactory;
import transport_factory.CarFactory;
import transport_factory.Transport;
import transport_factory.TransportFactory;

public class Example {

	public static void main(String[] args) {
		TransportFactory myBoatFactory = new BoatFactory();
		TransportFactory myCarFactory = new CarFactory();
		
		Transport myBoat = myBoatFactory.createTransport();
		Transport myCar = myCarFactory.createTransport();
		
	}

}
