import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublicSoap = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
				customer.getLastName(), customer.getDateOfBirh());
		
		return result;
	}

}
