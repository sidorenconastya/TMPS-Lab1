package insurance_factory;

public class RcaFactory implements InsuranceFactoryInterface {
	private RcaFactory() {}
	@Override
	public InsuranceInterface createInsurance(){
		return new Rca();
	}
}
