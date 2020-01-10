import ems.services.EmployeeServiceImpl;
import ems.services.EmployeeServiceImplService;

public class Main {

	public static void main(String[] args) {

		// call the webservice in server
		
		// wsdl url: http://localhost:8080/ems?wsdl
		
		// port could be regarded as an instance of webservice
		EmployeeServiceImpl webService = new EmployeeServiceImplService().getEmployeeServiceImplPort();
		
		System.out.println(webService.getEmployeeById(1).getName());
		
		

	}

}
