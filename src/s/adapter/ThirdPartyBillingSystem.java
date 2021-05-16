package s.adapter;

public class ThirdPartyBillingSystem {

	private Target employeeSource;

	public ThirdPartyBillingSystem(Target employeeSource) {
		this.employeeSource = employeeSource;
	}

	public void showEmployeeList() {
		for (String element : employeeSource.getEmployeeList()) {
			System.out.println(element);
		}
	}

}
