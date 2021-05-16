package s.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter extends HRSystem implements Target {

	@Override
	public List<String> getEmployeeList() {
		List<String> employeeList = new ArrayList<>();
		String[][] employees = getEmployees();
		for (String[] employee : employees) {
			employeeList.add(employee[0]);
			employeeList.add(",");
			employeeList.add(employee[1]);
			employeeList.add(",");
			employeeList.add(employee[2]);
			employeeList.add("\n");
		}

		return employeeList;
	}

}
