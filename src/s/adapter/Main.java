package s.adapter;

public class Main {
	public static void main(String[] args) {
		Target target = new EmployeeAdapter();
		var client = new ThirdPartyBillingSystem(target);
		client.showEmployeeList();
	}
}
