package insurance_factory;

public class OsagoFactory implements InsuranceFactoryInterface {
	private OsagoFactory() {}
	@Override
	public InsuranceInterface createInsurance(){
		return new Osago();
	}
}
